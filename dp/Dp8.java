package dp;

public class Dp8 {
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }
        dp[nums.length - 1] = 1;

        int max = dp[0];
        for (int i = nums.length - 2; i >= 0; i--) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[j] > nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 3, 3, 3, 3, 3, 3 };
        System.out.println(lengthOfLIS(nums));
    }
}