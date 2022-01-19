package hashmap;

import java.util.HashMap;

public class map5 {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                char a = map.get(s.charAt(i));
                if(a != t.charAt(i)){
                    return false;
                }
            }else{
                map.put(s.charAt(i), t.charAt(i));
            }
        }

        HashMap<Character,Character> nap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(nap.containsKey(t.charAt(i))){
                char a = nap.get(t.charAt(i));
                if(a != s.charAt(i)){
                    return false;
                }
            }else{
                nap.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
