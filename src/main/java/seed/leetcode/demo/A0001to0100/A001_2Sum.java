package seed.leetcode.demo.A0001to0100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2017/2/8.
 */
public class A001_2Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static void main(String[] args){
        A001_2Sum alg = new A001_2Sum();

        int[] input = {2, 7, 11, 15};
        int target = 17;

        int[] result = alg.twoSum2(input, target);

        System.out.println( Arrays.toString(result) );
    }
}
