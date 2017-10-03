import org.junit.Test;
import seed.leetcode.demo.TreeNode;
import seed.leetcode.demo.Utility;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

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

    @Test
    public void testReplaceAll(){
        String s = "/home//foo/";
        s = s.replaceAll("//","/");
        System.out.println(Arrays.toString(s.split("/")));
    }

    @Test
    public void testQueue(){
        Queue<Integer> q = new LinkedBlockingDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }

    @Test
    public void testCharAscii(){
        char a = '9';
        System.out.println((int) a);

    }

    @Test
    public void testAA(){
        Integer Value = new Integer(0);
        String str = new String("ABC");
        int[] ary = {1,2,3,4};
        addValue(Value);
        modString(str);
        modArray(ary);
        System.out.println(Value);
        System.out.println(str);
        System.out.println(Arrays.toString(ary));
    }

    @Test
    public void testHashMap(){
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"abc");
        map.put(1,"def");

        System.out.println(map.get(1));
        System.out.println(map.size());
        System.out.println("map = " + map);
    }

    @Test
    public void testListToTreeNode(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(11);
        list.add(null);
        list.add(13);
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(null);
        list.add(null);
        list.add(5);
        list.add(1);

        TreeNode root = Utility.ListToTreeNode(list);

        System.out.println(root.val);
    }

    public void addValue(Integer Value){
        Value = Value+1;
    }

    public void modString(String str){
        str = new String("DEF");
    }

    public void modArray(int[] ary){
        ary[3] = 5;
    }
}
