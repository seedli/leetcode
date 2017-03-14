package seed.leetcode.demo.A1to100;

/**
 * Created by User on 2017/2/18.
 */
public class A91_DecodeWays {

    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int[] memo = new int[n+1];
        memo[n]  = 1;
        memo[n-1] = s.charAt(n-1) != '0' ? 1 : 0;

        for (int i = n - 2; i >= 0; i--)
            if (s.charAt(i) == '0') continue;
            else memo[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? memo[i+1]+memo[i+2] : memo[i+1];

        return memo[0];
    }

    //TLE
    private int result = 0;

    public int numDecodings_TLE(String s) {
        if(s.length() == 0) return 0;
        char[] arrNums = s.toCharArray();
        backtrack(arrNums,0);

        return result;
    }

    private void backtrack(char[] arrNums, int depth){
        if(depth==arrNums.length){
            result++;
            return;
        }

        if(arrNums[depth] == '0') return; //第一個是0 無解

        //選一個
        if(depth < arrNums.length){
            backtrack(arrNums, depth+1);
        }

        //選兩個
        if(depth < arrNums.length-1){
            int value = Integer.parseInt(String.valueOf(arrNums[depth])+arrNums[depth+1]);
            if(value >=10 && value <= 26){ //可以解
                backtrack(arrNums, depth+2);
            }else{
                return; //無解
            }
        }
    }


}
