package seed.codility104;

/**
 * Created by seedli on 2017/3/9.
 */
public class Test2 {
    public int solution(int[] A){
        if(A.length == 0) return 0;
        int sum = 0, sumA = 0, count = 0;

        for(int i=0; i< A.length; i++){
            sumA += A[i];
            sum += i+1;
            if(sumA == sum){
                count++;
            }
        }
        return count;
    }
}
