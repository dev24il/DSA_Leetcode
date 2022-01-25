package stack;

import java.util.Stack;

public class stack8 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] brr = new int[n];
        for(int k = 0; k < n;k++){
            brr[k] = -1;
        }
        Stack<Integer> st = new Stack<>();

        st.push(0);
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[st.peek()]){
                while(st.size()>0 && nums[i] < nums[st.peek()]){
                    brr[st.pop()] = nums[i];
                }
                st.push(i);
            }else{
                st.push(i);
            }
        }

        Stack<Integer> pt = new Stack<>();
        pt.push(n-1);
        for(int i = n-2; i >= 0; i--){
            if(nums[i] < nums[st.peek()]){
                while(st.size()>0 && nums[i] == -1 && nums[i] < nums[st.peek()]){
                    brr[st.pop()] = nums[i];
                }
                st.push(i);
            }else{
                st.push(i);
            }
        }

        return brr;
    }
}
