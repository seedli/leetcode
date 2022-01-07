package seed.leetcode.demo.A0201to0300;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import seed.leetcode.demo.TreeNode;

public class A222_CountCompleteTreeNodesTest {

	@Test
	public void test() {

		TreeNode T1 = new TreeNode(1);
		TreeNode T2 = new TreeNode(2);
		TreeNode T3 = new TreeNode(3);
		TreeNode T4 = new TreeNode(4);
		TreeNode T5 = new TreeNode(5);
		TreeNode T6 = new TreeNode(6);
		TreeNode T7 = new TreeNode(7);

		TreeNode TX = new TreeNode(99);

		T1.left = T2;
		T1.right = T3;
		T2.left = T4;
		T2.right = T5;
		T3.left = T6;
		T3.right = T7;

		T4.right = TX;

		A222_CountCompleteTreeNodes a = new A222_CountCompleteTreeNodes();

		assertEquals(7, a.countNodes(T1));
	}
}
