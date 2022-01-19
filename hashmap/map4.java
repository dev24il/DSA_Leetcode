package hashmap;

import java.util.HashMap;

public class map4 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int ans = map.get(nums[i]);
                int a = Math.abs(i-ans);
                if(a<=k){
                    return true;
                }
                map.put(nums[i], i);
            }else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
