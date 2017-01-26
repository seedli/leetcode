package seed.leetcode.demo;

import java.util.Stack;

/**
 * Created by User on 2017/1/26.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] aryS = s.toCharArray();

        for(char c : aryS){
            switch(c){
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case ')':
                case ']':
                case '}':
                    if(stack.isEmpty() || stack.pop() != c) return false;
                    break;
            }
        }

        return stack.isEmpty();
    }
}
