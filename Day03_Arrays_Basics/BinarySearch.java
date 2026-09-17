import java.util.Arrays;

/**
 * ============================================================
 * DAY 3 — BINARY SEARCH
 * ============================================================
 *
 * Covers: Iterative, recursive, Arrays.binarySearch(),
 *         lower bound, upper bound, and rotated array search.
 *
 * Pre-condition: The array MUST be sorted (ascending) for
 *                standard binary search to work.
 *
 * Complexity:
 *   Time:  O(log n) — halves the search space each step
 *   Space: O(1) iterative, O(log n) recursive (call stack)
 *
 * Key Java Idiom:
 *   int mid = lo + (hi - lo) / 2;  // avoids integer overflow
 * ============================================================
 */
public class BinarySearch {

    // ==================== Iterative Binary Search ====================
    // Returns the index of target in sorted array, or -1 if absent.
    // Time: O(log n)  |  Space: O(1)
    public static int binarySearch(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2; // Safe from overflow

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                lo = mid + 1; // Target is in the right half
            } else {
                hi = mid - 1; // Target is in the left half
            }
        }
        return -1; // Not found
    }

    // ==================== Recursive Binary Search ====================
    // Same logic, expressed recursively.
    // Time: O(log n)  |  Space: O(log n) due to recursion stack
    public static int binarySearchRecursive(int[] arr, int target, int lo, int hi) {
        if (lo > hi) return -1; // Base case: not found

        int mid = lo + (hi - lo) / 2;

        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return binarySearchRecursive(arr, target, mid + 1, hi);
        return binarySearchRecursive(arr, target, lo, mid - 1);
    }

    // ==================== Lower Bound ====================
    // Returns the index of the FIRST element >= target.
    // Equivalent to C++ std::lower_bound.
    // If all elements < target, returns arr.length.
    // Time: O(log n)  |  Space: O(1)
    public static int lowerBound(int[] arr, int target) {
        int lo = 0, hi = arr.length;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid; // arr[mid] >= target, so mid is a candidate
            }
        }
        return lo;
    }

    // ==================== Upper Bound ====================
    // Returns the index of the FIRST element > target.
    // Equivalent to C++ std::upper_bound.
    // If all elements <= target, returns arr.length.
    // Time: O(log n)  |  Space: O(1)
    public static int upperBound(int[] arr, int target) {
        int lo = 0, hi = arr.length;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] <= target) {
                lo = mid + 1;
            } else {
                hi = mid; // arr[mid] > target, so mid is a candidate
            }
        }
        return lo;
    }

    // ==================== Count Occurrences in Sorted Array ====================
    // Uses lower and upper bound to count how many times target appears.
    // Time: O(log n)  |  Space: O(1)
    public static int countOccurrences(int[] arr, int target) {
        return upperBound(arr, target) - lowerBound(arr, target);
    }

    // ==================== First and Last Position ====================
    // LeetCode 34: Find first and last position of element in sorted array.
    // Time: O(log n)  |  Space: O(1)
    public static int[] searchRange(int[] arr, int target) {
        int lb = lowerBound(arr, target);

        // If lowerBound points beyond array or doesn't match target
        if (lb >= arr.length || arr[lb] != target) {
            return new int[]{-1, -1};
        }

        int ub = upperBound(arr, target);
        return new int[]{lb, ub - 1};
    }

    // ==================== Search in Rotated Sorted Array ====================
    // The array was originally sorted, then rotated at some pivot.
    // e.g., [4, 5, 6, 7, 0, 1, 2] — rotated at index 4.
    // Time: O(log n)  |  Space: O(1)
    public static int searchRotated(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) return mid;

            // Determine which half is sorted
            if (arr[lo] <= arr[mid]) {
                // Left half [lo..mid] is sorted
                if (target >= arr[lo] && target < arr[mid]) {
                    hi = mid - 1; // Target is in the sorted left half
                } else {
                    lo = mid + 1; // Target is in the right half
                }
            } else {
                // Right half [mid..hi] is sorted
                if (target > arr[mid] && target <= arr[hi]) {
                    lo = mid + 1; // Target is in the sorted right half
                } else {
                    hi = mid - 1; // Target is in the left half
                }
            }
        }
        return -1;
    }

    // ==================== Find Peak Element ====================
    // An element is a peak if it's greater than its neighbors.
    // Time: O(log n)  |  Space: O(1)
    public static int findPeakElement(int[] arr) {
        int lo = 0, hi = arr.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid + 1]) {
                hi = mid; // Peak is at mid or to the left
            } else {
                lo = mid + 1; // Peak is to the right
            }
        }
        return lo; // lo == hi, pointing at the peak
    }

    // ==================== Square Root (Integer) ====================
    // Binary search to find floor(sqrt(x)).
    // Time: O(log x)  |  Space: O(1)
    public static int mySqrt(int x) {
        if (x < 2) return x;

        long lo = 1, hi = x / 2;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (mid * mid == x) return (int) mid;
            if (mid * mid < x) lo = mid + 1;
            else hi = mid - 1;
        }
        return (int) hi; // Floor of sqrt
    }

    // ==================== MAIN — DEMO ====================
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║        BINARY SEARCH DEMONSTRATIONS         ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        int[] sorted = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println("Array: " + Arrays.toString(sorted));

        // --- Iterative ---
        System.out.println("\n--- Iterative Binary Search ---");
        System.out.println("Search 7:  index = " + binarySearch(sorted, 7));
        System.out.println("Search 10: index = " + binarySearch(sorted, 10));

        // --- Recursive ---
        System.out.println("\n--- Recursive Binary Search ---");
        System.out.println("Search 15: index = " + binarySearchRecursive(sorted, 15, 0, sorted.length - 1));

        // --- Java built-in ---
        System.out.println("\n--- Arrays.binarySearch() ---");
        int javaIdx = Arrays.binarySearch(sorted, 11);
        System.out.println("Search 11: index = " + javaIdx);
        int javaMiss = Arrays.binarySearch(sorted, 10);
        System.out.println("Search 10: index = " + javaMiss + " (negative = insertion point - 1)");

        // --- Lower & Upper Bound ---
        int[] dupes = {1, 3, 3, 3, 5, 7, 7, 9};
        System.out.println("\n--- Lower / Upper Bound ---");
        System.out.println("Array: " + Arrays.toString(dupes));
        System.out.println("Lower bound of 3: index " + lowerBound(dupes, 3));
        System.out.println("Upper bound of 3: index " + upperBound(dupes, 3));
        System.out.println("Count of 3: " + countOccurrences(dupes, 3));

        // --- First & Last Position ---
        System.out.println("\n--- First & Last Position ---");
        System.out.println("Range of 3: " + Arrays.toString(searchRange(dupes, 3)));
        System.out.println("Range of 6: " + Arrays.toString(searchRange(dupes, 6)));

        // --- Rotated array ---
        int[] rotated = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("\n--- Rotated Sorted Array ---");
        System.out.println("Array: " + Arrays.toString(rotated));
        System.out.println("Search 0: index = " + searchRotated(rotated, 0));
        System.out.println("Search 5: index = " + searchRotated(rotated, 5));
        System.out.println("Search 3: index = " + searchRotated(rotated, 3));

        // --- Peak element ---
        int[] peaks = {1, 3, 20, 4, 1, 0};
        System.out.println("\n--- Peak Element ---");
        System.out.println("Array: " + Arrays.toString(peaks));
        int peakIdx = findPeakElement(peaks);
        System.out.println("Peak at index " + peakIdx + " → value: " + peaks[peakIdx]);

        // --- Integer square root ---
        System.out.println("\n--- Integer Square Root ---");
        System.out.println("sqrt(49) = " + mySqrt(49));
        System.out.println("sqrt(50) = " + mySqrt(50) + " (floor)");
        System.out.println("sqrt(1)  = " + mySqrt(1));

        // --- Benchmark: Binary Search vs Linear Search ---
        System.out.println("\n--- Benchmark: Binary vs Linear on 10M elements ---");
        int[] big = new int[10_000_000];
        for (int i = 0; i < big.length; i++) big[i] = i * 2;
        int target = 19_999_998; // Last element

        long start = System.nanoTime();
        binarySearch(big, target);
        double bsMs = (System.nanoTime() - start) / 1_000_000.0;

        start = System.nanoTime();
        for (int i = 0; i < big.length; i++) { // Linear scan
            if (big[i] == target) break;
        }
        double linMs = (System.nanoTime() - start) / 1_000_000.0;

        System.out.printf("Binary Search: %.4f ms%n", bsMs);
        System.out.printf("Linear Search: %.4f ms%n", linMs);
        System.out.printf("Speedup: ~%.0fx faster%n", linMs / bsMs);

        // === SUMMARY ===
        System.out.println("\n╔═══════════════════════════════════════════════════╗");
        System.out.println("║          BINARY SEARCH SUMMARY TABLE              ║");
        System.out.println("╠═══════════════════════════════════════════════════╣");
        System.out.println("║ Variant          │ Time     │ Notes               ║");
        System.out.println("╠═══════════════════════════════════════════════════╣");
        System.out.println("║ Iterative        │ O(log n) │ Preferred approach  ║");
        System.out.println("║ Recursive        │ O(log n) │ O(log n) stack      ║");
        System.out.println("║ Lower bound      │ O(log n) │ First elem >= k     ║");
        System.out.println("║ Upper bound      │ O(log n) │ First elem >  k     ║");
        System.out.println("║ Rotated array    │ O(log n) │ Modified conditions ║");
        System.out.println("║ Peak element     │ O(log n) │ Hill-climbing BS    ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }
}
