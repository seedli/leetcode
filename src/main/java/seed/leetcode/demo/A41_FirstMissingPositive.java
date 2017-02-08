package seed.leetcode.demo;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by seedli on 2017/2/8.
 */


public class A41_FirstMissingPositive {

    //From leetcode solution 天才解法, index取代")"放在stack裡面
    public int firstMissingPositive(int[] A) {
        int i = 0;
        while(i < A.length){
            if(A[i] == i+1 || A[i] <= 0 || A[i] > A.length) i++;
            else if(A[A[i]-1] != A[i]) swap(A, i, A[i]-1);
            else i++;
        }
        i = 0;
        while(i < A.length && A[i] == i+1) i++;
        return i+1;
    }

    private void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    //Wrong Answer
//    public int firstMissingPositive(int[] nums) {
//        if(nums.length == 0) return 1;
//        int max = 0;
//        int min = Integer.MAX_VALUE;
//        LinkedList<Integer> expect = new LinkedList<>();
//        //HashSet<Integer> expect = new HashSet<>();
//
//        for(int val : nums){
//            if( val > max){
//                max = val;
//            }
//            if( val < min && val > 0){
//                min = val;
//            }
//            if( val >= 0){
//                expect.add(val+1);
//            }
//        }
//        if(min > 1) return 1;
//
//        for(int i=nums.length-1; i>=0; i--){
//            if(expect.size() > 0){
//                expect.remove( (Integer) nums[i]);
//            }
//        }
//
//        int result = Integer.MAX_VALUE;
//
//        for(int val : expect){
//            if(val < result && val > 0) result = val;
//        }
//
//        return result;
//    }
}
