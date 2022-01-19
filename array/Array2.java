package array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Array2 {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int ans = map.get(nums[i]);
                map.put(nums[i], ans+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        int ct = 0;
        Set<Integer> grow = map.keySet();
        for(Integer s : grow){
            if(map.get(s) > nums.length/2){
                ct = s;
            }
        }
        return ct;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
