import java.util.Arrays;

/**
 * ============================================================
 * DAY 3 — ARRAY TRAVERSAL
 * ============================================================
 *
 * Covers: Enhanced for-loop, index-based traversal,
 *         Arrays.stream(), reverse traversal, and
 *         common traversal patterns.
 *
 * Key Points:
 *   - Enhanced for-loop: cleanest when you don't need the index.
 *   - Index-based loop: required when you need position or modify elements.
 *   - Arrays.stream(): functional style for filter/map/reduce pipelines.
 *   - All traversals are O(n) time, O(1) auxiliary space (unless collecting).
 * ============================================================
 */
public class Traversal {

    // ==================== Index-Based Traversal ====================
    // Use when you need the position or must modify elements in place.
    // Time: O(n)  |  Space: O(1)
    public static void printWithIndex(int[] arr) {
        System.out.println("Index-based traversal:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("  arr[%d] = %d%n", i, arr[i]);
        }
    }

    // ==================== Enhanced For-Loop ====================
    // Cleanest syntax when you only need values, not positions.
    // Time: O(n)  |  Space: O(1)
    public static int sumEnhanced(int[] arr) {
        int total = 0;
        for (int value : arr) {
            total += value;
        }
        return total;
    }

    // ==================== Stream-Based Traversal ====================
    // Functional style — great for filter/map/reduce pipelines.
    // Time: O(n)  |  Space: O(1) for reduction, O(n) if collecting
    public static int sumStream(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    public static int[] filterEven(int[] arr) {
        return Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .toArray();
    }

    // ==================== Reverse Traversal ====================
    // Iterating from end to start — useful for problems where
    // you build results right-to-left (e.g., next greater element).
    // Time: O(n)  |  Space: O(1)
    public static void printReverse(int[] arr) {
        System.out.println("Reverse traversal:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("  arr[%d] = %d%n", i, arr[i]);
        }
    }

    // ==================== Find Minimum and Maximum ====================
    // Single-pass traversal to find both min and max.
    // Time: O(n)  |  Space: O(1)
    public static int[] findMinMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return new int[]{min, max};
    }

    // ==================== Count Occurrences ====================
    // Time: O(n)  |  Space: O(1)
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int value : arr) {
            if (value == target) count++;
        }
        return count;
    }

    // ==================== Reverse Array In-Place ====================
    // Two-pointer swap from both ends toward the center.
    // Time: O(n)  |  Space: O(1)
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

    // ==================== Rotate Left by K ====================
    // Reversal algorithm: reverse whole → reverse first k → reverse rest.
    // Time: O(n)  |  Space: O(1)
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;
        k = k % n; // Handle k > n
        reverseRange(arr, 0, k - 1);
        reverseRange(arr, k, n - 1);
        reverseRange(arr, 0, n - 1);
    }

    private static void reverseRange(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // ==================== MAIN — DEMO ====================
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║        ARRAY TRAVERSAL DEMONSTRATIONS       ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        int[] arr = {5, 3, 8, 1, 9, 2, 7, 4, 6};

        // --- Index-based ---
        printWithIndex(arr);

        // --- Enhanced for-loop sum ---
        System.out.println("\nSum (enhanced for): " + sumEnhanced(arr));

        // --- Stream-based ---
        System.out.println("Sum (stream):       " + sumStream(arr));
        System.out.println("Even numbers:       " + Arrays.toString(filterEven(arr)));

        // --- Reverse traversal ---
        System.out.println();
        printReverse(arr);

        // --- Min/Max ---
        int[] minMax = findMinMax(arr);
        System.out.println("\nMin = " + minMax[0] + ", Max = " + minMax[1]);

        // --- Count occurrences ---
        int[] arr2 = {1, 3, 5, 3, 7, 3, 9};
        System.out.println("Count of 3 in " + Arrays.toString(arr2) + ": " + countOccurrences(arr2, 3));

        // --- Reverse in-place ---
        int[] revArr = {1, 2, 3, 4, 5};
        System.out.println("\nBefore reverse: " + Arrays.toString(revArr));
        reverseInPlace(revArr);
        System.out.println("After reverse:  " + Arrays.toString(revArr));

        // --- Rotate left ---
        int[] rotArr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("\nBefore rotate left by 3: " + Arrays.toString(rotArr));
        rotateLeft(rotArr, 3);
        System.out.println("After rotate left by 3:  " + Arrays.toString(rotArr));

        // === SUMMARY ===
        System.out.println("\n╔═══════════════════════════════════════════════════╗");
        System.out.println("║           TRAVERSAL SUMMARY TABLE                 ║");
        System.out.println("╠═══════════════════════════════════════════════════╣");
        System.out.println("║ Technique        │ Time │ When to Use             ║");
        System.out.println("╠═══════════════════════════════════════════════════╣");
        System.out.println("║ Index-based      │ O(n) │ Need position / modify  ║");
        System.out.println("║ Enhanced for     │ O(n) │ Read-only value access  ║");
        System.out.println("║ Arrays.stream()  │ O(n) │ Functional pipelines    ║");
        System.out.println("║ Reverse loop     │ O(n) │ Right-to-left building  ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }
}
