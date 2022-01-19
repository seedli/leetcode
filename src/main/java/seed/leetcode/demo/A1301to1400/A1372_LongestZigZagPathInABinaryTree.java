package seed.leetcode.demo.A1301to1400;

import seed.leetcode.demo.TreeNode;

public class A1372_LongestZigZagPathInABinaryTree {

	private int longest;

	public int longestZigZag(TreeNode root) {
		longest = 0;

		if (root.left != null)
			goLeft(root.left, 1);

		if (root.right != null)
			goRight(root.right, 1);

		return longest;
	}

	private void goLeft(TreeNode node, int depth) {
		if (node.right != null)
			goRight(node.right, depth + 1);

		if (node.left != null)
			goLeft(node.left, 1);

		longest = Math.max(longest, depth);
	}

	private void goRight(TreeNode node, int depth) {
		if (node.right != null)
			goRight(node.right, 1);

		if (node.left != null)
			goLeft(node.left, depth + 1);

		longest = Math.max(longest, depth);
	}
}
