package heap;

import java.util.PriorityQueue;
import java.util.Collections;

public class Heap2 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }

        while(!pq.isEmpty()){
            int a = pq.poll();
            if(pq.isEmpty() == true){
                return a;
            }
            int b = pq.poll();
            if(a < b || a > b){
                int c = Math.abs(a-b);
                pq.add(c);
            }
        }

        return 0;
    }
}
