import java.util.Arrays;

public class Traversal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        Arrays.stream(numbers).forEach(System.out::println);
    }
}
