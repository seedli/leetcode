import org.junit.Assert;
import org.junit.Test;
import seed.leetcode.demo.A18_4Sum;
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


}
