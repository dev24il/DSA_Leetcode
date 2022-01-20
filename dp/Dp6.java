package dp;

public class Dp6 {
    public static int jump(int[] nums) {
        var len = nums.length;
        
        if(len==0) {
            return 0;
        }
        
        int[] dp = new int[len];
        dp[len-1] = 0;
        
        if(len>1) {
            dp[len-2] = 1;
        }
        
        for(int i=len-3;i>=0;i--) {
            var min = Integer.MAX_VALUE;
            for(int j=i+1;j<i+1+nums[i] && j<len;j++){
                if(dp[j] == -1) continue;
                min = Math.min(min, 1+dp[j]);
            }
            dp[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, 1, 4 };
        System.out.println(jump(arr));
    }
}
