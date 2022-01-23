package queue;

import java.util.ArrayList;
import java.util.Arrays;

public class Queue3 {
    ArrayList<Integer> arr = new ArrayList<>();
    int i = 0;
    public Queue3() {
        
    }
    
    public int ping(int t) {
        arr.add(i, t);
        i++;
        int ans = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=t-3000){
                ans = arr.size()-i;
                break;
            }
        }

        return ans;
    }

    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}
