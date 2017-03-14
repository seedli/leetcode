package seed.leetcode.demo.A1to100;

import seed.leetcode.demo.TreeNode;

/**
 * Created by User on 2017/3/9.
 */
public class A100_SameTree {

    public boolean isSameTree(TreeNode pNode, TreeNode qNode){
        if(pNode == null && qNode == null) return true;
        else if(pNode == null && qNode != null || qNode == null && pNode != null){
            return false;
        }else if(pNode.val != qNode.val){
            return false;
        }
        else return isSameTree(pNode.left, qNode.left) && isSameTree(pNode.right, qNode.right);
    }

}
