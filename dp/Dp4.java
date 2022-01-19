package dp;

public class Dp4 {
    public int maxSubArray(int[] nums) {
        int max_so = Integer.MIN_VALUE;
        int max = 0;

        for(int i=0;i<nums.length;i++){
            max = max + nums[i];
            if(max_so < max){
                max_so = max;
            }
            if(max < 0){
                max = 0;
            }
        }
        return max_so;
    }
}
