package seed.leetcode.demo.A0901to1000;

import java.util.LinkedList;
import java.util.Queue;

import seed.leetcode.demo.TreeNode;

public class A965_UnivaluedBinaryTree {

	public boolean isUnivalTree(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int val = root.val;

		// BFS
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();

			if (val != node.val)
				return false;

			if (node.left != null)
				queue.add(node.left);

			if (node.right != null)
				queue.add(node.right);

		}
		return true;
	}

}
