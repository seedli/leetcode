package seed.leetcode.demo.A001to100;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by seedli on 2017/2/14.
 */
public class A77_Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, result, new int[k], 0);
        return result;
    }

    public void backtrack(int i, int n, int k, List<List<Integer>> result, int[] solution, int depth){
        if(depth >= k){
            result.add(IntStream.of(solution).boxed().collect(Collectors.toList()));
            return;
        }
        if(i > n) return;

        //pick i
        solution[depth] = i;
        backtrack(i+1, n, k, result, solution, depth+1);

        //don't pick i
        backtrack(i+1, n, k, result, solution, depth);
    }

}
