package seed.leetcode.demo.A001to100;

/**
 * Created by User on 2017/5/9.
 */
// NOT FINISHED
public class A29_DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend == 0) return 0;

        //?��?��?���??��??�是負數
        int positiveNum;
        if(dividend < 0 && divisor < 0 || dividend >=0 && divisor >=0){
            positiveNum = 1;
        }else{
            positiveNum = -1;
        }
        //?��?��轉�?�正?��?��
        if(dividend == Integer.MIN_VALUE) dividend = Integer.MAX_VALUE;
        if(divisor == Integer.MIN_VALUE) divisor = Integer.MAX_VALUE;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        if(divisor == 1) return dividend * positiveNum;

        int mulitiTimes = 1;
        while(divisor * mulitiTimes <= dividend){
            if( Integer.MAX_VALUE - divisor * mulitiTimes <= divisor ) break;
            mulitiTimes++;
        }

        return (mulitiTimes-1) * positiveNum;
    }
}
