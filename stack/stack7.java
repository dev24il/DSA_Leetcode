package stack;

import java.util.HashMap;
import java.util.Stack;

public class stack7 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] arr = new int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums2[i], -1);
        }

        for(int i=1;i<n;i++){
            if(nums2[i]>nums2[st.peek()]){
                while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
                    map.put(nums2[st.pop()], nums2[i]);
                }
                st.push(i);
            }else{
                st.push(i);
            }
        }

        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                arr[i] = map.get(nums1[i]);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        
    }
}
