package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap4 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }

        int ans = Integer.MIN_VALUE;
        while(k!=0){
            ans = pq.poll();
            k--;
        }
        return ans;
    }
}
