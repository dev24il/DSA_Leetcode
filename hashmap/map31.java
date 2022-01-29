package hashmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class map31 {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Boolean> map = new HashMap<>();
        int i = 0;
        String str = "";
        while(i != s1.length()){
            if(s1.charAt(i)==' '){
                if(map.containsKey(str)){
                    map.put(str, false);
                }else{
                    map.put(str, true);
                }
                str = "";
                i++;
            }
            str += s1.charAt(i);
            i++;
        }
        if(map.containsKey(str)){
            map.put(str, false);
        }else{
            map.put(str, true);
        }

        int j = 0;
        String ptr = "";
        while(j != s2.length()){
            if(s2.charAt(j)==' '){
                if(map.containsKey(ptr)){
                    map.put(ptr, false);
                }else{
                    map.put(ptr, true);
                }
                ptr = "";
                j++;
            }
            ptr += s2.charAt(j);
            j++;
        }
        if(map.containsKey(ptr)){
            map.put(ptr, false);
        }else{
            map.put(ptr, true);
        }

        ArrayList<String> arr = new ArrayList<>();
        Set<String> grow = map.keySet();
        int l = 0;
        for(String d : grow){
            if(map.get(d)==true){
                arr.add(l, d);
                l++;
            }
        }
        String[] brr = new String[arr.size()];
        for(int il=0;il<brr.length;il++){
            brr[il] = arr.get(il);
        }

        return brr;
    }
}
