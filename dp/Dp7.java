package dp;

public class Dp7 {
    public static int maxProduct(int[] nums) {
        int[] arr = nums;
        int result = arr[0];
        int n = arr.length;
 
        for (int i = 0; i < n; i++)
        {
            int mul = arr[i];
            for (int j = i + 1; j < n; j++)
            {
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            result = Math.max(result, mul);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0,2};
        System.out.println(maxProduct(arr));
    }
}
