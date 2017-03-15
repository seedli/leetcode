package seed.leetcode.demo.A101to200;

import seed.leetcode.demo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by User on 2017/3/15.
 */
public class A102_BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qNode = new LinkedList<>();
        Queue<Integer> qLevel = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        qNode.add(root);
        qLevel.add(0);

        while( ! qNode.isEmpty() ){
            TreeNode node = qNode.poll();
            int level = qLevel.poll();

            if(result.size() < level+1){
                result.add(new ArrayList<>());
            }
            result.get(level).add(node.val);

            if(node.left != null){
                qNode.add(node.left);
                qLevel.add(level+1);
            }
            if(node.right != null){
                qNode.add(node.right);
                qLevel.add(level+1);
            }
        }

        return result;
    }

}
