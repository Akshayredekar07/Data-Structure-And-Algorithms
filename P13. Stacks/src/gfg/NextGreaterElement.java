package gfg;
import java.util.ArrayList;
import java.util.Stack;

class NextGreaterElement {

    static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            res.add(-1); // Initialize with -1
        }

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                res.set(stack.pop(), arr[i]);
            }
            stack.push(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };

        ArrayList<Integer> res = nextLargerElement(arr);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}