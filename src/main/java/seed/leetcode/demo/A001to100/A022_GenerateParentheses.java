package seed.leetcode.demo.A001to100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by seedli on 2017/1/31.
 */
public class A022_GenerateParentheses {

    public static void main(String[] args){
        System.out.println(generateParenthesis(3));
    }

//    public static List<String> generateParenthesis(int n) {
//        List<String> list = new ArrayList<String>();
//        backtrack(list, "", 0, 0, n);
//        return list;
//    }

//    public static void backtrack(List<String> list, String str, int open, int close, int max){
//
//        if(str.length() == max*2){
//            list.add(str);
//            return;
//        }
//
//        if(open < max)
//            backtrack(list, str+"(", open+1, close, max);
//        if(close < open)
//            backtrack(list, str+")", open, close+1, max);
//    }

    public static List<String> generateParenthesis(int n) {
        LinkedList<String> result = new LinkedList<>();
        generateAllPossibilities(result, n*2, "(");


        return result;
    }

    public static void generateAllPossibilities(LinkedList<String> list, int depth, String current){

        //System.out.println(current);
        if(current.length() == depth){
            if(isValid(current)){
                list.add(current);
            }
            return;
        }

        for(int i=0; i<2; i++){
            if(i==0){
                generateAllPossibilities(list, depth, current+"(");
            }else{
                generateAllPossibilities(list, depth, current+")");
            }
        }
    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        char[] aryS = s.toCharArray();

        for(char c : aryS){
            switch(c){
                case '(':
                    stack.push(')');
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != c) return false;
                    break;
            }
        }

        return stack.isEmpty();
    }
}
