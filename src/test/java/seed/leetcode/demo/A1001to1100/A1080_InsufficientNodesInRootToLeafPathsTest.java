package seed.leetcode.demo.A1001to1100;

import org.junit.Test;

import seed.leetcode.demo.TreeNode;

public class A1080_InsufficientNodesInRootToLeafPathsTest {

	@Test
	public void test() {
		A1080_InsufficientNodesInRootToLeafPaths a = new A1080_InsufficientNodesInRootToLeafPaths();

		TreeNode root = new TreeNode(1);
		TreeNode T1 = new TreeNode(2);
		TreeNode T2 = new TreeNode(3);
		TreeNode T3 = new TreeNode(4);
		TreeNode T4 = new TreeNode(-99);
		TreeNode T5 = new TreeNode(-99);
		TreeNode T6 = new TreeNode(7);
		TreeNode T7 = new TreeNode(8);
		TreeNode T8 = new TreeNode(9);
		TreeNode T9 = new TreeNode(-99);
		TreeNode T10 = new TreeNode(-99);
		TreeNode T11 = new TreeNode(12);
		TreeNode T12 = new TreeNode(13);
		TreeNode T13 = new TreeNode(-99);
		TreeNode T14 = new TreeNode(14);

		root.left = T1;
		root.right = T2;
		T1.left = T3;
		T1.right = T4;
		T3.left = T7;
		T3.right = T8;
		T4.left = T9;
		T4.right = T10;
		T2.left = T5;
		T2.right = T6;
		T5.left = T11;
		T5.right = T12;
		T6.left = T13;
		T6.right = T14;

		a.sufficientSubset(root, 1);
	}
}
