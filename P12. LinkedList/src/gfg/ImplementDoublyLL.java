
class Node1{
    int data;
    Node1 next;
    Node1 prev;

    Node1(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

    void printlist1(Node1 head){

        Node1 curr = head;
        while(curr != null){

            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    Node1 insertAtBeginDLL(Node1 head, int data){

        Node1 temp = new Node1(data);

        head.prev = temp;
        temp.next = head;
        head = temp;

        return head;
    }

    Node1 insertAtBeginDLL1(Node1 head, int data){

        Node1 temp = new Node1(data);

        temp.next = head;
        if(head != null){
            head.prev = temp;
        }
        return temp;
    }

    Node1 insertAtLastDLL(Node1 head, int data){
        
        Node1 temp = new Node1(data);

        if(head == null){
            return temp;
        }
        Node1 curr = head;
        while(curr.next != null){
                curr=curr.next;
        }                
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Delete form head
    Node1 deleteHeadDLL(Node1 head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        else{
            head = head.next;
            head.prev = null;
            return head;
        }
    }
}

public class ImplementDoublyLL{

    public static void main(String[] args){

        Node1 head = new Node1(10);
        Node1 temp1 = new Node1(20);
        Node1 temp2 = new Node1(30);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        head.printlist1(head);


        int data = 5;
        head = head.insertAtBeginDLL(head, data);
        head.printlist1(head);

        head = head.insertAtLastDLL(head, 70);
        head = head.insertAtLastDLL(head, 80);
        head.printlist1(head);

        head = head.deleteHeadDLL(head);
        head.printlist1(head);
    }
    
}