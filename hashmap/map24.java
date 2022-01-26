package hashmap;

import java.util.HashMap;
import java.util.Set;

public class map24 {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int ct = map.get(arr[i]);
                map.put(arr[i], ct+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        int max = 0;
        Set<Integer> gorw = map.keySet();
        for(Integer j : gorw){
            if(map.get(j)==j && max < j){
                max = j;
            }
        }
        return max;
    }
}
