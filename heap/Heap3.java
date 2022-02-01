package heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Heap3 {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,String> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            pq.add(score[i]);
        }

        int k = 4;
        map.put(pq.poll(), "Gold Medal");
        map.put(pq.poll(), "Silver Medal");
        map.put(pq.poll(), "Bronze Medal");
        while(!pq.isEmpty()){
            int c = pq.poll();
            String str3 = String.valueOf(k);
            map.put(c, str3);
            k++;
        }

        String[] brr = new String[score.length];
        for(int i=0;i<score.length;i++){
            brr[i] = map.get(score[i]);
        }
        return brr;
    }
}
