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
            //?¶?•¸???: ?ª?”¹è®Šå³??Šç?—ä?†é?–å??1??„å·¦???(idx-1)ä½å??
            int idx = String.valueOf(gray).lastIndexOf("1");
            if(idx >= 0){
                if(gray[idx-1]=='1'){
                    gray[idx-1] = '0';
                }else{
                    gray[idx-1] = '1';
                }
            }
            result.add(Integer.parseInt(String.valueOf(gray),2));

            //å¥‡æ•¸???: ?”¹è®Šæ??³??Šç?„ä?ä½?
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
