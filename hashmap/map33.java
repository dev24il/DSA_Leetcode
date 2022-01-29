package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class map33 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> nap = new HashMap<>();
        HashMap<String, Integer> dummy = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i], i);
        }
        for(int i=0;i<list2.length;i++){
            nap.put(list2[i], i);
        }

        int l = 0;
        int max = Integer.MAX_VALUE;
        Set<String> grow = map.keySet();
        for(String j : grow){
            if(nap.containsKey(j)){
                int ct = map.get(j)+nap.get(j);
                dummy.put(j, ct);
                if(max >= ct){
                    max = ct;
                }
            }
        }

        Set<String> frog = dummy.keySet();
        for(String g : frog){
            if(dummy.get(g)==max){
                arr.add(l, g);
                l++;
            }
        }


        String[] brr = new String[arr.size()];
        for(int i=0;i<brr.length;i++){
            brr[i] = arr.get(i);
        }
        return brr;
    }
}
