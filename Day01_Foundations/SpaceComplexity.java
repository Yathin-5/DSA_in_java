/**
 * ============================================================
 * DAY 1 — SPACE COMPLEXITY ANALYSIS
 * ============================================================
 * 
 * Covers: In-place vs Auxiliary space, stack frame analysis,
 *         Java-specific memory considerations.
 * 
 * Key Java vs C Differences:
 *   - Java objects have ~16 bytes overhead (header)
 *   - int[] uses contiguous memory, Integer[] does NOT (boxed objects)
 *   - Garbage collector reclaims unreachable memory automatically
 *   - Default JVM stack size ~512KB (-Xss flag to configure)
 * ============================================================
 */
public class SpaceComplexity {

    // ==================== O(1) Space — In-Place ====================
    /**
     * Reverses array in-place using two pointers.
     * Only uses a constant number of variables (left, right, temp).
     * Space: O(1) auxiliary
     */
    public static void reverseInPlace(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // ==================== O(n) Space — Auxiliary Array ====================
    /**
     * Reverses array by creating a new copy.
     * Space: O(n) auxiliary — the new array
     */
    public static int[] reverseWithCopy(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n]; // O(n) extra space
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
        }
        return reversed;
    }

    // ==================== O(n) Space — Recursive Stack ====================
    /**
     * Recursive factorial: each call adds a stack frame.
     * Stack depth = n → Space: O(n)
     * 
     * Stack frame in Java typically: ~32-64 bytes per frame
     * (local variables + return address + operand stack)
     */
    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;        // Base case: 1 frame
        return n * factorialRecursive(n - 1);  // n frames total
    }

    /**
     * Iterative factorial: constant stack depth.
     * Space: O(1)
     */
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // ==================== O(log n) Space — Recursive Binary Search ====================
    /**
     * Binary search recursion depth = O(log n)
     * Each recursive call halves the search space.
     */
    public static int binarySearchRecursive(int[] arr, int target, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return binarySearchRecursive(arr, target, mid + 1, hi);
        return binarySearchRecursive(arr, target, lo, mid - 1);
        // Max recursion depth: log₂(n) → Space: O(log n)
    }

    // ==================== O(m×n) Space — 2D Array ====================
    /**
     * Creates and fills a 2D DP table.
     * Space: O(m × n)
     * 
     * Java note: 2D arrays in Java are arrays-of-arrays (not contiguous).
     * Each row is a separate object on the heap.
     */
    public static int[][] create2DTable(int m, int n) {
        int[][] dp = new int[m][n]; // m row objects + m*n ints
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = i + j;
            }
        }
        return dp;
    }

    // ==================== SPACE-OPTIMIZED DP EXAMPLE ====================
    /**
     * Fibonacci with full DP table: O(n) space
     */
    public static long fibWithTable(int n) {
        if (n <= 1) return n;
        long[] dp = new long[n + 1]; // O(n) space
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * Fibonacci space-optimized: O(1) space
     * Only need the last 2 values — rolling variables
     */
    public static long fibSpaceOptimized(int n) {
        if (n <= 1) return n;
        long prev2 = 0, prev1 = 1;
        for (int i = 2; i <= n; i++) {
            long curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    // ==================== JAVA MEMORY ANALYSIS ====================
    /**
     * Demonstrates Java-specific memory usage.
     * 
     * Memory sizes in Java:
     *   byte    → 1 byte       boolean → 1 byte (JVM-dependent)
     *   short   → 2 bytes      char    → 2 bytes (UTF-16!)
     *   int     → 4 bytes      float   → 4 bytes
     *   long    → 8 bytes      double  → 8 bytes
     *   reference → 4 or 8 bytes (compressed oops / 64-bit)
     *   Object header → ~12-16 bytes
     *   Array header  → ~16-20 bytes (+ length field)
     * 
     * int[1000]   ≈ 16 + 4×1000 = 4,016 bytes
     * Integer[1000] ≈ 16 + 8×1000 (refs) + 1000×(16+4) (objects) = ~28,016 bytes
     *               → ~7x more memory for boxed types!
     */
    public static void memoryAnalysis() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Suggest garbage collection

        long beforeMem = runtime.totalMemory() - runtime.freeMemory();

        // Allocate a large array
        int size = 1_000_000;
        int[] primitiveArr = new int[size]; // ~4 MB
        for (int i = 0; i < size; i++) primitiveArr[i] = i;

        long afterMem = runtime.totalMemory() - runtime.freeMemory();

        System.out.printf("Approximate memory for int[%,d]: %,d bytes (~%.1f MB)%n",
                size, (afterMem - beforeMem), (afterMem - beforeMem) / (1024.0 * 1024));

        // Prevent GC from collecting our array before measurement
        System.out.println("Array sum (prevent optimization): " + primitiveArr[0]);
    }

    // ==================== STACK OVERFLOW DEMO ====================
    /**
     * Demonstrates stack overflow with deep recursion.
     * Default JVM stack: ~512KB → roughly 10,000-20,000 frames
     * Use -Xss flag to increase: java -Xss4m SpaceComplexity
     */
    public static int deepRecursion(int n) {
        if (n == 0) return 0;
        return 1 + deepRecursion(n - 1);
    }

    // ==================== MAIN ====================
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║        SPACE COMPLEXITY DEMONSTRATIONS        ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        // --- O(1) vs O(n) Space ---
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original: " + java.util.Arrays.toString(arr));

        reverseInPlace(arr);
        System.out.println("Reversed in-place (O(1) space): " + java.util.Arrays.toString(arr));

        int[] reversed = reverseWithCopy(arr);
        System.out.println("Reversed with copy (O(n) space): " + java.util.Arrays.toString(reversed));

        // --- Recursive vs Iterative ---
        System.out.println("\n--- Factorial: Recursive O(n) stack vs Iterative O(1) ---");
        System.out.println("10! (recursive) = " + factorialRecursive(10));
        System.out.println("10! (iterative) = " + factorialIterative(10));

        // --- Fibonacci: O(n) table vs O(1) rolling ---
        System.out.println("\n--- Fibonacci Space Optimization ---");
        int n = 50;
        System.out.println("fib(" + n + ") with O(n) table: " + fibWithTable(n));
        System.out.println("fib(" + n + ") with O(1) vars:  " + fibSpaceOptimized(n));

        // --- Memory Analysis ---
        System.out.println("\n--- Java Memory Analysis ---");
        memoryAnalysis();

        // --- Stack Overflow Test ---
        System.out.println("\n--- Stack Depth Test ---");
        try {
            deepRecursion(100_000);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught! Default JVM stack too small for 100K frames.");
            System.out.println("Fix: Run with `java -Xss4m SpaceComplexity`");
        }

        // Summary
        System.out.println("\n╔═══════════════════════════════════════════════════╗");
        System.out.println("║           SPACE COMPLEXITY SUMMARY                 ║");
        System.out.println("╠═══════════════════════════════════════════════════╣");
        System.out.println("║ Algorithm         │ Auxiliary Space │ Notes        ║");
        System.out.println("╠═══════════════════════════════════════════════════╣");
        System.out.println("║ Reverse in-place  │ O(1)           │ Swap vars    ║");
        System.out.println("║ Reverse with copy │ O(n)           │ New array    ║");
        System.out.println("║ Factorial recur.  │ O(n)           │ Stack frames ║");
        System.out.println("║ Factorial iter.   │ O(1)           │ Loop only    ║");
        System.out.println("║ Binary Search rec │ O(log n)       │ Stack depth  ║");
        System.out.println("║ Fib DP table      │ O(n)           │ dp[] array   ║");
        System.out.println("║ Fib optimized     │ O(1)           │ 2 variables  ║");
        System.out.println("║ 2D DP table       │ O(m×n)         │ dp[][] array ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }
}
