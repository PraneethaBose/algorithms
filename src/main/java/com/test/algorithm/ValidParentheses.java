package com.test.algorithm;

import java.util.Stack;

public class ValidParentheses {
    /**
     * We are here using stack to check wheather the pair we are holding is valid or not
     *
     * Time Complexity O(n) where n is number of characters in the string.
     * Space Complexity O(n) for input (((((( .
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else{
                if(stack.empty()) return false;
                if(!isMatching(c,stack.peek())) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private boolean isMatching(char closing,char opening)
    {
        return (closing==')'&&opening=='(') ||
                (closing=='}'&&opening=='{') ||
                (closing == ']' && opening == '[');
    }
}
