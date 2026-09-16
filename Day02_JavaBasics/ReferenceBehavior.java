/**
 * Java has no raw pointer syntax. Variables for objects hold references.
 */
public class ReferenceBehavior {
    private static final class Box {
        int value;

        Box(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Box first = new Box(10);
        Box second = first;

        // Both variables refer to the same object, so mutation is visible through both.
        second.value = 20;
        System.out.println("first.value after mutation = " + first.value);

        // Reassigning the copied reference does not reassign the caller's variable.
        replaceReference(first);
        System.out.println("first.value after reassignment attempt = " + first.value);

        changeValue(first);
        System.out.println("first.value after object mutation = " + first.value);
    }

    private static void replaceReference(Box box) {
        box = new Box(99);
    }

    private static void changeValue(Box box) {
        box.value = 30;
    }
}
