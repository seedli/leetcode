package seed.leetcode.demo.A001to100;

/**
 * Created by User on 2017/2/13.
 */
public class A69_SqrtX {

    public int mySqrt(int x) {
        if(x <= 0) return 0;
        long sqrt=1;

        while( sqrt * sqrt <= x){
            sqrt++;
        }

        return (int) sqrt-1;
    }

}
