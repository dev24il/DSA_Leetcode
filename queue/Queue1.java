package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public Queue1() {
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size() != 1){
            q2.add(q1.poll());
        }
        int ans = q1.poll();

        while(q2.isEmpty() != true){
            q1.add(q2.poll());
        }
        return ans;
    }
    
    public int top() {
        while(q1.size() != 1){
            q2.add(q1.poll());
        }
        int ans = q1.poll();

        while(q2.isEmpty() != true){
            q1.add(q2.poll());
        }
        q1.add(ans);
        return ans;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
