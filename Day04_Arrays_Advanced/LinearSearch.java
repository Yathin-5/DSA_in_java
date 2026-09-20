public class LinearSearch {
    public static int search(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> int search(T[] values, T target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i].compareTo(target) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 20, 3};
        System.out.println(search(numbers, 20));

        String[] names = {"Asha", "Ravi", "Maya"};
        System.out.println(search(names, "Ravi"));
    }
}
