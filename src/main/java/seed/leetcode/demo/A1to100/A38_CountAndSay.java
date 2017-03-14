package seed.leetcode.demo.A1to100;

/**
 * Created by User on 2017/2/7.
 */
public class A38_CountAndSay {

    public static void main(String args[]){
        System.out.println(countAndSay(99));
    }

    //1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211
    public static String countAndSay(int n) {
        String result = "1";
        if(n <= 1) return result;

        for(int i=2; i<=n; i++){
            char[] ary = ("0"+result).toCharArray();
            char start = ary[1];
            int count = 0;

            String newResult = "";
            for(char chVal : ary){
                if(chVal == '0') continue;
                else if(chVal == start){
                    count++;
                }else{
                    newResult += count + Character.toString(start);
                    start = chVal;
                    count = 1;
                }
            }
            newResult += count + Character.toString(start);

            result = newResult;
        }

        return result;
    }

}
