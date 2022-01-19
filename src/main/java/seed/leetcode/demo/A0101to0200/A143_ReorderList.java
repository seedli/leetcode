package seed.leetcode.demo.A0101to0200;

import seed.leetcode.demo.ListNode;

public class A143_ReorderList {

	public void reorderList(ListNode head) {

		ListNode first = head;
		ListNode second = null;
		ListNode lastButOne = null;
		ListNode last = null;

		while (first.next != null && first.next.next != null) {
			second = first.next;
			// find last node
			lastButOne = findLastButOne(first);
			last = lastButOne.next;

			// cut off
			lastButOne.next = null;

			// insert
			first.next = last;
			last.next = second;

			// move first node
			first = second;
		}

		System.out.println(first);
	}

	private ListNode findLastButOne(ListNode node) {
		while (node.next.next != null)
			node = node.next;

		return node;
	}
}
