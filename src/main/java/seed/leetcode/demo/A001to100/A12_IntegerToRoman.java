package seed.leetcode.demo.A001to100;

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

        //??•ç?†å?ƒä?æ•¸ å¹¾å?‹å?ƒå°±å¹¾å?‹M
        int thouthand = num / 1000;
        num %= 1000;

        for(int i=0; i < thouthand; i++){
            Roman += R1000;
        }

        //??•ç?†ç™¾ä½æ•¸\;
        Roman += getRomanNum(num / 100, 3);
        num %= 100;

        //??ä??
        Roman += getRomanNum(num / 10, 2);
        num %= 10;

        //?‹ä??
        Roman += getRomanNum(num, 1);

        return Roman;
    }

    //?™¾ä½? ??ä?? ?‹ä?? è½‰æ??
    public static String getRomanNum(int num, int length){
        //int length = (int)(Math.log10(num)+1);
        String result="";
        String UpperDigit ,MiddleDigit, MiddleHalfDigit;

        if(length == 3){ //?™¾ä½?
            UpperDigit = R1000;
            MiddleDigit = R100;
            MiddleHalfDigit = R500;
        }else if(length == 2){ //??ä??
            UpperDigit = R100;
            MiddleDigit = R10;
            MiddleHalfDigit = R50;
        }else{ //?‹ä??
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
