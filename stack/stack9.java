package stack;

import java.util.Deque;
import java.util.LinkedList;

public class stack9 {
    public static int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> dq = new LinkedList<>();
        Deque<Integer> pq = new LinkedList<>();

        for(int i=0;i<students.length;i++){
            dq.addLast(students[i]);
            pq.addLast(sandwiches[i]);
        }
        
        int ans = 0;
        while(dq.isEmpty()!=true){
            if(dq.peekFirst() != pq.peekFirst()){
                int val = dq.pollFirst();
                dq.addLast(val);
            }else if(dq.peekFirst() == pq.peekFirst()){
                dq.pollFirst();
                pq.pollFirst();
            }
        }

        return ans;
    }
}
