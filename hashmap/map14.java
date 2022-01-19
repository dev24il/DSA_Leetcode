package hashmap;

import java.util.HashMap;

public class map14 {
    public static int distributeCandies(int[] candyType) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<candyType.length;i++){
            map.put(candyType[i], true);
        }
        int ans = map.size();
        if(ans > candyType.length/2){
            return candyType.length/2;
        }
        return ans;
    }
}
