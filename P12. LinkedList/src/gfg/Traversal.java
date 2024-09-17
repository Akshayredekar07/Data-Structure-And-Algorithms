

class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class Traversal{

    public static void main(String[] args){

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);



        int x = 5;
        insertAtBegin(head, x);



        printlist(head);

    }

    static void printlist(Node head){

        Node curr = head;
        while(curr != null){

            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    } 



    static void insertAtBegin(Node head, int data){

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}