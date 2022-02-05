package array;

public class Array6 {
    public int peakIndexInMountainArray(int[] arr) {
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }

        return -1;
    }

    public int countGoodSubstrings(String s) {
        if(s.length()<3){
            return -1;
        }

        int ct = 0;
        if(s.charAt(0)!=s.charAt(1) && s.charAt(1)!=s.charAt(2) && s.charAt(0)!=s.charAt(2)){
            ct++;
        }

        for(int i=1;i<=s.length()-3;i++){
            if(s.charAt(i-1)!=s.charAt(i) && s.charAt(i)!=s.charAt(i+1) && s.charAt(i-1)!=s.charAt(i+1)){
                ct++;
            }
        }
        return ct;
    }

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }

        double ans = sum/(double)k;
        int j = 0;
        for(int i=k;i<nums.length;i++){
            sum = sum - nums[j];
            sum = sum + nums[i];

            double rev = sum/(double)k;
            if(ans < rev){
                ans = rev;
            }
            j++;
        }
        return ans;
    }
}
