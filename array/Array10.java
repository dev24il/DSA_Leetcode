package array;

public class Array10 {
    public int longestOnes(int[] nums, int k) {
        int sum = 0, cnt0 = 0;

        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                cnt0++;
            }

            if(cnt0 <= k){
                sum = Math.max(sum, i-j+1);
            }
            while(cnt0 > k){
                if(nums[j]==0){
                    cnt0--;
                }
                j++;
            }
        }
        return sum;
    }
}
