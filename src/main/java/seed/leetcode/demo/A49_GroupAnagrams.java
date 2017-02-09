package seed.leetcode.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by User on 2017/2/9.
 */
public class A49_GroupAnagrams {

    //TIME LIMIT EXCEED ~~ QQ
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<List<String>> groups = new ArrayList<>();

        for(int i=0; i<strs.length; i++){
            if(groups.size() == 0){
                groups.add(permutation(strs[i], new ArrayList<String>()));
                List<String> tmpList = new ArrayList<>();
                tmpList.add(strs[i]);
                result.add(tmpList);
            }else{
                int idx = checkBelongToGroupIndex(strs[i], groups);
                if(idx >= 0){
                    List list = result.get(idx);
                    list.add(strs[i]);
                }else{
                    groups.add(permutation(strs[i], new ArrayList<String>()));
                    List<String> tmpList = new ArrayList<>();
                    tmpList.add(strs[i]);
                    result.add(tmpList);
                }
            }
        }
        return result;
    }
    //return -1 when belong to nothing
    private int checkBelongToGroupIndex(String str, List<List<String>> groups){
        for(int i=0; i<groups.size(); i++){
            if( groups.get(i).indexOf(str) != -1){
                return i;
            }
        }
        return -1;
    }

    public List<String> permutation(String str, List list) {
        permutation("", str, list);
        return list;
    }

    private void permutation(String prefix, String str, List list) {
        int n = str.length();
        if (n == 0) list.add(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), list);
        }
    }
}
