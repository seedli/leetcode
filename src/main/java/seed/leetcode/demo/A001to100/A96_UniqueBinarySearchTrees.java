package seed.leetcode.demo.A001to100;

/**
 * Created by User on 2017/3/9.
 */
public class A96_UniqueBinarySearchTrees {

    public int numTrees(int n) {
        if(n<=0) return 0;

        int[] DP = new int[n+1];
        DP[0] = 1;
        DP[1] = 1;

        for(int i=2; i<=n; i++){
            for(int j=1; j<=i; j++){
                DP[i] += DP[j-1]*DP[i-j];
            }
        }
        return DP[n];
    }

}
