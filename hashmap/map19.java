package hashmap;

import java.util.HashMap;
import java.util.Set;

public class map19 {
    public static boolean areOccurrencesEqual(String s) {
        if(s.length()==0){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }

        int ans = map.get(s.charAt(0));
        Set<Character> grow = map.keySet();
        for(Character h : grow){
            if(map.get(h) != ans){
                return false;
            }
        }
        return true;
    }
}
