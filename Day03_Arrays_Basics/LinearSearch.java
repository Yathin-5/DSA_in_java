/**
 * ============================================================
 * DAY 3 — LINEAR SEARCH
 * ============================================================
 *
 * Covers: Basic linear search, generic search with Comparable<T>,
 *         search returning all indices, sentinel search optimization.
 *
 * Complexity:
 *   Time:  O(n) worst / average,  O(1) best (target is first element)
 *   Space: O(1)
 *
 * When to use:
 *   - Array is unsorted or small.
 *   - You need to find ALL occurrences.
 *   - Simplicity matters more than speed.
 * ============================================================
 */
import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    // ==================== Basic Linear Search (int) ====================
    // Returns the index of the first occurrence of target, or -1.
    // Time: O(n)  |  Space: O(1)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // ==================== Generic Linear Search ====================
    // Works with any Comparable type: String, Integer, etc.
    // Time: O(n)  |  Space: O(1)
    public static <T extends Comparable<T>> int linearSearch(T[] arr, T target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(target) == 0) return i;
        }
        return -1;
    }

    // ==================== Find All Occurrences ====================
    // Returns a list of ALL indices where target appears.
    // Time: O(n)  |  Space: O(k) where k = number of matches
    public static List<Integer> findAll(int[] arr, int target) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) indices.add(i);
        }
        return indices;
    }

    // ==================== Sentinel Linear Search ====================
    // Eliminates one comparison per iteration by placing the target
    // at the end (sentinel). This avoids checking i < arr.length
    // in the loop, giving a small constant-factor speedup.
    // Time: O(n) — same asymptotic, but fewer comparisons per step
    // Space: O(1)
    public static int sentinelSearch(int[] arr, int target) {
        int n = arr.length;
        if (n == 0) return -1;

        // Save the last element and place the sentinel
        int last = arr[n - 1];
        arr[n - 1] = target;

        int i = 0;
        while (arr[i] != target) {
            i++;
        }

        // Restore the last element
        arr[n - 1] = last;

        // Check: did we find the real target, or just the sentinel?
        if (i < n - 1 || arr[n - 1] == target) return i;
        return -1;
    }

    // ==================== Find Minimum Element ====================
    // A classic traversal-search pattern.
    // Time: O(n)  |  Space: O(1)
    public static int findMinIndex(int[] arr) {
        if (arr.length == 0) return -1;
        int minIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIdx]) minIdx = i;
        }
        return minIdx;
    }

    // ==================== Search in 2D Array ====================
    // Treat the 2D array as a flat sequence.
    // Time: O(rows × cols)  |  Space: O(1)
    public static int[] search2D(int[][] matrix, int target) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == target) return new int[]{r, c};
            }
        }
        return new int[]{-1, -1};
    }

    // ==================== MAIN — DEMO ====================
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║        LINEAR SEARCH DEMONSTRATIONS         ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        int[] arr = {4, 2, 7, 1, 9, 3, 7, 5, 7};

        // --- Basic linear search ---
        int idx = linearSearch(arr, 9);
        System.out.println("Search 9 in array → index: " + idx);

        int notFound = linearSearch(arr, 99);
        System.out.println("Search 99 (absent) → index: " + notFound);

        // --- Generic linear search ---
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        int strIdx = linearSearch(words, "cherry");
        System.out.println("\nSearch \"cherry\" in words → index: " + strIdx);

        // --- Find all occurrences ---
        List<Integer> allSevens = findAll(arr, 7);
        System.out.println("\nAll indices of 7: " + allSevens);

        // --- Sentinel search ---
        int[] sentArr = {4, 2, 7, 1, 9, 3, 5};
        int sentIdx = sentinelSearch(sentArr, 3);
        System.out.println("Sentinel search for 3 → index: " + sentIdx);

        // --- Find minimum ---
        int minIdx = findMinIndex(arr);
        System.out.println("\nMinimum element at index " + minIdx + " → value: " + arr[minIdx]);

        // --- 2D search ---
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] pos = search2D(matrix, 5);
        System.out.printf("Search 5 in 2D matrix → row=%d, col=%d%n", pos[0], pos[1]);

        int[] notFoundPos = search2D(matrix, 99);
        System.out.printf("Search 99 in 2D matrix → row=%d, col=%d%n", notFoundPos[0], notFoundPos[1]);

        // --- Benchmark: Linear vs doing nothing ---
        System.out.println("\n--- Benchmark: Linear Search on large array ---");
        int[] big = new int[10_000_000];
        for (int i = 0; i < big.length; i++) big[i] = i;

        long start = System.nanoTime();
        linearSearch(big, 9_999_999); // worst case: last element
        double worstMs = (System.nanoTime() - start) / 1_000_000.0;

        start = System.nanoTime();
        linearSearch(big, 0); // best case: first element
        double bestMs = (System.nanoTime() - start) / 1_000_000.0;

        System.out.printf("Worst case (last):  %.3f ms%n", worstMs);
        System.out.printf("Best case (first):  %.3f ms%n", bestMs);

        // === SUMMARY ===
        System.out.println("\n╔═══════════════════════════════════════════════════╗");
        System.out.println("║           LINEAR SEARCH SUMMARY                   ║");
        System.out.println("╠═══════════════════════════════════════════════════╣");
        System.out.println("║ Variant          │ Time │ Notes                   ║");
        System.out.println("╠═══════════════════════════════════════════════════╣");
        System.out.println("║ Basic            │ O(n) │ Simple int search       ║");
        System.out.println("║ Generic<T>       │ O(n) │ Works with Comparable   ║");
        System.out.println("║ Find-all         │ O(n) │ Returns List<Integer>   ║");
        System.out.println("║ Sentinel         │ O(n) │ Fewer comparisons/iter  ║");
        System.out.println("║ 2D search        │O(rc) │ Row-major scan          ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }
}
