package seed.leetcode.demo.A0001to0100;

import java.util.ArrayList;
import java.util.List;

import seed.leetcode.demo.TreeNode;

public class A099_RecoverBinarySearchTree {

	public void recoverTree(TreeNode root) {
		List<TreeNode> nodes = new ArrayList<>();
		inorder(root, nodes);

		TreeNode node1 = null;
		TreeNode node2 = null;

		TreeNode[] arr = nodes.toArray(new TreeNode[nodes.size()]);
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				if (arr[i].val >= arr[i + 1].val)
					node1 = arr[i];
			} else if (i == arr.length - 1) {
				if (arr[i].val <= arr[i - 1].val)
					node2 = arr[i];
			} else {
				if (arr[i].val <= arr[i - 1].val || arr[i].val >= arr[i + 1].val) {
					if (node1 == null)
						node1 = arr[i];
					else
						node2 = arr[i];
				}
			}
		}

		if (node1 != null && node2 != null) {
			int tmp = node1.val;
			node1.val = node2.val;
			node2.val = tmp;
		}

		System.out.println("HELLO");
	}

	private void inorder(TreeNode node, List<TreeNode> nodes) {
		if (node.left != null)
			inorder(node.left, nodes);

		nodes.add(node);

		if (node.right != null)
			inorder(node.right, nodes);
	}
}
