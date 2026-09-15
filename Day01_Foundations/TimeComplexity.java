/**
 * ============================================================
 * DAY 1 — TIME COMPLEXITY ANALYSIS
 * ============================================================
 * 
 * Covers: Big-O, Big-Ω, Big-Θ with Java-specific benchmarking.
 * 
 * Key Java vs C Differences:
 *   - Use System.nanoTime() instead of clock()
 *   - JVM warmup can skew initial measurements
 *   - JIT compiler may optimize away dead code — always "use" the result
 * 
 * Time Complexities Demonstrated:
 *   O(1), O(log n), O(n), O(n log n), O(n²), O(2ⁿ)
 * ============================================================
 */
public class TimeComplexity {

    // ==================== O(1) — Constant Time ====================
    // Accessing an array element by index, hash map lookup
    public static int constantTime(int[] arr, int index) {
        return arr[index]; // Single operation, independent of input size
    }

    // ==================== O(log n) — Logarithmic Time ====================
    // Binary search: halving the search space each step
    public static int logarithmicTime(int[] sortedArr, int target) {
        int lo = 0, hi = sortedArr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2; // Avoids integer overflow (unlike (lo+hi)/2)
            if (sortedArr[mid] == target) return mid;
            else if (sortedArr[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    // ==================== O(n) — Linear Time ====================
    // Linear search: scan every element once
    public static int linearTime(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // ==================== O(n log n) — Linearithmic Time ====================
    // Merge Sort
    public static void nLogNTime(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        nLogNTime(arr, left, mid);       // T(n/2)
        nLogNTime(arr, mid + 1, right);  // T(n/2)
        merge(arr, left, mid, right);    // O(n)
        // Recurrence: T(n) = 2T(n/2) + O(n) → O(n log n) by Master Theorem
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        // Copy both sorted halves into a temporary array, then write them back.
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    // ==================== O(n²) — Quadratic Time ====================
    // Bubble Sort: nested loops
    public static void quadraticTime(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {          // n iterations
            for (int j = 0; j < n - i - 1; j++) {  // n-i-1 iterations
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ==================== O(2ⁿ) — Exponential Time ====================
    // Naive recursive Fibonacci
    public static long exponentialTime(int n) {
        if (n <= 1) return n;
        return exponentialTime(n - 1) + exponentialTime(n - 2);
        // T(n) = T(n-1) + T(n-2) + O(1) → O(2ⁿ)
    }

    // ==================== BENCHMARK UTILITY ====================
    /**
     * Runs a task and returns elapsed time in milliseconds.
     * Performs JVM warmup runs to avoid JIT compilation skew.
     */
    public static double benchmark(Runnable task, int warmupRuns) {
        // Warmup: let JIT compiler optimize the code path
        for (int i = 0; i < warmupRuns; i++) {
            task.run();
        }

        long start = System.nanoTime();
        task.run();
        long end = System.nanoTime();

        return (end - start) / 1_000_000.0; // Convert to milliseconds
    }

    // ==================== MAIN — DEMO & BENCHMARKS ====================
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║        TIME COMPLEXITY DEMONSTRATIONS        ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        // --- O(1) Demo ---
        int[] sampleArr = {10, 20, 30, 40, 50};
        System.out.println("O(1) — Array access: arr[2] = " + constantTime(sampleArr, 2));

        // --- O(log n) Demo ---
        int[] sorted = new int[1_000_000];
        for (int i = 0; i < sorted.length; i++) sorted[i] = i * 2;
        int idx = logarithmicTime(sorted, 999_998);
        System.out.println("O(log n) — Binary Search found 999998 at index: " + idx);

        // --- O(n) Demo ---
        int linIdx = linearTime(sorted, 999_998);
        System.out.println("O(n) — Linear Search found 999998 at index: " + linIdx);

        // --- Benchmark comparison for increasing n ---
        System.out.println("\n--- Benchmarks (time in ms) ---");
        int[] sizes = {1_000, 10_000, 100_000};

        for (int n : sizes) {
            int[] data = new int[n];
            // Use random input so each sorting benchmark processes unsorted data.
            for (int i = 0; i < n; i++) data[i] = (int) (Math.random() * n);

            // O(n log n) — Merge Sort
            int[] copy1 = data.clone();
            double msNLogN = benchmark(() -> nLogNTime(copy1, 0, copy1.length - 1), 2);

            // O(n²) — Bubble Sort (only for small n)
            double msN2 = -1;
            if (n <= 10_000) {
                int[] copy2 = data.clone();
                msN2 = benchmark(() -> quadraticTime(copy2), 1);
            }

            System.out.printf("n = %,7d  |  MergeSort: %.3f ms  |  BubbleSort: %s%n",
                    n, msNLogN, msN2 >= 0 ? String.format("%.3f ms", msN2) : "skipped (too slow)");
        }

        // --- O(2ⁿ) Demo ---
        System.out.println("\n--- O(2^n) Fibonacci ---");
        for (int n = 10; n <= 40; n += 10) {
            // Measure how repeated recursive calls increase as n becomes larger.
            long start = System.nanoTime();
            long result = exponentialTime(n);
            double elapsed = (System.nanoTime() - start) / 1_000_000.0;
            System.out.printf("fib(%d) = %d  |  Time: %.3f ms%n", n, result, elapsed);
        }

        // === SUMMARY TABLE ===
        System.out.println("\n╔═══════════════════════════════════════════════════╗");
        System.out.println("║           COMPLEXITY SUMMARY TABLE                 ║");
        System.out.println("╠═══════════════════════════════════════════════════╣");
        System.out.println("║ Notation   │ Name           │ Example             ║");
        System.out.println("╠═══════════════════════════════════════════════════╣");
        System.out.println("║ O(1)       │ Constant       │ Array index access  ║");
        System.out.println("║ O(log n)   │ Logarithmic    │ Binary Search       ║");
        System.out.println("║ O(n)       │ Linear         │ Linear Search       ║");
        System.out.println("║ O(n log n) │ Linearithmic   │ Merge Sort          ║");
        System.out.println("║ O(n²)      │ Quadratic      │ Bubble Sort         ║");
        System.out.println("║ O(2ⁿ)      │ Exponential    │ Naive Fibonacci     ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");

        System.out.println("\n--- Asymptotic Notation ---");
        System.out.println("Big-O  (Upper Bound) : f(n) ≤ c·g(n)  for n ≥ n₀  → Worst case");
        System.out.println("Big-Ω  (Lower Bound) : f(n) ≥ c·g(n)  for n ≥ n₀  → Best case");
        System.out.println("Big-Θ  (Tight Bound) : c₁·g(n) ≤ f(n) ≤ c₂·g(n)  → Average case");
    }
}
