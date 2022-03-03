package dp;

public class Dp10 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        dp[n-1] = true;

        for(int i=n-2;i>=0;i--){
            for(int j=1;j<=nums[i] && i+j<n;j++){
                if(dp[i+j]==true){
                    dp[i] = true;
                }
            }
        }
        return dp[0];
    }
}
