
public class LLInsertion{

    public static void main(String[] args){

        Node head = null;
        head = insertAtBegin(head, 30);
        head = insertAtBegin(head, 20);
        head = insertAtBegin(head, 10);

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


    static Node insertAtBegin(Node head, int data){

        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
}