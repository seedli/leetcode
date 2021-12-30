package seed.leetcode.demo.A0001to0100;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by User on 2017/1/10.
 */
public class A013_RomanToInteger {

    public static void main(String[] args){
        System.out.println(romanToInt("MDCCCXC"));
    }
    public static int romanToInt(String s) {
        String[] arrRoman = s.split("(?!^)");
        ArrayList<String> ListRoman = (ArrayList) reverse(arrRoman);

        int Total = 0;
        boolean gotXV = false;
        boolean gotCL = false;
        boolean gotMD = false;

        //Symbol	I	V	X	L	C	D	M
        //Value	    1	5	10	50	100	500	1,000


        for(String Roman : ListRoman){

            switch(Roman){
                case "I":
                    if(gotXV){
                        Total -= 1;
                    }else{
                        Total += 1;
                    }
                    break;

                case "V":
                    Total += 5;
                    gotXV = true;
                    break;

                case "X":
                    if(gotCL){
                        Total -=10;
                    }else{
                        Total +=10;
                    }
                    gotXV = true;
                    break;

                case "L":
                    Total += 50;
                    gotCL = true;
                    break;

                case "C":
                    if(gotMD){
                        Total -= 100;
                    }else{
                        Total += 100;
                    }
                    gotCL = true;
                    break;

                case "D":
                    Total += 500;
                    gotMD = true;
                    break;

                case "M":
                    Total += 1000;
                    gotMD = true;
                    break;
            }
        }

        return Total;
    }

    public static List reverse(String[] arr) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        Collections.reverse(list);
        return list;
    }

}
