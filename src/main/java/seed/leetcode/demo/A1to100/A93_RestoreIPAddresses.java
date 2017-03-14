package seed.leetcode.demo.A1to100;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by User on 2017/3/8.
 */
public class A93_RestoreIPAddresses {

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new LinkedList<>();
        if(s.length() < 4) return result;
        backtracking(result, s.substring(1), new String[]{s.substring(0,1),"","",""}, 0);
        return result;
    }

    private void backtracking(List<String> result, String s,  String[] ip, int depth){
        if(depth > 3){
            if(s.equals("") && validateIPAddr(ip)){
                result.add(String.join(".", ip));
            }
            return;
        }
        if(depth < 3 && s.equals("")) return;

        //pick
        if( ! s.equals("")){
            if( ip[depth].equals("") || validateIPSection(ip[depth]+s.substring(0,1) )){
                String tmp = ip[depth];
                ip[depth] = ip[depth]+s.substring(0,1);
                backtracking(result, s.substring(1), ip, depth);
                ip[depth] = tmp;
            }
        }

        if(ip[depth].equals("")) return;
        //not to pick and go to next ip section
        backtracking(result, s, ip, depth+1);

    }

    private boolean validateIPAddr(String[] ip){
        for(String s : ip){
            if( ! validateIPSection(s))
                return false;
        }
        return true;
    }

    private boolean validateIPSection(String section){
        if(section.length() > 1 && section.startsWith("0")) return false;
        int sect = Integer.parseInt(section);
        return (sect >=0 && sect<=255);
    }

}
