package gfg;

import java.io.*;
import java.util.*;

class DynamicStack{

    ArrayList<Integer> al=new ArrayList<>();
    void push(int x){
        al.add(x);
    }

    int pop(){
        int top=al.get(al.size()-1);
        al.remove(al.size()-1);
        return top;
    }

    int peek(){
        return al.get(al.size()-1);
    }

    int size(){
        return al.size();
    }

    boolean isEmpty(){
        return al.isEmpty();
    }
}

class StackImpl{

    public static void main (String[] args)
    {
        DynamicStack s=new DynamicStack();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}