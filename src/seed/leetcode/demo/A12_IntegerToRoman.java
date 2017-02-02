package seed.leetcode.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017/1/10.
 */
public class A12_IntegerToRoman {

    public static void main(String args[]){
        System.out.println(intToRoman(3486));
    }

    public static final String R1000 = "M";
    public static final String R500 = "D";
    public static final String R100 = "C";
    public static final String R50 = "L";
    public static final String R10 = "X";
    public static final String R5 = "V";
    public static final String R1 = "I";

    public static String intToRoman(int num) {
        String Roman= "";

        //處理千位數 幾個千就幾個M
        int thouthand = num / 1000;
        num %= 1000;

        for(int i=0; i < thouthand; i++){
            Roman += R1000;
        }

        //處理百位數\;
        Roman += getRomanNum(num / 100, 3);
        num %= 100;

        //十位
        Roman += getRomanNum(num / 10, 2);
        num %= 10;

        //個位
        Roman += getRomanNum(num, 1);

        return Roman;
    }

    //百位 十位 個位 轉換
    public static String getRomanNum(int num, int length){
        //int length = (int)(Math.log10(num)+1);
        String result="";
        String UpperDigit ,MiddleDigit, MiddleHalfDigit;

        if(length == 3){ //百位
            UpperDigit = R1000;
            MiddleDigit = R100;
            MiddleHalfDigit = R500;
        }else if(length == 2){ //十位
            UpperDigit = R100;
            MiddleDigit = R10;
            MiddleHalfDigit = R50;
        }else{ //個位
            UpperDigit = R10;
            MiddleDigit = R1;
            MiddleHalfDigit = R5;
        }

        switch(num){
            case 9: //IX
                result = MiddleDigit+UpperDigit;
                break;
            case 8: //VIII
                result = MiddleHalfDigit + MiddleDigit + MiddleDigit + MiddleDigit;
                break;
            case 7: //VII
                result = MiddleHalfDigit + MiddleDigit + MiddleDigit;
                break;
            case 6: //VI
                result = MiddleHalfDigit + MiddleDigit;
                break;
            case 5: //V
                result = MiddleHalfDigit;
                break;
            case 4: //IV
                result = MiddleDigit + MiddleHalfDigit;
                break;
            case 3: //III
                result = MiddleDigit + MiddleDigit + MiddleDigit;
                break;
            case 2: //II
                result = MiddleDigit + MiddleDigit;
                break;
            case 1: //I
                result = MiddleDigit;
                break;
        }

        return result;

    }

}
