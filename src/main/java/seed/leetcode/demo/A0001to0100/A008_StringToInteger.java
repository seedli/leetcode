package seed.leetcode.demo.A0001to0100;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 2017/2/18.
 */
public class A008_StringToInteger {

    //?ˆ¥äººç??
    public int myAtoi(String str){
        if (str == null || str.length() == 0)
            return 0;//
        str = str.trim();
        char firstChar = str.charAt(0);
        int sign = 1, start = 0, len = str.length();
        long sum = 0;
        if (firstChar == '+') {
            sign = 1;
            start++;
        } else if (firstChar == '-') {
            sign = -1;
            start++;
        }
        for (int i = start; i < len; i++) {
            if (!Character.isDigit(str.charAt(i)))
                return (int) sum * sign;
            sum = sum * 10 + str.charAt(i) - '0';
            if (sign == 1 && sum > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }

        return (int) sum * sign;
    }

    public int myAtoi_Wrong(String str) {
        str = str.replaceAll("^\\s+","");
        if(str.length() == 0) return 0;
        String prefix = "";
        if(str.startsWith("-")){
            prefix = "-";
            str = str.substring(1);
        }else if(str.startsWith("+")){
            prefix = "+";
            str = str.substring(1);
        }
        if(str.length() == 0) return 0;

        char[] arrStr = str.toCharArray();
        if(arrStr[0] < 48 || arrStr[0] > 57 ) return 0;

        int start = 0;
        int end = 0;
        for(int i=0; i< arrStr.length; i++){
            if(arrStr[i] >= 48 && arrStr[i] <= 57){
                end = i;
            }else{
                break;
            }
        }
        if( str.substring(start,end+1).length() > 10){
            return 0;
        }else if(Long.parseLong( prefix + str.substring(start,end+1)) > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(Long.parseLong( prefix + str.substring(start,end+1)) < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(prefix + str.substring(start,end+1));
    }

}
