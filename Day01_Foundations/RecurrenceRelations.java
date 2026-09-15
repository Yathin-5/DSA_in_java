/**
 * ============================================================
 * DAY 1 — RECURRENCE RELATIONS
 * ============================================================
 * 
 * Covers: Master Theorem, solving recurrences, recursive vs
 *         iterative implementations with complexity proofs.
 * 
 * Master Theorem: T(n) = aT(n/b) + O(n^d)
 *   Case 1: d < log_b(a) → T(n) = O(n^(log_b(a)))
 *   Case 2: d = log_b(a) → T(n) = O(n^d · log n)
 *   Case 3: d > log_b(a) → T(n) = O(n^d)
 * ============================================================
 */
public class RecurrenceRelations {

    // ==================== T(n) = T(n-1) + O(1) → O(n) ====================
    /**
     * Linear recursion: each call does O(1) work, makes 1 recursive call
     * Recurrence: T(n) = T(n-1) + c
     * Solution: T(n) = cn = O(n)
     */
    public static int sumRecursive(int n) {
        if (n <= 0) return 0;
        return n + sumRecursive(n - 1);
    }

    // ==================== T(n) = T(n-1) + O(n) → O(n²) ====================
    /**
     * Selection Sort recurrence:
     * T(n) = T(n-1) + O(n)
     * Solution: T(n) = n + (n-1) + ... + 1 = n(n+1)/2 = O(n²)
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) { // O(n-i) work per call
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    // ==================== T(n) = 2T(n/2) + O(n) → O(n log n) ====================
    /**
     * Merge Sort:
     * T(n) = 2T(n/2) + O(n)
     * Master Theorem: a=2, b=2, d=1 → log_b(a) = 1 = d → Case 2
     * Solution: T(n) = O(n log n)
     */
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right)
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    // ==================== T(n) = 2T(n/2) + O(1) → O(n) ====================
    /**
     * Binary tree traversal:
     * T(n) = 2T(n/2) + O(1)
     * Master Theorem: a=2, b=2, d=0 → log_b(a) = 1 > 0 = d → Case 1
     * Solution: T(n) = O(n^(log_2(2))) = O(n)
     */
    public static int countNodes(int n) {
        if (n <= 0) return 0;
        return 1 + countNodes(n / 2) + countNodes(n / 2);
    }

    // ==================== T(n) = T(n/2) + O(1) → O(log n) ====================
    /**
     * Binary Search:
     * T(n) = T(n/2) + O(1)
     * Master Theorem: a=1, b=2, d=0 → log_b(a) = 0 = d → Case 2
     * Solution: T(n) = O(log n)
     */
    public static int binarySearch(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    // ==================== T(n) = T(n-1) + T(n-2) + O(1) → O(2ⁿ) ====================
    /**
     * Naive Fibonacci:
     * T(n) = T(n-1) + T(n-2) + O(1)
     * This is NOT Master Theorem (unequal subproblems)
     * Solution by recursion tree: O(2ⁿ) [more precisely O(φⁿ) where φ ≈ 1.618]
     */
    public static long fibNaive(int n) {
        if (n <= 1) return n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    /**
     * Memoized Fibonacci:
     * Each subproblem computed only once → O(n) time, O(n) space
     */
    public static long fibMemo(int n, long[] memo) {
        if (n <= 1) return n;
        if (memo[n] != -1) return memo[n];
        memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        return memo[n];
    }

    // ==================== T(n) = 3T(n/4) + O(n²) → O(n²) ====================
    /**
     * Example for Master Theorem Case 3:
     * a=3, b=4, d=2 → log_b(a) = log_4(3) ≈ 0.79 < 2 = d
     * Case 3: T(n) = O(n²)
     * The O(n²) work at each level dominates.
     */
    public static long masterCase3(int n) {
        if (n <= 1) return 1;
        // O(n²) work
        long sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                sum += i + j;
        // 3 recursive calls on n/4
        return sum + masterCase3(n / 4) + masterCase3(n / 4) + masterCase3(n / 4);
    }

    // ==================== MAIN ====================
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║        RECURRENCE RELATIONS & MASTER THEOREM  ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        // --- T(n) = T(n-1) + O(1) → O(n) ---
        System.out.println("T(n) = T(n-1) + O(1): Sum(10) = " + sumRecursive(10));

        // --- T(n) = 2T(n/2) + O(n) → O(n log n) ---
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("T(n) = 2T(n/2) + O(n): MergeSort = " + java.util.Arrays.toString(arr));

        // --- Fibonacci: O(2ⁿ) vs O(n) ---
        System.out.println("\n--- Fibonacci Recurrence ---");
        int n = 35;
        long start = System.nanoTime();
        long fibResult = fibNaive(n);
        double naiveTime = (System.nanoTime() - start) / 1_000_000.0;

        long[] memo = new long[n + 1];
        java.util.Arrays.fill(memo, -1);
        start = System.nanoTime();
        long memoResult = fibMemo(n, memo);
        double memoTime = (System.nanoTime() - start) / 1_000_000.0;

        System.out.printf("fib(%d) Naive O(2^n): %d in %.3f ms%n", n, fibResult, naiveTime);
        System.out.printf("fib(%d) Memo  O(n):   %d in %.3f ms%n", n, memoResult, memoTime);
        System.out.printf("Speedup: %.0fx%n", naiveTime / Math.max(memoTime, 0.001));

        // === MASTER THEOREM REFERENCE ===
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("║              MASTER THEOREM: T(n) = aT(n/b) + O(n^d)              ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════╣");
        System.out.println("║ Case │ Condition          │ Result              │ Example          ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════╣");
        System.out.println("║  1   │ d < log_b(a)       │ O(n^(log_b(a)))     │ 2T(n/2)+O(1)     ║");
        System.out.println("║  2   │ d = log_b(a)       │ O(n^d · log n)      │ 2T(n/2)+O(n)     ║");
        System.out.println("║  3   │ d > log_b(a)       │ O(n^d)              │ 3T(n/4)+O(n²)    ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════╝");

        System.out.println("\n--- Common Recurrences ---");
        System.out.println("T(n) = T(n-1) + O(1)       → O(n)        [Linear recursion]");
        System.out.println("T(n) = T(n-1) + O(n)       → O(n²)       [Selection sort]");
        System.out.println("T(n) = T(n/2) + O(1)       → O(log n)    [Binary search]");
        System.out.println("T(n) = 2T(n/2) + O(1)      → O(n)        [Tree traversal]");
        System.out.println("T(n) = 2T(n/2) + O(n)      → O(n log n)  [Merge sort]");
        System.out.println("T(n) = T(n-1) + T(n-2)     → O(2^n)      [Fibonacci]");
    }
}
