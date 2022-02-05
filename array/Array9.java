package array;

import java.util.Stack;

public class Array9 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] brr = new int[n];
        for(int i=0;i<n;i++){
            brr[i] = -1;
        }

        Stack<Integer> st = new Stack<>();
        st.add(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && prices[i]>prices[st.peek()]){
                brr[st.pop()] = prices[i];
            }
            st.push(i);
        }

        for(int i=0;i<n;i++){
            System.out.print(brr[i] + " ");
        }

        int ans = 0;
        for(int i=0;i<prices.length;i++){
            if(brr[i]!=-1){
                ans += brr[i]-prices[i];
            }
        }
        return ans;
    }
}
