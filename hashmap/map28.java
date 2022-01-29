package hashmap;

import java.util.HashMap;

public class map28 {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }

        char ans = 'a';
        for(int i=0;i<t.length();i++){
            if((map.containsKey(t.charAt(i)) && map.get(t.charAt(i))==0) || !map.containsKey(t.charAt(i))){
                ans = t.charAt(i);
            }else{
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            }
        }
        return ans;
    }

    public char findTheDifferenceNew(String s, String t) {
        int sumA = 0;
        int sumB = 0;

        for(int i = 0; i < s.length(); i++){
            sumA += s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++){
            sumB += t.charAt(i);
        }
        int diff = sumB-sumA;
        char res = (char) diff;
        return res;
    }
}
