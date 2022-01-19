package hashmap;

import java.util.HashMap;
import java.util.Set;

public class map16 {
    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], false);
            }else{
                map.put(nums[i], true);
            }
        }

        int sum = 0;
        Set<Integer> grow = map.keySet();
        for(Integer f : grow){
            if(map.get(f)==true){
                sum += f;
            }
        }
        return sum;
    }
}
