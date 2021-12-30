package seed.leetcode.demo.A0101to0200;

import java.util.ArrayList;
import java.util.List;

import seed.leetcode.demo.TreeNode;

public class A145_BinaryTreePostorderTraversal {

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null)
			return res;

		postOrder(root, res);

		return res;
	}

	private void postOrder(TreeNode node, List<Integer> res) {

		if (node.left != null)
			postOrder(node.left, res);

		if (node.right != null)
			postOrder(node.right, res);

		System.out.println(node.val);
		res.add(node.val);
	}

}
