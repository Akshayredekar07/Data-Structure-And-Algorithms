

public class LLInsertionAtPosition {

    public static void main(String[] args) {

        Node head = null;
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);

        // Insert at various positions
        head = insertAtPosition(head, 5, 1);   // Insert 5 at position 1
        head = insertAtPosition(head, 15, 3);  // Insert 15 at position 3
        head = insertAtPosition(head, 25, 6);  // Insert 25 at position 6

        printlist(head);  // Expected Output: 5 10 15 20 30 25
    }

    static void printlist(Node head) {

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    } 

    static Node insertAtEnd(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    static Node insertAtPosition(Node head, int data, int pos) {

        Node temp = new Node(data);

        if (pos == 1) {
            temp.next = head;
            return temp;
        }

        Node curr = head;

        for (int i = 1; i <= pos - 2 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            return head;
        }

        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}

