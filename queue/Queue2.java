package queue;

import java.util.Stack;

public class Queue2 {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public Queue2() {
        
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(st1.isEmpty() != true){
            st2.push(st1.pop());
        }
        int ans = st2.pop();

        while(st2.isEmpty() != true){
            st1.push(st2.pop());
        }
        return ans;
    }
    
    public int peek() {
        while(st1.isEmpty() != true){
            st2.push(st1.pop());
        }
        int ans = st2.peek();

        while(st2.isEmpty() != true){
            st1.push(st2.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}
