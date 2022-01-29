package hashmap;

import java.util.HashMap;

public class map30 {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Boolean> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], false);
            }else{
                map.put(arr[i], true);
            }
        }

        int ct = 0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==true){
                ct++;
            }
            if(ct == k){
                return arr[i];
            }
        }
        return "";
    }
}
