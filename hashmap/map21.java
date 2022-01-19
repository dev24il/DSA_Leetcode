package hashmap;

import java.util.HashMap;

public class map21 {
    public int numDifferentIntegers(String word) {
        HashMap<String, Boolean> map = new HashMap<>();
        String ans = "";
        for(int i=0;i<word.length();i++){
            if(!(word.charAt(i)>='a' && word.charAt(i)<='z')){
                ans += word.charAt(i);
                if(i!=word.length()-1 && word.charAt(i+1)>='a' && word.charAt(i+1)<='z'){
                    map.put(ans, true);
                    ans = "";
                }
                if(i == word.length()-1 && !(word.charAt(i+1)>='a' && word.charAt(i+1)<='z')){
                    ans += word.charAt(i);
                    map.put(ans, true);
                }
            }
        }
        return map.size();
    }
}
