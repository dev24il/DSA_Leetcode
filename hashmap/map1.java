package hashmap;

import java.util.HashMap;
public class map1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }

        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i){
                arr[0] = i;
                arr[1] = map.get(target-nums[i]);
                break;
            }
        }
        return arr;
    }
}
