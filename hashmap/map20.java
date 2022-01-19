package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class map20 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> nap = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i])+1);
            }else{
                map.put(nums1[i], 1);
            }
        }
        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && !arr.contains(nums2[i])){
                arr.add(nums2[i]);
            }
            if(nap.containsKey(nums2[i])){
                nap.put(nums2[i], nap.get(nums2[i])+1);
            }else{
                nap.put(nums2[i], 1);
            }
        }

        for(int i=0;i<nums3.length;i++){
            if(map.containsKey(nums3[i]) && !arr.contains(nums3[i])){
                arr.add(nums3[i]);
            }
            if(nap.containsKey(nums3[i]) && !arr.contains(nums3[i])){
                arr.add(nums3[i]);
            }
        }
        return arr;
    }

}
