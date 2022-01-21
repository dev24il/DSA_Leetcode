package dp;

public class Dp9 {
    public static int integerReplacementI(int n, int[] dp) {
        if(n == 1){
            return 0;
        }
        int ans1;
        int ans3, ans2 = Integer.MAX_VALUE;
        if(dp[n-1]==-1){
            ans1 = integerReplacementI(n-1,dp);
            dp[n-1] = ans1;
        }else{
            ans1 = dp[n-1];
        }

        if(dp[n+1]==-1){
            ans3 = integerReplacementI(n+1,dp);
            dp[n+1] = ans3;
        }else{
            ans3 = dp[n+1];
        }

        if(n%2==0){
            if(dp[n/2]==-1){
                ans2 = integerReplacementI(n/2,dp);
                dp[n/2] = ans2;
            }else{
                ans2 = dp[n/2];
            }
        }

        return Math.min(Math.min(ans1, ans2), ans3) + 1;
    }

    public int integerReplacement(int n) {
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = -1;
        }
        return integerReplacementI(n, dp);
    }
}
