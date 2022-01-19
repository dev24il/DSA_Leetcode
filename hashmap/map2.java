package hashmap;

import java.util.HashMap;

public class map2 {
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        int ct = 0;
        for(int i=0;i<nums.length;i++){
            if((map.containsKey(k-nums[i]) && nums[i]!=k-nums[i]) || (nums[i]/2 == k && map.containsKey(k-nums[i]) && map.get(k-nums[i])>1)){
                ct++;
                int ans = map.get(k-nums[i]);
                map.put(k-nums[i], ans-1);
                map.remove(nums[i]);
            }
        }
        return ct;
    }
}
