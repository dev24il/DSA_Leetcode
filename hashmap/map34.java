package hashmap;

public class map34 {
    public int numIdenticalPairs(int[] nums) {
        int ct = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    ct++;
                }
            }
        }
        return ct;
    }
}