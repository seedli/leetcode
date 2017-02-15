package seed.leetcode.demo;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by User on 2017/2/15.
 */
public class A80_RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        Map<Integer, Integer> map = new TreeMap<>();
        for(int i: nums){
            if(map.containsKey(i) && map.get(i) < 2){
                map.replace(i, map.get(i), map.get(i)+1);
            }else if(!map.containsKey(i)){
                map.put(i,1);
            }
        }
        int sum = 0, idx=0;
        for(Integer key : map.keySet()){
            if(map.get(key) == 1){
                nums[idx++] = key;
            }else if(map.get(key) == 2){
                nums[idx++] = key;
                nums[idx++] = key;
            }
            sum += map.get(key);
        }
        System.out.println(Arrays.toString(nums));
        return sum;
    }

}
