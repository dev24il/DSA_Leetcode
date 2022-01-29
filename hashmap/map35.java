package hashmap;

import java.util.HashMap;
import java.util.Set;

public class map35 {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i=0;i<words1.length;i++){
            if(map1.containsKey(words1[i])){
                map1.put(words1[i], map1.get(words1[i])+1);
            }else{
                map1.put(words1[i], 1);
            }
        }

        for(int i=0;i<words2.length;i++){
            if(map2.containsKey(words2[i])){
                map2.put(words2[i], map2.get(words2[i])+1);
            }else{
                map2.put(words2[i], 1);
            }
        }

        int ct = 0;
        Set<String> grow = map1.keySet();
        for(String g : grow){
            if(map1.get(g)==1 && map2.containsKey(g) && map2.get(g)==1){
                ct++;
            }
        }
        return ct;
    }
}
