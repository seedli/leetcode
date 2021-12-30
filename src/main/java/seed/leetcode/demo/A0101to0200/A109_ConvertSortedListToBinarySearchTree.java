package seed.leetcode.demo.A0101to0200;

import seed.leetcode.demo.ListNode;
import seed.leetcode.demo.TreeNode;

public class A109_ConvertSortedListToBinarySearchTree {
	public TreeNode sortedListToBST(ListNode head) {
		return makeBST(head);
	}

	private TreeNode makeBST(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return new TreeNode(head.val);

		ListNode leftHead = head;

		// find the middle listNode
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		count = count / 2;
		head = leftHead;
		ListNode prior = null;
		for (int i = 0; i < count; i++) {
			prior = head;
			head = head.next;
		}

		// cut the list
		if (prior != null) {
			prior.next = null;
		}

		TreeNode root = new TreeNode(head.val);

		root.left = makeBST(leftHead);
		root.right = makeBST(head.next);

		return root;
	}
}
