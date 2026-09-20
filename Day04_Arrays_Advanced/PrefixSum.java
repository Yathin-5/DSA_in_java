import java.util.Arrays;

public class PrefixSum {
    public static long[] buildPrefixSum(int[] numbers) {
        long[] prefix = new long[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++) {
            prefix[i + 1] = prefix[i] + numbers[i];
        }
        return prefix;
    }

    public static long rangeSum(long[] prefix, int left, int right) {
        return prefix[right + 1] - prefix[left];
    }

    public static int[] buildDifferenceArray(int[] numbers) {
        int[] difference = new int[numbers.length];
        if (numbers.length == 0) {
            return difference;
        }

        difference[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            difference[i] = numbers[i] - numbers[i - 1];
        }
        return difference;
    }

    public static void addToRange(int[] difference, int left, int right, int value) {
        difference[left] += value;
        if (right + 1 < difference.length) {
            difference[right + 1] -= value;
        }
    }

    public static int[] buildArray(int[] difference) {
        int[] numbers = new int[difference.length];
        if (difference.length == 0) {
            return numbers;
        }

        numbers[0] = difference[0];
        for (int i = 1; i < difference.length; i++) {
            numbers[i] = numbers[i - 1] + difference[i];
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        long[] prefix = buildPrefixSum(numbers);
        System.out.println(Arrays.toString(prefix));
        System.out.println(rangeSum(prefix, 1, 3));

        int[] difference = buildDifferenceArray(new int[5]);
        addToRange(difference, 1, 3, 5);
        System.out.println(Arrays.toString(buildArray(difference)));
    }
}
