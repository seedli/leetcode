import org.junit.Assert;
import org.junit.Test;
import seed.leetcode.demo.A18_4Sum;
import seed.leetcode.demo.A39_CombinationSum;
import seed.leetcode.demo.A40_CombinationSum_II;
import seed.leetcode.demo.A5_LongestPalindromicSubstring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by User on 2017/2/8.
 */
public class Test1 {
    @Test
    public void test(){
        System.out.println("Hello JUnit !");
        Assert.assertTrue(true);
    }

    @Test
    public void testA5(){
        Assert.assertNotNull(A5_LongestPalindromicSubstring.longestPalindrome("mississipi"));
    }

    @Test
    public void testA18(){
        A18_4Sum A18 = new A18_4Sum();

        List<List<Integer>> list = A18.fourSum(new int[]{-3,-2,-1,0,0,1,2,3} , 0);

        for(List<Integer> ls : list){
            for(int val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA39(){
        A39_CombinationSum alg = new A39_CombinationSum();

        List<List<Integer>> list = alg.combinationSum(new int[]{2, 3, 6, 7}, 7);

        for(List<Integer> ls : list){
            for(int val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA40(){
        A40_CombinationSum_II alg = new A40_CombinationSum_II();

        List<List<Integer>> list = alg.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);

        for(List<Integer> ls : list){
            for(int val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


}
