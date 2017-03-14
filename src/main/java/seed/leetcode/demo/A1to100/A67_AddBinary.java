package seed.leetcode.demo.A1to100;

/**
 * Created by User on 2017/2/13.
 */
public class A67_AddBinary {

    public String addBinary(String a, String b) {
        if(a.length() <=0) return b;
        if(b.length() <=0) return a;

        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        reverse(arrA);
        reverse(arrB);
        String result = "";

        int idx = 0;
        char plus = '0';

        while( idx < Math.max(arrA.length, arrB.length)){
            char A = idx >= arrA.length ? '0' : arrA[idx];
            char B = idx >= arrB.length ? '0' : arrB[idx];
            char sum = '0';
            if(A=='1' && B=='1'){
                if(plus == '0'){
                    sum = '0';
                }else{
                    sum = '1';
                }
                plus = '1';
            }else if( A=='1' && B=='0' || A=='0' && B=='1'){
                if(plus == '0'){
                    sum = '1';
                    plus = '0';
                }else{
                    sum = '0';
                    plus = '1';
                }
            }else{ // A=='0', B=='0'
                if(plus == '0'){
                    sum = '0';
                }else{
                    sum = '1';
                }
                plus = '0';
            }
            result = sum + result;
            idx++;
        }
        if(plus=='1'){
            result = "1"+result;
        }

        return result;
    }

    private void reverse(char[] arr){
        int idxA = 0;
        int idxB = arr.length-1;
        while(idxA < idxB){
            char tmp = arr[idxA];
            arr[idxA] = arr[idxB];
            arr[idxB] = tmp;
            idxA++;
            idxB--;
        }
    }

}
