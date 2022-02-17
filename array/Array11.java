package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Array11 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, ct = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ct = 0;
            }else{
                ct++;
                ans = Math.max(ans, ct);
            }
        }
        return ans;
    }

    public int countElements(int[] nums) {
        int ct = 0;
        for(int i=0;i<nums.length;i++){
            int ct1 = 0, ct2 = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    ct1++;
                }
                if(nums[i]<nums[j]){
                    ct2++;
                }
            }
            if(ct1!=0 && ct2!=0){
                ct++;
            }
        }
        return ct;
    }

    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                pq.add(nums[i]);
            }
            map.put(nums[i], true);
        }
        int ans = 0;
        int max = pq.peek();

        int ct = 0;
        while(ct!=3){
            if(pq.isEmpty()==false){
                ans = pq.remove();
            }else{
                return max;
            }
            ct++;
        }
        return ans;
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a1 = nums[0]*nums[1];
        int a2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        if(a1*nums[nums.length-1]>a2){
            return a1*nums[nums.length-1];
        }
        return a2;
    }

    public static long[] printFibb(int n) {
        if(n==1){
            long[] brr = new long[1];
            brr[0] = 1;
            return brr;
        }else if(n==2){
            long[] brr = new long[2];
            brr[0] = 1;
            brr[1] = 1;
            return brr;
        }
        long[] arr = new long[n];
        arr[0] = 1;
        arr[1] = 1;

        for(int i=2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }
}
