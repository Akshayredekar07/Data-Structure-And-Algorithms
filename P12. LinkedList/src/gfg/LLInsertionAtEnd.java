
public class LLInsertionAtEnd{

    public static void main(String[] args){

        Node head = null;
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);

        int x = 50;
        insertAtEnd(head, x);
        
        printlist(head);
    }

    static void printlist(Node head){

        Node curr = head;
        while(curr != null){

            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    } 


    static Node insertAtEnd(Node head, int data){

        Node newNode = new Node(data);

        if(head == null){
            return newNode;
        }

        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;

    }
}