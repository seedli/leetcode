package seed.leetcode.demo.A101to200;

import seed.leetcode.demo.TreeNode;

import java.util.*;

/**
 * Created by User on 2017/3/15.
 */
public class A103_BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> sEven = new Stack<>(); //偶
        Stack<TreeNode> sOdd = new Stack<>(); //奇
        Queue<Integer> qLevel = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        sEven.push(root);
        qLevel.add(0);

        while( ! sEven.isEmpty() || ! sOdd.isEmpty() ){
            int level = qLevel.poll();
            TreeNode node;

            if(level % 2 == 0){
                node = sEven.pop();
            }else{
                node = sOdd.pop();
            }

            if(result.size() < level+1){
                result.add(new ArrayList<>());
            }
            result.get(level).add(node.val);

            if(level % 2 == 0){
                if(node.left != null){
                    sOdd.push(node.left);
                    qLevel.add(level+1);
                }
                if(node.right != null){
                    sOdd.push(node.right);
                    qLevel.add(level+1);
                }
            }else{
                if(node.right != null){
                    sEven.push(node.right);
                    qLevel.add(level+1);
                }
                if(node.left != null){
                    sEven.push(node.left);
                    qLevel.add(level+1);
                }
            }
        }

        return result;
    }

}
