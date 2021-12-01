package seed.leetcode.demo.A101to200;
import org.junit.Test;
import seed.leetcode.demo.TreeNode;
import seed.leetcode.demo.Utility;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testA102(){
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

        List<List<Integer>> list = new A102_BinaryTreeLevelOrderTraversal().levelOrder(T1);

        for(List<Integer> ls : list){
            for(int i : ls){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA103(){
        TreeNode T1 = new TreeNode(1);
        TreeNode T2 = new TreeNode(2);
        TreeNode T3 = new TreeNode(3);
        TreeNode T4 = new TreeNode(4);
        TreeNode T5 = new TreeNode(5);
        TreeNode T6 = new TreeNode(6);
        TreeNode T7 = new TreeNode(7);
        TreeNode T8 = new TreeNode(8);
        TreeNode T9 = new TreeNode(9);

        T1.left = T2;
        T1.right = T3;
        T2.left = T4;
        T2.right = T5;
        T3.left = T6;
        T3.right = T7;
        T6.left = T8;
        T7.left = T9;

        List<List<Integer>> list = new A103_BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(T1);

        for(List<Integer> ls : list){
            for(int i : ls){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA104(){
        TreeNode T1 = new TreeNode(1);
        TreeNode T2 = new TreeNode(2);
        TreeNode T3 = new TreeNode(3);
        TreeNode T4 = new TreeNode(4);
        TreeNode T5 = new TreeNode(5);
        TreeNode T6 = new TreeNode(6);
        TreeNode T7 = new TreeNode(7);
        TreeNode T8 = new TreeNode(8);
        TreeNode T9 = new TreeNode(9);

        T1.left = T2;
        T1.right = T3;
        T2.left = T4;
        T2.right = T5;
        T3.left = T6;
        T3.right = T7;
        T6.left = T8;
        T7.left = T9;

        System.out.println(new A104_MaximumDepthOfBinaryTree().maxDepth(T1));
    }

    @Test
    public void testA112(){
        TreeNode T1 = new TreeNode(1);
        TreeNode T2 = new TreeNode(2);

        T1.left = T2;
        //System.out.println(new A112_PathSum().hasPathSum(T1, 10));
        System.out.println(new A112_PathSum().hasPathSum(T1, 1));
    }

    @Test
    public void testA113(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-2);
        list.add(null);
        list.add(-3);

        TreeNode root = Utility.ListToTreeNode(list);

        List<List<Integer>> result = new A113_PathSumII().pathSum(root, -2);

        for(List<Integer> ls : result){

            for(Integer i : ls){
                System.out.print(i + " ");
            }
            System.out.println("\r\n");
        }
    }

}
