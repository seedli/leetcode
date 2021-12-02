package seed.leetcode.demo.A001to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by seedli on 2017/2/17.
 */
public class A089_GrayCode {

    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        if(n<0){
            return result;
        }else if(n==0){
            result.add(0);
            return result;
        }

        char[] gray = new char[n];
        for(int i=0; i<n; i++){
            gray[i] = '0';
        }

        for(int i=0; i<Math.pow(2,n)/2; i++){
            //?��?��???: ?��?��變右??��?��?��?��??1??�左???(idx-1)位�??
            int idx = String.valueOf(gray).lastIndexOf("1");
            if(idx >= 0){
                if(gray[idx-1]=='1'){
                    gray[idx-1] = '0';
                }else{
                    gray[idx-1] = '1';
                }
            }
            result.add(Integer.parseInt(String.valueOf(gray),2));

            //奇數???: ?��變�??��??��?��?�?
            if(gray[n-1] == '1'){
                gray[n-1] = '0';
            }else{
                gray[n-1] = '1';
            }
            result.add(Integer.parseInt(String.valueOf(gray),2));
        }
        return result;
    }

}
