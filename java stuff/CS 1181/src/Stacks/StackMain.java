package Stacks;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(7);
        s.push(9);
        s.push(12);
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
}
