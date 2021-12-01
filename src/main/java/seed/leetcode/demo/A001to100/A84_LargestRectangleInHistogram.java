package seed.leetcode.demo.A001to100;

import java.util.Stack;

/**
 * Created by User on 2017/2/17.
 */
public class A84_LargestRectangleInHistogram {

    //Wrong Answer
    public int largestRectangleArea(int[] heights) {
        if(heights.length==0) return 0;
        if(heights.length==1) return heights[0];

        Stack<Record> stack = new Stack<>();

        int max = 0;
        int i=0;
        while(i < heights.length) {
            if (stack.isEmpty()) {
                if(heights[i] != 0){
                    stack.push(new Record(i, heights[i]));
                }
                i++;
            } else if (stack.peek().height < heights[i]) {
                stack.push(new Record(i, heights[i]));
                i++;
            } else if(heights[i] < stack.peek().height){
                Record record = stack.pop();
                max = Math.max(max, record.height*(i-record.position));
            }else{
                i++;
            }
        }
        while(!stack.isEmpty()){
            Record record = stack.pop();
            max = Math.max(max, record.height*(heights.length-record.position));
        }
        return max;
    }

    public class Record{
        public int position = 0;
        public int height = 0;
        public Record( int position, int height){
            this.position = position;
            this.height = height;
        }
    }

    //TLE .....
    public int largestRectangleArea_TLE(int[] heights) {
        if(heights.length==0) return 0;
        if(heights.length==1) return heights[0];

        int max = 0;
        for(int i=0; i<heights.length; i++){
            max = Math.max(getMaxArea(i,heights), max);
        }
        return max;
    }

    public int getMaxArea(int X, int[] height){
        int max = 0;
        int pointX = X;
        int currentHeight = height[X];

        while(pointX >=0){
            currentHeight = Math.min(height[pointX], currentHeight);
            max = Math.max(max, currentHeight*(X-pointX+1));
            --pointX;
        }
        return max;
    }

}
