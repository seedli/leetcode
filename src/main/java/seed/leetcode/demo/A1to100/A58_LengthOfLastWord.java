package seed.leetcode.demo.A1to100;

/**
 * Created by seedli on 2017/2/11.
 */
public class A58_LengthOfLastWord {

    public int lengthOfLastWord(String str) {

        //全部空白的
        if(str.replaceAll(" ","").length() == 0){
            return 0;
        }

        //前後都加空白
        str = " " + str + " ";

        char[] arrStr = str.toCharArray();
        int length = 0;
        int idx = arrStr.length -1;

        while(idx >= 0){
            if(arrStr[idx] != ' '){
                length++;
            }
            if(length > 0 && arrStr[idx] == ' '){
                break;
            }
            --idx;
        }

        return length;
    }

}
