/**
 * Day 2: the Java language basics used in DSA solutions.
 */
public class JavaBasics {
    public static void main(String[] args) {
        int count = 3;
        boolean ready = count > 0;

        // A primitive variable stores its value directly.
        System.out.println("count = " + count);
        System.out.println("ready = " + ready);

        System.out.println("square(5) = " + square(5));
        printRange(1, 3);
    }

    // Methods make small, testable operations easier to reuse.
    private static int square(int value) {
        return value * value;
    }

    private static void printRange(int start, int end) {
        for (int value = start; value <= end; value++) {
            System.out.println("value = " + value);
        }
    }
}
