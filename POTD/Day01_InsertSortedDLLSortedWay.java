// package POTD;

class Node {
    int data;
    Node next;
    Node prev;
    
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Solution {
    // Function to insert a new node in sorted way
    public Node sortedInsert(Node head, int x) {
        Node toInsert = new Node(x);
        
        // Case 1: Insert at beginning
        if(x <= head.data) {
            toInsert.next = head;
            head.prev = toInsert;
            return toInsert;
        }
        
        // Case 2: Insert in middle or end
        Node curr = head.next, prev = head;
        while(curr != null && x > curr.data) {
            prev = curr;
            curr = curr.next;
        }
        
        // Insert between prev and curr
        prev.next = toInsert;
        toInsert.prev = prev;
        
        // If not inserting at end
        if(curr != null) {
            curr.prev = toInsert;
            toInsert.next = curr;
        }
        
        return head;
    }
    
    // Utility function to print the doubly linked list
    public void printList(Node head) {
        Node current = head;
        System.out.print("Forward Traversal: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    // Utility function to create a new doubly linked list
    public Node createList(int[] arr) {
        if(arr.length == 0) return null;
        
        Node head = new Node(arr[0]);
        Node current = head;
        
        for(int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        
        return head;
    }
}

public class Day01_InsertSortedDLLSortedWay {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1: Insert in middle
        System.out.println("Test Case 1: Insert 4 in [1, 3, 5]");
        Node head1 = solution.createList(new int[]{1, 3, 5});
        System.out.println("Before insertion:");
        solution.printList(head1);
        head1 = solution.sortedInsert(head1, 4);
        System.out.println("After insertion:");
        solution.printList(head1);
        System.out.println();
        
        // Test Case 2: Insert at beginning
        System.out.println("Test Case 2: Insert 0 in [1, 2, 3]");
        Node head2 = solution.createList(new int[]{1, 2, 3});
        System.out.println("Before insertion:");
        solution.printList(head2);
        head2 = solution.sortedInsert(head2, 0);
        System.out.println("After insertion:");
        solution.printList(head2);
        System.out.println();
        
        // Test Case 3: Insert at end
        System.out.println("Test Case 3: Insert 6 in [1, 3, 5]");
        Node head3 = solution.createList(new int[]{1, 3, 5});
        System.out.println("Before insertion:");
        solution.printList(head3);
        head3 = solution.sortedInsert(head3, 6);
        System.out.println("After insertion:");
        solution.printList(head3);
    }
}

/*
java:POTD/Day01_InsertSortedDLLSortedWay.java

public Node sortedInsert(Node head, int x) {
    /* Test Case 1: Insert 4 in [1, 3, 5]
    * Initial list: 1 ⇄ 3 ⇄ 5
    * x = 4
    * Steps:
    * 1. 4 > 1 (head.data), so move to Case 2
    * 2. curr = 3, prev = 1, 4 > 3, so advance
    * 3. curr = 5, prev = 3, 4 < 5, stop
    * 4. Insert 4 between 3 and 5
    * Final list: 1 ⇄ 3 ⇄ 4 ⇄ 5
    */

    /* Test Case 2: Insert 0 in [1, 2, 3]
    * Initial list: 1 ⇄ 2 ⇄ 3
    * x = 0
    * Steps:
    * 1. 0 < 1 (head.data), so insert at beginning
    * Final list: 0 ⇄ 1 ⇄ 2 ⇄ 3
    */

    /* Test Case 3: Insert 6 in [1, 3, 5]
    * Initial list: 1 ⇄ 3 ⇄ 5
    * x = 6
    * Steps:
    * 1. 6 > 1 (head.data), so move to Case 2
    * 2. curr = 3, prev = 1, 6 > 3, so advance
    * 3. curr = 5, prev = 3, 6 > 5, so advance
    * 4. curr = null, prev = 5
    * 5. Insert 6 at end
    * Final list: 1 ⇄ 3 ⇄ 5 ⇄ 6
    */