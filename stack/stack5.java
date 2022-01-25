package stack;

import java.util.Stack;

public class stack5 {
    public static String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        String str = "";
        for(int i=0;i<s.length();i++){
            if(st.size() == 0){
                st.push(s.charAt(i));
            }else if(!st.isEmpty() && ((st.peek()==s.charAt(i)+32) || (st.peek()==s.charAt(i)-32))){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }

        while(!st.isEmpty()){
            str = st.pop() + str;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(makeGood("abBAcC"));
    }
}
