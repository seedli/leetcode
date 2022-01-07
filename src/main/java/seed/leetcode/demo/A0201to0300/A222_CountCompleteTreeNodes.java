package seed.leetcode.demo.A0201to0300;

import java.util.LinkedList;
import java.util.Queue;

import seed.leetcode.demo.TreeNode;

public class A222_CountCompleteTreeNodes {

	public int countNodes(TreeNode root) {
		int count = 0;
		boolean stopAddingQueue = false;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();

			if (node == null)
				break;
			else
				count++;

			if (!stopAddingQueue && node.left != null)
				queue.add(node.left);
			else
				stopAddingQueue = true;

			if (!stopAddingQueue && node.right != null)
				queue.add(node.right);
			else
				stopAddingQueue = true;
		}

		return count;
	}
}
