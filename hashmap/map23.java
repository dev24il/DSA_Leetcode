package hashmap;
import java.util.HashMap;

public class map23 {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character, Boolean> map = new HashMap<>();
        for(int i=0;i<allowed.length();i++){
            map.put(allowed.charAt(i), true);
        }

        int ans = 0;
        for(int i=0;i<words.length;i++){
            String str = words[i];
            int j = 0, found = 0;
            while(j != str.length()){
                if(!map.containsKey(str.charAt(j))){
                    found++;
                    break;
                }
                j++;
            }
            if(found == 0){
                ans += 1;
            }
        }
        return ans;
    }
}
