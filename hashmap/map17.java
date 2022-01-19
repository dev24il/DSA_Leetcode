package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class map17 {
    public static int secondHighest(String s) {
        HashMap<Character,Boolean> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!(s.charAt(i)>='a' && s.charAt(i)<='z')){
                map.put(s.charAt(i), true);
            }
        }

        Set<Character> grow = map.keySet();
        int[] arr = new int[map.size()];
        int l = 0;
        for(Character j : grow){
            int row = j - '0';
            arr[l] = row;
            l++;
        }
        Arrays.sort(arr);
        if(arr.length>=2){
            return arr[arr.length-2];
        }
        return 0;
    }
}
