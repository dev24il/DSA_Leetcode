package heap;
import java.util.Collections;
import java.util.PriorityQueue;

public class Heap7 {
    public int maxProfit(int[] prices) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int ans = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i]){
                    pq.add(prices[j]-prices[i]);
                }
            }
        }

        if(!pq.isEmpty()){
            return pq.poll();
        }
        return ans;
    }
}
