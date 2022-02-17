package stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class stack11{
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        Deque<Integer> dq = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<students.length;i++){
            dq.addLast(students[i]);
            st.push(sandwiches[i]);
        }

        int ct = 0;
        int c = 0;
        while(!dq.isEmpty()){
            if(dq.peekFirst() == st.peek()){
                dq.pollFirst();
                st.pop();
                c++;
                ct = 0;
            }else{
                int ele = dq.pollFirst();
                dq.addLast(ele);
                ct++;
                if(ct == dq.size()){
                    return ct;
                }
            }
        }
        return n-c;
    }

    public int solve(int A) {
        int[] arr = new int[A/2];
        if(A%2!=0){
            int ct = 2;
            for(int i=0;i<A/2;i++){
                arr[i] = ct;
                ct += 2;
            }
            return arr[arr.length/2];
        }else{
            int ct = 1;
            for(int i=0;i<A/2;i++){
                arr[i] = ct;
                ct += 2;
            }
        }

        return arr[arr.length/2-1];
    }
}