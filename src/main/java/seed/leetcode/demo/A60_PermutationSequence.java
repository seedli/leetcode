package seed.leetcode.demo;

/**
 * Created by seedli on 2017/2/12.
 */
public class A60_PermutationSequence {

    private int kth = 0;

    public String getPermutation(int n, int k) {
        int total = totalPNum(n);
        if(k > total) return "";

        String origin = "";
        for(int i=1; i<=n; i++){
            origin+= i;
        }
        char[] aryOrigin = origin.toCharArray();
        char[] solution = new char[n];
        boolean[] used = new boolean[n];

        backtrack(aryOrigin, solution, used, 0, n, k);

        return String.copyValueOf(solution);
    }

    public void backtrack(char[] aryOrigin, char[] solution, boolean[] used, int depth, int n, int k){
        if(depth == n){
            //System.out.println(Arrays.toString(solution));
            //System.out.println(++kth);
            ++kth;
            return;
        }

        if(kth == k) return;

        for(int i=0; i<n; i++){
            if( ! used[i]){
                used[i] = true;
                if(kth == k) break;

                solution[depth] = aryOrigin[i];
                backtrack(aryOrigin, solution, used, depth+1, n, k);

                used[i] = false;
            }
        }
        return;
    }

    public int totalPNum(int n){
        if(n==1){
            return 1;
        }else{
            return n*totalPNum(n-1);
        }
    }

}
