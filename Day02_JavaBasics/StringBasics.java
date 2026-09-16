/**
 * String is immutable; StringBuilder is mutable and is better for repeated edits.
 */
public class StringBasics {
    public static void main(String[] args) {
        String first = new String("dsa");
        String second = "dsa";

        // == compares references; equals compares the characters.
        System.out.println("same content = " + first.equals(second));
        System.out.println("palindrome = " + isPalindrome("level"));

        StringBuilder builder = new StringBuilder("Java");
        builder.append(" DSA").reverse();
        System.out.println("builder result = " + builder);
    }

    private static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
