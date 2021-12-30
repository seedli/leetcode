package seed.leetcode.demo.A0101to0200;

import seed.leetcode.demo.TreeNode;

/**
 * Created by seedli on 2017/7/10.
 */
public class A112_PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null) {
            return backtrack(root.right, root.val, targetSum);
        } else if (root.right == null){
            return backtrack(root.left, root.val, targetSum);
        } else{
            return backtrack(root.left, root.val, targetSum) || backtrack(root.right, root.val, targetSum);
        }
    }

    private boolean backtrack(TreeNode node, int sum, int targetSum){
        if(node == null){
            return sum == targetSum;
        }

        if(node.left == null && node.right == null){
            return sum + node.val == targetSum;
        }

        if(node.left != null && node.right == null){
            return backtrack(node.left, sum+node.val, targetSum);
        }else if(node.right != null && node.left == null){
            return backtrack(node.right, sum+node.val, targetSum);
        }else{
            return backtrack(node.left, sum+node.val, targetSum) || backtrack(node.right, sum+node.val, targetSum);
        }

    }


    // GOOD Answer on solution
    public boolean hasPathSumGood(TreeNode root, int sum) {
        if(root == null) return false;

        if(root.left == null && root.right == null && sum - root.val == 0) return true;

        return hasPathSumGood(root.left, sum - root.val) || hasPathSumGood(root.right, sum - root.val);
    }


}
