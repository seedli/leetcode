import org.junit.Test;
import seed.leetcode.demo.A101to200.A101_SymmetricTree;
import seed.leetcode.demo.TreeNode;

/**
 * Created by seedli on 2017/3/14.
 */
public class Test101to200 {

    @Test
    public void testA101(){
        TreeNode T1 = new TreeNode(1);
        TreeNode T2 = new TreeNode(2);
        TreeNode T3 = new TreeNode(2);
        TreeNode T4 = new TreeNode(3);
        TreeNode T5 = new TreeNode(4);
        TreeNode T6 = new TreeNode(4);
        TreeNode T7 = new TreeNode(3);

        T1.left = T2;
        T1.right = T3;
        T2.left = T4;
        T2.right = T5;
        T3.left = T6;
        T3.right = T7;

        System.out.println(new A101_SymmetricTree().isSymmetric(T1));
    }

}
