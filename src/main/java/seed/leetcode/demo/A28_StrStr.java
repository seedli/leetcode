package seed.leetcode.demo;

/**
 * Created by User on 2017/2/3.
 */
public class A28_StrStr {
    public static void main(String[] args){
        System.out.println(strStr("ABCDE","BCD"));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return 0;
        if(needle.length()==0 && haystack.length()==0) return 0;

        char[] arrHaystack = haystack.toCharArray();
        char[] arrNeedle = needle.toCharArray();

        int idx = -1;

        for(int i=0; i< arrHaystack.length - arrNeedle.length + 1; i++){
            for(int j=0; j< i + arrNeedle.length; j++){
                if(arrHaystack[i+j] != arrNeedle[j]){
                    break;
                }
                if(j == arrNeedle.length-1){
                    return i;
                }
            }
        }

        return idx;
    }
}
