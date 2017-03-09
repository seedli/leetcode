package seed.codility104;

/**
 * Created by seedli on 2017/3/9.
 */
public class Test1 {
    public int solution(int A, int B) {
        int count = 0;
        for(int i=0; i<=10000; i++){
            double pow = Math.pow( (double)i, 2);
            if(  pow >= A && pow <= B ){
                count++;
            }else if(pow > B){
                return count;
            }
        }
        return 0;
    }

}
