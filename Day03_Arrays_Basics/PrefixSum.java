import java.util.Arrays;

/**
 * ============================================================
 * DAY 3 — PREFIX SUM & DIFFERENCE ARRAYS
 * ============================================================
 *
 * Covers: 1D prefix sum, range sum queries, difference arrays,
 *         and practical applications.
 *
 * Core Idea:
 *   Build a prefix array once in O(n), then answer any
 *   range sum query in O(1).
 *
 *   prefix[i] = arr[0] + arr[1] + ... + arr[i-1]
 *   sum(l..r) = prefix[r+1] - prefix[l]
 *
 * Difference Array (inverse of prefix sum):
 *   Apply range updates in O(1) each, then reconstruct with
 *   a prefix sum pass.
 *
 * Complexity:
 *   Build prefix:  O(n) time, O(n) space
 *   Range query:   O(1) per query
 *   Difference update: O(1) per update, O(n) to reconstruct
 * ============================================================
 */
public class PrefixSum {

    // ==================== Build Prefix Sum Array ====================
    // prefix[0] = 0  (identity for empty prefix)
    // prefix[i] = arr[0] + arr[1] + ... + arr[i-1]
    // Length: n + 1 (one extra slot for the empty prefix)
    // Time: O(n)  |  Space: O(n)
    public static long[] buildPrefix(int[] arr) {
        long[] prefix = new long[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        return prefix;
    }

    // ==================== Range Sum Query ====================
    // Returns sum of arr[left..right] (inclusive) in O(1).
    // Pre-condition: prefix array must be built beforehand.
    public static long rangeSum(long[] prefix, int left, int right) {
        return prefix[right + 1] - prefix[left];
    }

    // ==================== Total Sum ====================
    // Sum of entire array = prefix[n]
    public static long totalSum(long[] prefix) {
        return prefix[prefix.length - 1];
    }

    // ==================== Equilibrium Index ====================
    // Find index where left sum == right sum.
    // leftSum = prefix[i], rightSum = totalSum - prefix[i+1]
    // Time: O(n)  |  Space: O(n) for prefix (or O(1) with running sum)
    public static int equilibriumIndex(int[] arr) {
        long[] prefix = buildPrefix(arr);
        long total = totalSum(prefix);

        for (int i = 0; i < arr.length; i++) {
            long leftSum = prefix[i];
            long rightSum = total - prefix[i + 1];
            if (leftSum == rightSum) return i;
        }
        return -1; // No equilibrium
    }

    // ==================== Subarray Sum Equals K ====================
    // Count subarrays whose sum == k using prefix sum + HashMap.
    // Time: O(n)  |  Space: O(n)
    public static int subarraySumCount(int[] arr, int k) {
        // prefix[j] - prefix[i] == k  →  prefix[i] == prefix[j] - k
        java.util.Map<Long, Integer> prefixCount = new java.util.HashMap<>();
        prefixCount.put(0L, 1); // Empty prefix has sum 0
        long runningSum = 0;
        int count = 0;

        for (int num : arr) {
            runningSum += num;
            // How many earlier prefixes had sum == runningSum - k?
            count += prefixCount.getOrDefault(runningSum - k, 0);
            prefixCount.merge(runningSum, 1, Integer::sum);
        }
        return count;
    }

    // ==================== Difference Array ====================
    // Supports multiple range increment operations efficiently.
    //
    // To add +val to all elements in arr[left..right]:
    //   diff[left]     += val
    //   diff[right+1]  -= val   (if right+1 < n)
    //
    // After all updates, reconstruct the array with a prefix sum.

    /**
     * Creates a difference array from the original.
     */
    public static int[] buildDifference(int[] arr) {
        int[] diff = new int[arr.length];
        diff[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }
        return diff;
    }

    /**
     * Applies a range update: add val to arr[left..right].
     * Operates on the difference array in O(1).
     */
    public static void rangeUpdate(int[] diff, int left, int right, int val) {
        diff[left] += val;
        if (right + 1 < diff.length) {
            diff[right + 1] -= val;
        }
    }

    /**
     * Reconstructs the original array from its difference array.
     * Uses a prefix sum pass in O(n).
     */
    public static int[] reconstruct(int[] diff) {
        int[] result = new int[diff.length];
        result[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            result[i] = result[i - 1] + diff[i];
        }
        return result;
    }

    // ==================== 2D Prefix Sum ====================
    // For matrix range sum queries.
    // prefix[i][j] = sum of all elements in matrix[0..i-1][0..j-1]
    // Time: O(rows × cols) to build  |  O(1) per query
    public static long[][] buildPrefix2D(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        long[][] prefix = new long[rows + 1][cols + 1];

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                prefix[i][j] = matrix[i - 1][j - 1]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1]; // Inclusion-exclusion
            }
        }
        return prefix;
    }

    /**
     * Returns sum of elements in the submatrix [r1..r2][c1..c2] (0-indexed).
     */
    public static long rangeSum2D(long[][] prefix, int r1, int c1, int r2, int c2) {
        return prefix[r2 + 1][c2 + 1]
                - prefix[r1][c2 + 1]
                - prefix[r2 + 1][c1]
                + prefix[r1][c1]; // Inclusion-exclusion
    }

    // ==================== MAIN — DEMO ====================
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║      PREFIX SUM & DIFFERENCE ARRAY DEMOS    ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        // --- 1D Prefix Sum ---
        int[] arr = {2, 4, 6, 8, 10};
        long[] prefix = buildPrefix(arr);
        System.out.println("Array:      " + Arrays.toString(arr));
        System.out.println("Prefix sum: " + Arrays.toString(prefix));

        System.out.println("\n--- Range Sum Queries ---");
        System.out.println("sum(0..4) = " + rangeSum(prefix, 0, 4) + "  (entire array)");
        System.out.println("sum(1..3) = " + rangeSum(prefix, 1, 3) + "  (4 + 6 + 8)");
        System.out.println("sum(2..2) = " + rangeSum(prefix, 2, 2) + "  (just element 6)");
        System.out.println("sum(3..4) = " + rangeSum(prefix, 3, 4) + "  (8 + 10)");

        // --- Equilibrium Index ---
        int[] eqArr = {1, 3, 5, 2, 2};
        int eqIdx = equilibriumIndex(eqArr);
        System.out.println("\n--- Equilibrium Index ---");
        System.out.println("Array: " + Arrays.toString(eqArr));
        System.out.println("Equilibrium index: " + eqIdx
                + (eqIdx >= 0 ? "  (left sum = right sum = " + rangeSum(buildPrefix(eqArr), 0, eqIdx - 1) + ")" : ""));

        // --- Subarray Sum Equals K ---
        int[] subArr = {1, 1, 1, 2, 3};
        int k = 3;
        System.out.println("\n--- Subarray Sum Equals K ---");
        System.out.println("Array: " + Arrays.toString(subArr) + ", k = " + k);
        System.out.println("Count of subarrays with sum " + k + ": " + subarraySumCount(subArr, k));

        // --- Difference Array ---
        System.out.println("\n--- Difference Array ---");
        int[] original = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] diff = buildDifference(original);
        System.out.println("Original:  " + Arrays.toString(original));

        // Apply range updates
        rangeUpdate(diff, 1, 4, 3);  // Add 3 to indices 1..4
        rangeUpdate(diff, 3, 7, 2);  // Add 2 to indices 3..7
        rangeUpdate(diff, 0, 9, 1);  // Add 1 to all indices

        int[] result = reconstruct(diff);
        System.out.println("After updates:");
        System.out.println("  +3 to [1..4], +2 to [3..7], +1 to [0..9]");
        System.out.println("Result:    " + Arrays.toString(result));
        // Expected: [1, 4, 4, 6, 6, 3, 3, 3, 1, 1]

        // --- 2D Prefix Sum ---
        System.out.println("\n--- 2D Prefix Sum ---");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        long[][] prefix2D = buildPrefix2D(matrix);
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            System.out.println("  " + Arrays.toString(row));
        }
        System.out.println("Sum of entire matrix:           " + rangeSum2D(prefix2D, 0, 0, 2, 2));
        System.out.println("Sum of submatrix [1,1] to [2,2]: " + rangeSum2D(prefix2D, 1, 1, 2, 2)
                + "  (5+6+8+9)");
        System.out.println("Sum of top-left [0,0] to [1,1]:  " + rangeSum2D(prefix2D, 0, 0, 1, 1)
                + "  (1+2+4+5)");

        // --- Performance comparison ---
        System.out.println("\n--- Benchmark: Prefix Sum vs Brute Force for 100K queries ---");
        int n = 100_000;
        int queries = 100_000;
        int[] bigArr = new int[n];
        for (int i = 0; i < n; i++) bigArr[i] = (int) (Math.random() * 100);

        long[] bigPrefix = buildPrefix(bigArr);
        long dummy = 0;

        // Prefix sum approach: O(1) per query
        long start = System.nanoTime();
        for (int q = 0; q < queries; q++) {
            int l = q % n, r = Math.min(l + 1000, n - 1);
            dummy += rangeSum(bigPrefix, l, r);
        }
        double prefixMs = (System.nanoTime() - start) / 1_000_000.0;

        // Brute force approach: O(n) per query
        start = System.nanoTime();
        for (int q = 0; q < queries; q++) {
            int l = q % n, r = Math.min(l + 1000, n - 1);
            long sum = 0;
            for (int i = l; i <= r; i++) sum += bigArr[i];
            dummy += sum;
        }
        double bruteMs = (System.nanoTime() - start) / 1_000_000.0;

        System.out.printf("Prefix sum queries: %.2f ms%n", prefixMs);
        System.out.printf("Brute force loops:  %.2f ms%n", bruteMs);
        System.out.printf("Speedup: ~%.0fx faster%n", bruteMs / prefixMs);
        if (dummy != 0) {} // Prevent dead-code elimination by JIT

        // === SUMMARY ===
        System.out.println("\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║          PREFIX SUM SUMMARY TABLE                     ║");
        System.out.println("╠═══════════════════════════════════════════════════════╣");
        System.out.println("║ Operation          │ Build  │ Query/Update            ║");
        System.out.println("╠═══════════════════════════════════════════════════════╣");
        System.out.println("║ 1D Prefix Sum      │ O(n)   │ O(1) per range query    ║");
        System.out.println("║ 2D Prefix Sum      │ O(rc)  │ O(1) per submatrix sum  ║");
        System.out.println("║ Difference Array   │ O(n)   │ O(1) per range update   ║");
        System.out.println("║ Subarray Sum == k  │  —     │ O(n) with HashMap       ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
    }
}
