package seed.leetcode.demo.A001to100;

/**
 * Created by User on 2017/2/7.
 */
public class A009_PalindromeNumber {

    public static void main(String[] args){
        System.out.println(isPalindrome(1122311));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 10) return true;

        char[] aryX = String.valueOf(x).toCharArray();

        for(int i=0; i<aryX.length/2; i++){
            if(aryX[i] != aryX[aryX.length-i-1]) return false;
        }

        return true;
    }

}
