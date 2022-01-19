package hashmap;

import java.util.HashMap;

public class map18 {
    public static boolean checkIfPangram(String sentence) {
        HashMap<Character,Boolean> map = new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            map.put(sentence.charAt(i), true);
        }

        System.out.println(map.size());
        if(map.size()==24){
            return true;
        }
        return false;
    }
}
