package hashmap;
import java.util.HashMap;

public class map22 {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int[] arr = new int[2];

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], false);
            }else{
                map.put(nums[i], true);
            }
        }

        for(int i=1;i<=nums.length;i++){
            if(map.containsKey(i) && map.get(i)==false){
                arr[0] = i;
            }else if(!map.containsKey(i)){
                arr[1] = i;
            }
        }
        return arr;
    }
}
