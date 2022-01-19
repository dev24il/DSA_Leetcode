package hashmap;

import java.util.HashMap;
import java.util.Set;

public class map12 {
    public static int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }

        int ans = 0;
        Set<Character> grow = map.keySet();
        for(Character t : grow){
            if(map.containsKey(t) && map.get(t)%2==0){
                ans += map.get(t);
            }else if(map.containsKey(t) && map.get(t)%2!=0){
                ans += map.get(t) - 1;
            }
        }
        return s.length() >= ans + 1 ? ans + 1 : ans;
    }
}
