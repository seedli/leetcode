package seed.leetcode.demo.A1to100;

/**
 * Created by User on 2017/2/2.
 */
public class A7_ReverseInteger {

    public static void main(String[] args){
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        long result = 0;

        while(x != 0){
            int tail = x % 10;
            result = result * 10 + tail;
            x = x / 10;
        }

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }else{
            return (int)result;
        }
    }
}
