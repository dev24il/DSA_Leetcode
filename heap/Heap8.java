package heap;

public class Heap8 {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0, minLength = n+1, start = 0, end = 0;
        while(end < n){
            while(sum <= target && end < n){
                sum += nums[end++];
            }

            while(sum > target && start < n){
                if(end - start < minLength){
                    minLength = end - start; 
                }
                sum -= nums[start++];
            }
        }
        
        if(minLength == n+1){
            return 0;
        }
        return minLength;
    }
}
