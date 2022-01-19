package seed.leetcode.demo.A1301to1400;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import seed.leetcode.demo.TreeNode;

public class A1372_LongestZigZagPathInABinaryTreeTest {

	@Test
	public void test() {
		A1372_LongestZigZagPathInABinaryTree a = new A1372_LongestZigZagPathInABinaryTree();

		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(7);
		TreeNode t8 = new TreeNode(8);

		t1.right = t2;
		t2.left = t3;
		t2.right = t4;
		t4.left = t5;
		t4.right = t6;
		t5.right = t7;
		t7.right = t8;

		assertEquals(3, a.longestZigZag(t1));

	}
}
