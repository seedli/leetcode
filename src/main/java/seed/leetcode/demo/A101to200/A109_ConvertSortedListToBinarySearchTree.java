package seed.leetcode.demo.A101to200;

import seed.leetcode.demo.ListNode;
import seed.leetcode.demo.TreeNode;

public class A109_ConvertSortedListToBinarySearchTree {
	public TreeNode sortedListToBST(ListNode head) {
		return makeBSTTree(head);
	}

	private TreeNode makeBSTTree(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return new TreeNode(head.val);

		ListNode node1 = head;

		// find the middle listNode
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		count = count / 2;
		head = node1;
		ListNode prev = null;
		for (int i = 0; i < count; i++) {
			prev = head;
			head = head.next;
		}

		TreeNode root = new TreeNode(head.val);

		// cut the list
		if (prev != null) {
			prev.next = null;
		}

		root.left = makeBSTTree(node1);
		root.right = makeBSTTree(head.next);

		return root;
	}
}
