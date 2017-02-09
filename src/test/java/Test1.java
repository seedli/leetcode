import org.junit.Assert;
import org.junit.Test;
import seed.leetcode.demo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by User on 2017/2/8.
 */
public class Test1 {

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

    @Test
    public void testA41(){
        A41_FirstMissingPositive alg = new A41_FirstMissingPositive();
        System.out.println(alg.firstMissingPositive(new int[]{1,0,3,3,0,2}));
    }

    @Test
    public void testA43(){
        A43_MultiplyStrings alg = new A43_MultiplyStrings();
        System.out.println(alg.multiply("9133", "0"));
    }

    @Test
    public void testA46(){
        List<List<Integer>> list = A46_Permutations.permute(new int[]{1,1,2});
        for(List<Integer> ls : list){
            for(int val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA47(){
        A47_PermutationsII alg = new A47_PermutationsII();
        List<List<Integer>> list = alg.permuteUnique(new int[]{1,1,2});
        for(List<Integer> ls : list){
            for(int val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA31(){
        A31_NextPermutation alg = new A31_NextPermutation();
        int[] arr = new int[]{4,5,7,3,9,8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(alg.nextPermutation(arr)));
    }

    @Test
    public void testA48(){
        A48_RotateImage alg = new A48_RotateImage();
        int[][] arr1 = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        int[][] arr = new int[][]{
                {1, 2,},
                {3, 4}
        };
        alg.rotate(arr1);

    }






    @Test
    public void testQuickSort(){
        int[] nums = new int[]{5,2,6,1,3,4};

        quicksort(nums, 0, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    private void quicksort(int[] numbers, int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(numbers, i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(numbers, low, j);
        if (i < high)
            quicksort(numbers, i, high);
    }

    private void exchange(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }


}
