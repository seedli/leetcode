package seed.leetcode.demo.A101to200;

import seed.leetcode.demo.TreeNode;

/**
 * Created by User on 2017/3/15.
 */
public class A104_MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        else return DFS(root, 1);
    }

    private int DFS(TreeNode node, int depth){
        if(node.left == null && node.right == null) return depth;
        else if(node.left == null) return DFS(node.right, depth+1);
        else if(node.right == null) return DFS(node.left, depth+1);
        else return Math.max(DFS(node.left, depth+1), DFS(node.right, depth+1));
    }

}
