package seed.leetcode.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 2017/1/25.
 */
public class ThreeSum {

    public static void main(String[] args){
        System.out.println(threeSum(new int[]{

                13,9,1,12,-7,-12,7,3,9,6,-7,4,9,5,5,-7,4,11,1,-2,12,3,-12,-15,0,-12,-6,-1,7,-5,-4,-3,12,4,-14,-10,-1,8,1,-6,-1,9,13,-14,-1,-5,-6,-12,-8,2,2,11,13,-3,11,-2,1,-10,4,-15,-8,7,-11,11,-4,-10,-13,3,5,3,12,11,-11,2,12,3,13,13,-2,12,-7,-15,8,-9,-10,-4,-4,6,1,-15,-2,0,-1,2,-3,10,-1,-9,-10,-11,1,-13,-15,5,-3,5,-7,-5,-5,6,14,3,-1,7,1,-4,-12,12,-13,-4,4,0,3,-12,9,-15,6

        } ));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        Integer[] tmpArray = new Integer[]{nums[i], nums[j], nums[k]};
                        List<Integer> tmpList = Arrays.asList(tmpArray);
                        if(result.size() > 0 && tmpList.equals(result.get(result.size()-1))){
                            continue;
                        }
                        result.add(new ArrayList<>(tmpList));
                    }
                }
            }
        }
        return result;
    }

    public static boolean checkIsExist(List<List<Integer>> result, List<Integer> list){
        if(result.size() == 0) return false;

        boolean isExist = false;
        for(List<Integer> mainList : result){

            isExist = mainList.equals(list);
            if(isExist) return isExist;
        }
        return isExist;
    }
}
