import java.util.Arrays;

public class BinarySearch {
    public static int iterativeSearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (numbers[middle] == target) {
                return middle;
            }
            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static int recursiveSearch(int[] numbers, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = left + (right - left) / 2;
        if (numbers[middle] == target) {
            return middle;
        }
        if (numbers[middle] < target) {
            return recursiveSearch(numbers, target, middle + 1, right);
        }
        return recursiveSearch(numbers, target, left, middle - 1);
    }

    public static int lowerBound(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length;

        while (left < right) {
            int middle = left + (right - left) / 2;
            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }

    public static int upperBound(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length;

        while (left < right) {
            int middle = left + (right - left) / 2;
            if (numbers[middle] <= target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 3, 5, 7, 9};

        System.out.println(iterativeSearch(numbers, 5));
        System.out.println(recursiveSearch(numbers, 5, 0, numbers.length - 1));
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(lowerBound(numbers, 3));
        System.out.println(upperBound(numbers, 3));
    }
}
