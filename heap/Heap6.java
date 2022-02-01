package heap;
import java.util.Collections;
import java.util.PriorityQueue;

public class Heap6 {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(Long.parseLong(nums[i]));
        }

        String ans = "0";
        while(k!=0){
            ans = String.valueOf(pq.poll());
            k--;
        }
        return ans;
    }
}
