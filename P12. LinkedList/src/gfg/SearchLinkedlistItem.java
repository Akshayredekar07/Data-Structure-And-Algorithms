
public class SearchLinkedlistItem{public static void main(String[] args) {

    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);

    int x = 20;
    int res = searchPosition(head, x);  
    System.out.println(res);

    x = 40;
    int ans = searchRecursive(head, x);  
    System.out.println(ans);

}

static int searchPosition(Node head, int x) {
    int pos = 1;
    Node curr = head;

    while (curr != null) {
        if (curr.data == x) {
            return pos;
        }
        curr = curr.next;
        pos++;
        }
        return -1;
    }


    // static int searchRecursive(Node head, int x){
    //     if(head == null){
    //         return -1;
    //     }
    //     if(head.data == x){
    //         return 1;
    //     }else{
    //         int res = searchRecursive(head.next, x);
    //         if(res == -1){
    //             return -1;
    //         }
    //         else{
    //             return res+1;
    //         }
    //     }
    // }

    static int searchRecursive(Node head, int x) {
        if (head == null) {
            return -1;
        }
        if (head.data == x) {
            return 1;
        }
        int res = searchRecursive(head.next, x);
        return res == -1 ? -1 : res + 1;
    }
}

/*
 
searchRecursive(Node(10), 40)
└── searchRecursive(Node(20), 40)
    └── searchRecursive(Node(30), 40)
        └── searchRecursive(Node(40), 40)
            └── return 1
        return 2
    return 3
return 4 

Stack Memory (growing downwards):
| Main                           |
|-----------------------------|
| searchRecursive(Node(10), 40) |
| head = Node(10)               |
| x = 40                        |
| res = ?                       |
|-----------------------------|
| searchRecursive(Node(20), 40) |
| head = Node(20)               |
| x = 40                        |
| res = ?                       |
|-----------------------------|
| searchRecursive(Node(30), 40) |
| head = Node(30)               |
| x = 40                        |
| res = ?                       |
|-----------------------------|
| searchRecursive(Node(40), 40) |
| head = Node(40)               |
| x = 40                        |
| res = 1                       |
|-----------------------------|

Now, let's see how the stack unwinds:
| Main                           |
|-----------------------------|
| searchRecursive(Node(10), 40) |
| head = Node(10)               |
| x = 40                        |
| res = 4                       |
|-----------------------------|
| searchRecursive(Node(20), 40) |
| head = Node(20)               |
| x = 40                        |
| res = 3                       |
|-----------------------------|
| searchRecursive(Node(30), 40) |
| head = Node(30)               |
| x = 40                        |
| res = 2                       |
|-----------------------------|

 */