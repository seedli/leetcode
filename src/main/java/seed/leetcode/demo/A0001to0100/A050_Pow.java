package seed.leetcode.demo.A0001to0100;

/**
 * Created by User on 2017/2/17.
 */
public class A050_Pow {

    //Wrong Answer
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        double result = x;
        if(n > 0){
            while(n > 1){
                result *= x;
                n--;
            }
        }else{
            while(n < 0){
                result *= 1/x;
                n++;
            }
        }

        return result;
    }

}
