package Alpha;

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void printList(){
        
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();

    }



    public void addFirst(int data){
        //Creating new node
        Node node = new Node(data);
        size++;
        //check if head is null if null thel assign nre node to head
        if(head == null){
            head = tail = node;
            return;
        }
        //Pointing the head to the node
        node.next = head;
        // Update head to new node
        head = node;
    }

    public void addLast(int data){

        Node node = new Node(data);
        size++;
        //case-1: if tail is null
        if(head == null){
            head = tail = node;
            return;
        }

        //case-2: If the tail is not null
        tail.next = node;
        tail = node;
    }


    //Insert node at midddle
    public void addMiddle(int index, int data){
        //If index is 0
        if(index == 0){
            addFirst(data);
            return;
        }

        Node node = new Node(data);
        size++;
        Node temp = head;
        int pos = 0;


        while (pos < index-1) {
            temp=temp.next;
            pos++;
        }
         //pos = index-1; temp-> prev
         node.next = temp.next;
         temp.next = node;
    }


    //Size of linkedlist

    //Remove last
    public int removeFirst(){

        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }

        int val = head.data;
        head=head.next;
        size--;
        return val;
    }

    //Remove last
    public int removeLast(){

        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size ==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev: i=size-2
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    //Search data interatively
    public int searchInteratively(int x){ //O(n)
        Node temp = head;
        int i=0;
        while (temp!= null) {
            if(temp.data == x){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int help(Node head, int x){
        if(head == null){
            return -1;
        }
        if(head.data == x){
            return 0;
        }
        int idx = help(head.next, x);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int searchRecursivly(int x){    
        return help(head, x);
    }



    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2); 
        ll.addFirst(1); 
        ll.addLast(4); 
        ll.addLast(5);
        ll.addMiddle(2,3);

        ll.printList(); //1 2 3 4 5
        System.out.println(LinkedList.size);

        ll.removeFirst();
        ll.printList();

        ll.removeLast();
        ll.printList();
        System.out.println(LinkedList.size);

        System.out.println(ll.searchInteratively(4));

        System.out.println(ll.searchRecursivly(2));

    }
} 
