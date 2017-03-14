package seed.leetcode.demo.A1to100;

/**
 * Created by User on 2017/2/7.
 */
public class A5_LongestPalindromicSubstring {

    public static void main(String[] args){
        System.out.println(longestPalindrome("mississipi"));
    }

    //每個substring 左右發散check是否對稱
    public static String longestPalindrome(String s) {
        if(s.length() < 2) return s;

        s = "@"+ String.join("@",s.split("")) + "@";
        int LongestRadius = 0;
        String prefix = "";

        for(int i=0; i<s.length(); i++){
            boolean getEdge = false;
            int radius = LongestRadius+1;
            while(!getEdge){
                if(i-radius < 0 || i+radius > s.length()-1){
                    getEdge = true;
                    break;
                }
                String tmp = s.substring(i-radius, i+radius+1);
                if(isValid(tmp)){
                    prefix = tmp;
                    LongestRadius = radius;
                }else{
                    break;
                }
                radius++;
            }
        }


        return prefix.replaceAll("@","");
    }

    public static boolean isValid(String data){
        char[] aryX = String.valueOf(data).toCharArray();

        for(int i=0; i<aryX.length/2; i++){
            if(aryX[i] != aryX[aryX.length-i-1]) return false;
        }

        return true;
    }
}
