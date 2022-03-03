package dp;

public class Dp11 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[m-1][n-1] = grid[m-1][n-1];

        for(int i=n-2;i>=0;i--){
            dp[m-1][i] = grid[m-1][i] + dp[m-1][i+1];
        }

        for(int i=m-2;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(j==n-1){
                    dp[i][j] = dp[i+1][j] + grid[i][j];
                }else{
                    int ans = Math.min(dp[i+1][j], dp[i][j+1]);
                    dp[i][j] = grid[i][j] + ans;
                }
            }
        }

        return dp[0][0];
    }
}
