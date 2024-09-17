package gfg;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {
    public static void main(String[] args) {

        String str = "{()}";
        System.out.println(balancedParenthesis(str));

    }

    static boolean balancedParenthesis(String str){

        Deque<Character> s = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                s.push(x);
            }
            else {
                if(s.isEmpty()){ // we can write it as s.isEmpty()==true
                    return false;
                } else if (isMatching(s.peek(), x) == false) {
                    return false;
                }
                else {
                    s.pop();
                }
            }
        }

       return (s.isEmpty()==true);
    }

    public static boolean isMatching(char a, char b){
        return (a=='(' && b==')') ||
                (a=='{' && b=='}') ||
                (a=='[' && b==']');
    }
}
