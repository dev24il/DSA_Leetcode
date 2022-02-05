package array;
import java.lang.Math;

public class Array5{
    public static int binary(int[] nums, int low, int high, int key){
        if(low > high){
            return -1;
        }

        int mid = (low+high)/2;
        if(nums[mid]==key){
            return mid;
        }else if(nums[mid]>key){
            return binary(nums, low, mid-1, key);
        }else{
            return binary(nums, mid+1, high, key);
        }
    }

    public static int search(int[] nums, int target) {
        return binary(nums, 0, nums.length-1, target);
    }

    public int mySqrt(int x) {
        int ans = (int) Math.sqrt(x);
        return ans;
    }
}