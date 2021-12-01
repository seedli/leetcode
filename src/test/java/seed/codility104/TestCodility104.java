package seed.codility104;
import org.junit.Test;
import seed.codility104.*;

/**
 * Created by seedli on 2017/3/9.
 */
public class TestCodility104 {
    @Test
    public void test1(){
        Test1 test = new Test1();
        System.out.println(test.solution(-10000,10000));
    }

    @Test
    public void test2(){
        Test2 test = new Test2();
        System.out.println(test.solution(new int[]{2,1,3,5,4}));
    }

}
