package seed.leetcode.demo.A1001to1100;

import seed.leetcode.demo.TreeNode;

public class A1080_InsufficientNodesInRootToLeafPaths {

	public TreeNode sufficientSubset(TreeNode root, int limit) {

		if (dfs(root, limit, 0))
			return root;
		else
			return null;
	}

	private boolean dfs(TreeNode node, int limit, int sum) {

		if (node.left == null && node.right == null && sum + node.val >= limit)
			return true;

		boolean leftSufficient = false;
		boolean rightSufficient = false;

		if (node.left != null)
			leftSufficient = dfs(node.left, limit, sum + node.val);

		if (node.right != null)
			rightSufficient = dfs(node.right, limit, sum + node.val);

		if (!leftSufficient)
			node.left = null;

		if (!rightSufficient)
			node.right = null;

		return leftSufficient || rightSufficient;
	}

}
