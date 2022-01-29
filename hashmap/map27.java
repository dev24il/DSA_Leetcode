package hashmap;
import java.util.HashMap;

public class map27{
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ct = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    ct++;
                }
            }
            map.put(nums[i], ct);
        }

        for(int i=0;i<nums.length;i++){
            arr[i] = map.get(nums[i]);
        }
        return arr;
    }
}