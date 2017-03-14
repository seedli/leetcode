package seed.leetcode.demo.A101to200;

import seed.leetcode.demo.TreeNode;

/**
 * Created by seedli on 2017/3/14.
 */
public class A101_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return checkSymmetric(root.left, root.right);
    }

    private boolean checkSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;

        return checkSymmetric(left.left, right.right) && checkSymmetric(left.right, right.left);
    }

}
