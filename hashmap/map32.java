package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class map32 {
    public static String[] findWords(String[] words) {
        ArrayList<String> arr = new ArrayList<>();
        HashMap<Character, Boolean> map1 = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();
        HashMap<Character, Boolean> map3 = new HashMap<>();
        String a = "qwertyuiop";
        String b = "asdfghjkl";
        String c = "zxcvbnm";
        for(int i=0;i<a.length();i++){
            map1.put(a.charAt(i), true);
            map1.put((char) (a.charAt(i)-32), true);
        }
        for(int i=0;i<b.length();i++){
            map2.put(b.charAt(i), true);
            map2.put((char) (b.charAt(i)-32), true);
        }
        for(int i=0;i<c.length();i++){
            map3.put(c.charAt(i), true);
            map3.put((char) (c.charAt(i)-32), true);
        }

        int l =0;
        for(int i=0;i<words.length;i++){
            String str = words[i];
            int ct1 = 0, ct2 = 0, ct3 = 0;
            for(int j=0;j<str.length();j++){
                if(map1.containsKey(str.charAt(j))){
                    ct1++;
                }else if(map2.containsKey(str.charAt(j))){
                    ct2++;
                }else{
                    ct3++;
                }
            }
            if((ct1 == 0 && ct2 == 0 && ct3 !=0) || (ct1 != 0 && ct2 == 0 && ct3 ==0) || (ct1 == 0 && ct2 != 0 && ct3 ==0)){
                arr.add(l, str);
                l++;
            }
        }


        String[] brr = new String[arr.size()];
        for(int i=0;i<arr.size();i++){
            brr[i] = arr.get(i);
        }
        return brr;
    }

    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        String[] arr = findWords(words);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }
    }
}
