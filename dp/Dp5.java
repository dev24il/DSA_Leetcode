// House Robber
package dp;

public class Dp5 {
    public static int rob(int[] nums) {
        int[] incl = new int[nums.length];
        int[] excl = new int[nums.length];
        incl[0] = nums[0];
        excl[0] = 0;

        for(int i=1;i<nums.length;i++){
            incl[i] = excl[i-1] + nums[i];
            excl[i] = Math.max(incl[i-1], excl[i-1]);
        }

        return Math.max(incl[nums.length-1], excl[nums.length-1]);
    }

    public int rob2(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }else if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int[] incl = new int[nums.length];
        int[] excl = new int[nums.length];
        incl[0] = nums[0];
        excl[0] = 0;

        for(int i=1;i<nums.length-1;i++){
            incl[i] = excl[i-1] + nums[i];
            excl[i] = Math.max(incl[i-1], excl[i-1]);
        }

        return Math.max(incl[nums.length-2], Math.max(excl[nums.length-2],nums[nums.length-1]));
    }
}