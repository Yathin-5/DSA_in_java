/**
 * Pointer-style DSA patterns use indexes or references instead of raw pointers.
 */
public class PointerStyleTraversal {
    private static final class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        System.out.println("middle value = " + findMiddle(head).value);
    }

    // Slow moves one node while fast moves two; slow reaches the middle.
    private static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
