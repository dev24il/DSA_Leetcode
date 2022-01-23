package stack;

import java.util.Stack;

public class stack1 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.add(s.charAt(i));
            }else if(!st.isEmpty() && s.charAt(i)==')' && st.peek()=='('){
                st.pop();
            }else if(!st.isEmpty() && (s.charAt(i)==']' && st.peek()=='[')){
                st.pop();
            }else if(!st.isEmpty() && s.charAt(i)=='}' && st.peek()=='{'){
                st.pop();
            }else if(st.isEmpty()){
                return false;
            }else if(!st.isEmpty() && (s.charAt(i)==']' || s.charAt(i)=='}') && st.peek()=='('){
                return false;
            }else if(!st.isEmpty() && (s.charAt(i)==']' || s.charAt(i)==')') && st.peek()=='{'){
                return false;
            }else if(!st.isEmpty() && (s.charAt(i)==')' || s.charAt(i)=='}') && st.peek()=='['){
                return false;
            }
        }

        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}
