package seed.leetcode.demo.A0101to0200;

import java.util.LinkedList;
import java.util.List;

import seed.leetcode.demo.TreeNode;

public class A114_FlattenBinaryTreeToLinkedList {

	public void flatten(TreeNode root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null)
			return;

		LinkedList<TreeNode> nodeList = new LinkedList<>();

		preOderTraversal(root, nodeList);

		flatten(root, nodeList);
	}

	private void flatten(TreeNode node, LinkedList<TreeNode> nodeList) {
		node.left = null;

		if (!nodeList.isEmpty()) {
			node.right = nodeList.pop();
			flatten(node.right, nodeList);
		}
	}

	private void preOderTraversal(TreeNode node, List<TreeNode> nodeList) {
		nodeList.add(node);

		if (node.left != null) {
			preOderTraversal(node.left, nodeList);
		}
		if (node.right != null) {
			preOderTraversal(node.right, nodeList);
		}

	}
}
