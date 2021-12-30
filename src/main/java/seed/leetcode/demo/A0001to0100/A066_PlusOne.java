package seed.leetcode.demo.A0001to0100;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 2017/2/13.
 */
public class A066_PlusOne {

    public int[] plusOne(int[] digits) {

        LinkedList<Integer> digit = new LinkedList<>();

        for(int i: digits){
            digit.push(i);
        }

        int plus = 1;

        for(int i = 0; i<digit.size(); i++){
            int num = digit.get(i) + plus;
            plus = num / 10;
            digit.set(i, num%10);
            if(plus == 0) break;
        }
        if(plus > 0){
            digit.add(digit.size(), plus);
        }

        int[] result = new int[digit.size()];
        for(int i=0; i<digit.size(); i++){
            result[i] = digit.get(digit.size()-1-i);
        }

        return result;
    }

}
