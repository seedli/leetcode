package seed.leetcode.demo.A1to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 2017/1/25.
 */
public class A15_3Sum {

    public static void main(String[] args){
        System.out.println(threeSum(new int[]{

                0,0,0,0

        } ));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i< nums.length; i++){
            if(i>0){
                if(     nums[i] == nums[i-1]  ){
                    continue;
                }
            }

            for(int j=i+1; j<nums.length; j++){
                if(i>1){
                    if(     nums[i] == nums[i-1] &&
                            nums[j] == nums[j-1]  ){
                        continue;
                    }
                }

                for(int k=j+1; k<nums.length; k++){

                    if(i>2){
                        if(     nums[i] == nums[i-1] &&
                                nums[j] == nums[j-1] &&
                                nums[k] == nums[k-1] ){
                            continue;
                        }
                    }

                    if(nums[i] + nums[j] + nums[k] == 0){
                        Integer[] tmpArray = new Integer[]{nums[i], nums[j], nums[k]};
                        List<Integer> tmpList = Arrays.asList(tmpArray);
                        //if(!checkIsExist(result, tmpList))
                        if(result.size() >0 && tmpList.equals(result.get(result.size()-1))){
                            continue;
                        }
                        result.add(new ArrayList<>(tmpList));
                    }
                }
            }
        }
        return result;
    }

}
