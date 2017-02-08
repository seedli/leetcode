package seed.leetcode.demo;

/**
 * Created by User on 2017/2/7.
 */
public class Test {

    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            System.out.print(fib(i)+" ");
        }
    }

    public static int fib(int n){
        if(n <= 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
