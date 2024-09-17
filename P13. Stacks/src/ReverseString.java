import javax.swing.text.SimpleAttributeSet;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);

    }

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int i=0;
        while (i < str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
}
