package hashmap;

import java.util.HashMap;

public class map36 {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<chars.length();i++){
            if(map.containsKey(chars.charAt(i))){
                map.put(chars.charAt(i), map.get(chars.charAt(i))+1);
            }else{
                map.put(chars.charAt(i), 1);
            }
        }

        int ct = 0;
        for(int i=0;i<words.length;i++){
            if()
        }
        return ct;
    }
}
