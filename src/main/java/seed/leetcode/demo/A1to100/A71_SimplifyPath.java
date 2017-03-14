package seed.leetcode.demo.A1to100;

import java.util.Stack;

/**
 * Created by User on 2017/2/13.
 */
public class A71_SimplifyPath {
    public String simplifyPath(String path) {
        path = path.replaceAll("//","/");
        String[] aryPath = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String folder : aryPath){
            if( ! folder.trim().equals("") && ! folder.trim().equals(".")){
                if(folder.equals("..")){
                    if( ! stack.isEmpty()){
                        stack.pop();
                    }
                }else{
                    stack.push(folder);
                }
            }
        }
        if(stack.isEmpty()) return "/";

        String resultPath = "";
        while( ! stack.isEmpty()){
            resultPath = "/"+stack.pop()+resultPath;
        }
        return resultPath;
    }
}
