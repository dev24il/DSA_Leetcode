package twopointer;

public class hry {
    public static boolean checkInclusion(String s1, String s2) {
        boolean a1 = s2.contains(s1);

        String ans = "";
        for(int i=s2.length()-1;i>=0;i--){
            ans += s2.charAt(i);
        }
        System.out.println(ans);
        boolean a2 = ans.contains(s1);
        return a1 || a2;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("abc", "bbbca"));
    }
}
