package seed.leetcode.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by User on 2017/2/2.
 */
public class Utility {

	public static void printListNodeVal(ListNode node) {
		if (node == null)
			return;
		ListNode head = node;
		while (node != null) {
			System.out.print(node.val);
			if (node.next != null) {
				System.out.print("->");
			}
			node = node.next;
		}
		node = head;
		System.out.println();
	}

	public static ListNode ListToListNode(List list) {
		ListNode node = new ListNode(0);
		ListNode head = node;
		if (list.size() == 0)
			return null;

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			node.next = new ListNode(iterator.next());
			node = node.next;
		}
		return head.next;
	}

	public static TreeNode ListToTreeNode(List<Integer> list) {
		if (list.size() == 0)
			return null;

		Queue<TreeNode> setUpQueue = new LinkedList<>();
		TreeNode root = new TreeNode(list.get(0));
		list.remove(0);
		setUpQueue.add(root);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			TreeNode node = setUpQueue.poll();

			// set left
			if (itr.hasNext()) {
				Integer val = itr.next();
				if (val == null) {
					node.left = null;
				} else {
					node.left = new TreeNode(val);
					setUpQueue.add(node.left);
				}
			}

			// set right
			if (itr.hasNext()) {
				Integer val = itr.next();
				if (val == null) {
					node.right = null;
				} else {
					node.right = new TreeNode(val);
					setUpQueue.add(node.right);
				}
			}
		}

		return root;
	}

}
