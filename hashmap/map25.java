package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class map25 {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> nap = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                return true;
            }else{
                map.put(arr[i]*2, arr[i]);
            }
        }

        for(int i=arr.length-1;i>=0;i--){
            if(nap.containsKey(arr[i])){
                return true;
            }else{
                nap.put(arr[i]*2, arr[i]);
            }
        }
        return false;
    }
}
