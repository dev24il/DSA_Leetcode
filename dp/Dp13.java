package dp;

public class Dp13 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[m-1][n-1] = 1;
        for(int i=n-2;i>=0;i--){
            dp[m-1][i] = dp[m-1][i+1];
        }

        for(int i=m-2;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(j==n-1){
                    dp[i][j] = dp[i+1][j];
                }else{
                    dp[i][j] = dp[i+1][j] + dp[i][j+1];
                }
            }
        }

        return dp[0][0];
    }
}
