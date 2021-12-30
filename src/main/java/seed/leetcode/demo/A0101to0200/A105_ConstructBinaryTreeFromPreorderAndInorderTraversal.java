package seed.leetcode.demo.A0101to0200;

import java.util.Arrays;

import seed.leetcode.demo.TreeNode;

/**
 * Created by User on 2017/3/15.
 */
public class A105_ConstructBinaryTreeFromPreorderAndInorderTraversal {

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder.length == 0)
			return null;

		TreeNode root = new TreeNode(preorder[0]);
		int rootIdx = findRootIndex(inorder, preorder[0]);

		root.left = buildTree(Arrays.copyOfRange(preorder, 1, rootIdx + 1), Arrays.copyOfRange(inorder, 0, rootIdx));

		root.right = buildTree(Arrays.copyOfRange(preorder, rootIdx + 1, preorder.length),
				Arrays.copyOfRange(inorder, rootIdx + 1, inorder.length));

		return root;
	}

	private int findRootIndex(int[] inorder, int rootVal) {
		for (int i = 0; i < inorder.length; i++)
			if (inorder[i] == rootVal)
				return i;

		return 0;
	}

}
