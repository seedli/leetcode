package seed.leetcode.demo.A001to100;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by seedli on 2017/2/8.
 */
public class A43_MultiplyStrings {

    public String multiply(String num1, String num2) {
        LinkedList<LinkedList<Integer>> Lists = new LinkedList<>();
        num1 = new StringBuffer(num1).reverse().toString();
        num2 = new StringBuffer(num2).reverse().toString();

        for(int i=0; i<num1.length(); i++){
            LinkedList<Integer> ls = new LinkedList<>();
            for(int Ex=0; Ex<i; Ex++){
                ls.add(0);
            }
            int inc = 0;
            int val1 = Character.getNumericValue(num1.charAt(i));
            for(int j=0; j<num2.length(); j++){
                int val2 = Character.getNumericValue(num2.charAt(j));
                int multi = val1 * val2 + inc;
                ls.add( multi % 10 );
                inc = multi / 10;
            }
            if(inc > 0){
                ls.add(inc);
            }
            Lists.add(ls);
        }

        StringBuffer ans = new StringBuffer();
        boolean allEmpty = false;
        int inc = 0;

        while(!allEmpty){
            int sum = 0;
            allEmpty = true;
            for(LinkedList<Integer> ls : Lists){
                if(!ls.isEmpty()){
                    sum += ls.pop();
                    allEmpty = false;
                }
            }
            if(!allEmpty){
                sum+=inc;
                ans.append(sum%10);
                inc = sum/10;
            }else if(inc > 0){
                allEmpty = false;
                sum+=inc;
                ans.append(sum%10);
                inc = sum/10;
            }

        }

        return new StringBuffer(ans).reverse().toString().replaceFirst("^0+(?!$)", "");
    }

}
