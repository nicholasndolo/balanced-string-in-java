package com.balancedString;

import java.util.Stack;

public class Expression {

    public boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray()){;
            if(ch == '(')
                stack.push(ch);
            if(ch == ')') {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.empty();
    }
}
