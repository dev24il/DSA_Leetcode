package stack;

import java.util.Stack;

public class stack6 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> pt = new Stack<>();

        String str = "", ptr = "";
        for(int i=0;i<s.length();i++){
            if(st.size() == 0 && s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }else if(!st.isEmpty() && s.charAt(i)=='#'){
                st.pop();
            }else if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            str = st.pop() + str;
        }


        for(int i=0;i<t.length();i++){
            if(pt.size() == 0 && t.charAt(i)!='#'){
                pt.push(t.charAt(i));
            }else if(!pt.isEmpty() && t.charAt(i)=='#'){
                pt.pop();
            }else if(t.charAt(i)!='#'){
                pt.push(t.charAt(i));
            }
        }
        while(!pt.isEmpty()){
            ptr = pt.pop() + ptr;
        }

        return str.equals(ptr);
    }
    public static void main(String[] args) {
        
    }
}
