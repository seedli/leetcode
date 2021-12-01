package seed.leetcode.demo.A001to100;

/**
 * Created by User on 2017/2/7.
 */
public class A14_LongestCommonPrefix {
    public static void main(String[] args){
        System.out.println(longestCommonPrefix( new String[]{
                "aabbccc",
                "aabbbccc",
                "aabaccc"
        } ));
    }

    public static String longestCommonPrefix(String[] aryStrs) {
        if(aryStrs.length < 1) return "";
        String prefix = "";

        int idx = 0;
        boolean AllMatch = true;

        while(AllMatch){
            char chrIdx = ' ';
            for(String str : aryStrs){
                if(str.length() == idx){
                    AllMatch = false;
                    break;
                }
                if(chrIdx == ' ' || chrIdx == str.toCharArray()[idx]){
                    chrIdx = str.toCharArray()[idx];
                }else{
                    AllMatch = false;
                    break;
                }
            }
            if(AllMatch){
                prefix += chrIdx;
            }
            idx++;
        }
        return prefix;
    }
}
