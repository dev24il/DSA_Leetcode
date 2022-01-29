package hashmap;

import java.util.HashMap;
import java.util.Set;

public class map29 {
    public static int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        int ans = 0;
        Set<Integer> grow = map.keySet();
        for(Integer h : grow){
            if(map.get(h)==nums.length/2){
                return h;
            }
        }
        return ans;
    }
}
