package seed.leetcode.demo.A0101to0200;

import org.junit.Test;

import seed.leetcode.demo.TreeNode;
import seed.leetcode.demo.A0101to0200.A114_FlattenBinaryTreeToLinkedList;

public class A114_FlattenBinaryTreeToLinkedListTest {

	@Test
	public void test() {
		A114_FlattenBinaryTreeToLinkedList a = new A114_FlattenBinaryTreeToLinkedList();

		TreeNode T1 = new TreeNode(1);
		TreeNode T2 = new TreeNode(2);
		TreeNode T3 = new TreeNode(3);
		TreeNode T4 = new TreeNode(4);
		TreeNode T5 = new TreeNode(5);
		TreeNode T6 = new TreeNode(6);

		T1.left = T2;
		T1.right = T5;
		T2.left = T3;
		T2.right = T4;
		T5.right = T6;

		a.flatten(T1);

		TreeNode N1 = new TreeNode(0);
		a.flatten(N1);
	}

}
