package seed.leetcode.demo;

/**
 * Created by User on 2017/2/18.
 */
public class A11_ContainerWithMostWater {

    public int maxArea(int[] height) {
        if(height.length <= 1) return 0;
        int max = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){
            int H = Math.min(height[left], height[right]);
            int W = right - left;
            max = Math.max(max, H*W);

            if(height[left] == H){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }

}
