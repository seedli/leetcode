package seed.leetcode.demo.A0001to0100;

import org.junit.Test;

import seed.leetcode.demo.TreeNode;

public class A099_RecoverBinarySearchTreeTest {

	@Test
	public void test() {
		A099_RecoverBinarySearchTree a = new A099_RecoverBinarySearchTree();

		TreeNode T0 = new TreeNode(0);
		TreeNode T1 = new TreeNode(1);
		TreeNode T2 = new TreeNode(2);
		TreeNode T3 = new TreeNode(3);
		TreeNode T4 = new TreeNode(4);
		TreeNode T5 = new TreeNode(5);
		TreeNode T6 = new TreeNode(6);
		TreeNode T7 = new TreeNode(7);

		T1.left = T3;
		T3.right = T2;

		a.recoverTree(T1);
	}
}
