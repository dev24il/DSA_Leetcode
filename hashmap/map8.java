package hashmap;

import java.util.HashMap;

public class map8 {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans = 0, found = 0;
        for(int i=0;i<s.length();i++){
            if(i != s.length()-1){
                if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                    ans = ans + map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                    if(i+1 == s.length()-1){
                        found++;
                    }
                    i++;
                }else{
                    ans += map.get(s.charAt(i));
                }
            }
        }

        if(found == 0){
            ans += map.get(s.charAt(s.length()-1));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
}