import java.util.Arrays;

/**
 * Arrays are objects, so an array variable stores a reference to mutable data.
 */
public class ArraysAndReferences {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        reverseInPlace(numbers);
        System.out.println("reversed = " + Arrays.toString(numbers));
        System.out.println("pair indexes = " + Arrays.toString(findPairWithSum(numbers, 6)));
    }

    private static void reverseInPlace(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int temporary = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temporary;
            left++;
            right--;
        }
    }

    // This method expects a sorted array and returns the indexes of a matching pair.
    private static int[] findPairWithSum(int[] sortedNumbers, int target) {
        int left = 0;
        int right = sortedNumbers.length - 1;

        while (left < right) {
            int sum = sortedNumbers[left] + sortedNumbers[right];
            if (sum == target) {
                return new int[] {left, right};
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {-1, -1};
    }
}
