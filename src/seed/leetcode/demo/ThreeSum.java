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

                5,-9,-11,9,9,-4,14,10,-11,1,-13,11,10,14,-3,-3,-4,6,-15,6,6,-13,7,-11,-15,10,-8,13,-14,-12,12,6,-6,8,0,10,-11,-8,-2,-6,8,0,12,3,-9,-6,8,3,-15,0,-6,-1,3,9,-5,-5,4,2,-15,-3,5,13,-11,7,6,-4,2,11,-5,7,12,-11,-15,1,-1,-9,10,-8,1,2,8,11,-14,-4,-3,-12,-2,8,5,-1,-9,-4,-3,-13,-12,-12,-10,-3,6,1,12,3,-3,12,11,11,10

        } ));
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int num1;
        int num2;
        int num3;

        for(int i=0; i< nums.length; i++){
            num1=(nums[i]);
            for(int j=i+1; j<nums.length; j++){
                num2 = nums[j];
                for(int k=j+1; k<nums.length; k++){
                    num3 = nums[k];
                    if(num1 + num2 + num3 == 0){
                        Integer[] tmpArray = new Integer[]{num1, num2, num3};
                        List<Integer> tmpList = Arrays.asList(tmpArray);
                        if(!checkIsExist(result, tmpList) ){
                            result.add(new ArrayList<>(tmpList));
                        }
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
