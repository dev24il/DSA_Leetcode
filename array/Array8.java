package array;

public class Array8 {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i]>arr[i+1]){
                arr[i] = nums[i];
            }else{
                arr[i] = arr[i+1];
            }
        }

        int ans = -1;
        for(int i=0;i<n;i++){
            if(arr[i]!=nums[i]){
                ans = Math.max(ans, arr[i]-nums[i]);
            }
        }
        return ans;
    }
}
