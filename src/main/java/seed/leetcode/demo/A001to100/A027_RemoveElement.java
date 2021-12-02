package seed.leetcode.demo.A001to100;

import java.util.Arrays;

/**
 * Created by User on 2017/2/2.
 */
public class A027_RemoveElement {

    public static void main(String[] args){
        //System.out.println(removeElement(new int[]{2,2,3}, 2));
        System.out.println(removeElement2(new int[]{3,1,3,2,2,3}, 3));
    }

    public static int removeElement2(int[] A, int elem) {
        int m = 0;
        for(int i = 0; i < A.length; i++){

            if(A[i] != elem){
                A[m] = A[i];
                m++;
            }
        }
        System.out.println(Arrays.toString(A));
        return m;
    }


    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        if(nums.length == 1){
            if(nums[0] == val){
                nums = new int[]{};
                return 0;
            }else{
                return 1;
            }
        }

        int back = 0;

        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length-back-1;j++){
                if(nums[j] == val){
                    int tmp = 0;
                    tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
            if(nums[nums.length-back-1] == val){
                back++;
            }
        }

        back = 0;
        for(int i=nums.length-1; i >= 0; i--){
            if(nums[i] == val){
                back++;
            }else{
                break;
            }
        }

        nums = Arrays.copyOf(nums, nums.length-back);

        System.out.println(Arrays.toString(nums));

        return nums.length;
    }
}
