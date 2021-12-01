package seed.leetcode.demo.A001to100;

/**
 * Created by User on 2017/2/13.
 */
public class A70_ClimbingStairs {

    //第�???�以�? ?��他�?��?�都???2種走?��??�方�?(從�?��???�or??��?��??)
    public int climbStairs(int n) {
        if(n<=1) return 1;
        int[] stairs = new int[n];
        stairs[0] = 1;
        stairs[1] = 2;

        for(int i=2; i<n; i++){
            stairs[i] = stairs[i-1] + stairs[i-2];
        }
        return stairs[n-1];
    }
}
