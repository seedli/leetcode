package seed.leetcode.demo.A0001to0100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import seed.leetcode.demo.TreeNode;

/**
 * Created by User on 2017/3/14.
 */
public class A098_ValidateBinarySearchTree {

	public boolean isValidBST(TreeNode root) {
		List<TreeNode> nodes = new ArrayList<>();
		boolean res = inorder(root, nodes);

		return res;
	}

	private boolean inorder(TreeNode node, List<TreeNode> nodes) {
		if (node.left != null && !inorder(node.left, nodes))
			return false;

		if (nodes.size() > 0 && node.val <= nodes.get(nodes.size() - 1).val)
			return false;

		nodes.add(node);

		if (node.right != null && !inorder(node.right, nodes))
			return false;

		return true;
	}

	public boolean isValidBST_Old(TreeNode root) {
		if (root == null)
			return true;

		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		pushStack(stack, node);

		while (!stack.isEmpty()) {
			node = stack.pop();
			result.add(node.val);
			if (node.right != null) {
				pushStack(stack, node.right);
			}
		}

		Integer p = null;
		for (Integer i : result) {
			if (p == null) {
				p = i;
				continue;
			}

			if (p >= i)
				return false;

			p = i;
		}
		return true;
	}

	// push TreeNode to the stack until the TreeNode.left is null
	private void pushStack(Stack<TreeNode> stack, TreeNode node) {
		while (node != null) {
			stack.push(node);
			node = node.left;
		}
	}

}
