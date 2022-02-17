package hashmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class map36 {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1 && (!map.containsKey(nums[i]+1) && !map.containsKey(nums[i]-1))){
                arr.add(nums[i]);
            }
        }
        return arr;
    }
}
