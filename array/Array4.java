package array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Array4 {
    public List<Integer> maxScoreIndices(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            q.add(nums[i]);
        }
        map.put(0, sum);

        int idx = 1, su = sum;
        while(!q.isEmpty()){
            int pop = q.poll();
            if(pop == 0){
                su = su + 1;
                map.put(idx, su);
            }else{
                su = su - 1;
                map.put(idx, su);
            }
            idx++;
        }

        Set<Integer> grow = map.keySet();
        int max = Integer.MIN_VALUE;
        for(Integer j : grow){
            if(map.get(j)>max){
                max = map.get(j);
            }
        }

        for(Integer g : grow){
            if(map.get(g) == max){
                arr.add(g);
            }
        }
        return arr;
    }
}
