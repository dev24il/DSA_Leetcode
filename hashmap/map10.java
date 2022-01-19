package hashmap;

import java.util.HashMap;
import java.util.Set;

public class map10 {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        HashMap<Integer,Boolean> nap = new HashMap<>();
        Set<Integer> grow = map.keySet();
        for(Integer s : grow){
            if(nap.containsKey(map.get(s))){
                return false;
            }else{
                nap.put(map.get(s), true);
            }
        }
        return true;
    }
}
