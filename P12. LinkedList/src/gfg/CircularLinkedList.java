public class CircularLinkedList {
    static class Node {
        int data;
        Node next;
        
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String args[]) 
    { 
        CircularList list = new CircularList();
        list.addAll(10, 5, 20, 15);
        
        System.out.println("Initial list:");
        list.printList();

        list.insertAtBegin(44);
        System.out.println("\nAfter inserting 44 at the beginning:");
        list.printList();

        list.insertLast(19);
        System.out.println("\nAfter inserting 19 at the end:");
        list.printList();

        list.deleteHead();
        System.out.println("\nAfter deleting the head:");
        list.printList();

        int k= 3;
        list.deleteKthNode(k);
        System.out.println("\nAfter deleting the kth head:");
        list.printList();
    }

    static class CircularList {
        private Node head;

        public void addAll(int... values) {
            for (int value : values) {
                insertLast(value);
            }
        }

        public void insertAtBegin(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                head.next = head;
            } else {
                newNode.next = head.next;
                head.next = newNode;
                // Swap data of head and newNode
                int temp = head.data;
                head.data = newNode.data;
                newNode.data = temp;
            }
        }

        public void insertLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                head.next = head;
            } else {
                // Find the last node
                Node last = head;
                while (last.next != head) {
                    last = last.next;
                }
                // Insert the new node after the last node
                newNode.next = head;
                last.next = newNode;
            }
        }

        public void printList() {
            if (head == null) return;
            Node current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
        }

        //Naive solution
        public Node deleteHead() {
            if (head == null) return null;  // if the list is empty
            if (head.next == head) {        // if there is only one node in the list
                head = null;
                return null;
            }
        
            Node curr = head;
            while (curr.next != head) {     // find the last node
                curr = curr.next;
            }
            
            curr.next = head.next;          // point the last node to the second node
            head = head.next;               // update head to the second node
        
            return head;
        }

        // efficient solution
        public Node deleteHead1(){
            if (head == null) return null;  // if the list is empty
            if (head.next == head) {        // if there is only one node in the list
                head = null;
                return null;
            }
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }

        // delete kth node from the linkedlist 
        public Node deleteKthNode(int k){
            if (head == null) return null;
            if(k == 1){
                deleteHead1();
            }
            Node curr=head;
            for (int i = 0; i < k-2; i++) {
                curr=curr.next;
            }
            curr.next = curr.next.next;
            return curr.next;
        }
    }
}