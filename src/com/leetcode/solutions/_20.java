package com.leetcode.solutions;

import java.util.Stack;

class Solution20 {
    public boolean isValid(String s) {
       if(s==null || s.length()==0)
           return true;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
                stack.push(s.charAt(i));
            else if(s.charAt(i)==')' && !stack.isEmpty()){
                if(stack.pop()!='(')
                    return false;
            }
            else if(s.charAt(i)==']' && !stack.isEmpty()){
                if(stack.pop()!='[')
                    return false;
            }
            else if(s.charAt(i)=='}' && !stack.isEmpty()){
                if(stack.pop()!='{')
                    return false;
            }else{
                return false;
            }
        }
        if(stack.isEmpty())
        return true;
        else
            return false;
        
    }
}
