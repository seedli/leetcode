import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 2017/2/9.
 */
public class TestPractices {
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

    @Test
    public void testPermutation(){
        List<String> list = new ArrayList<>();
        permutation("abcd", list);

        for(String str : list){
            System.out.println(str);
        }
    }

    public void permutation(String str, List list) {
        permutation("", str, list);
    }

    private void permutation(String prefix, String str, List list) {
        int n = str.length();
        if (n == 0) list.add(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), list);
        }
    }

    @Test
    public void testMod(){
        int x=6;
        int y=7;

        System.out.println(  (x+y)  );
        System.out.println(  (7+y-x)  );
    }
}
