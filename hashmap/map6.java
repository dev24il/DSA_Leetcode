package hashmap;

import java.util.HashMap;

public class map6 {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int ct = map.get(s.charAt(i));
                map.put(s.charAt(i), ct+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i))!=0){
                int ct = map.get(t.charAt(i));
                map.put(t.charAt(i), ct-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
