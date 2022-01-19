package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class map13 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
