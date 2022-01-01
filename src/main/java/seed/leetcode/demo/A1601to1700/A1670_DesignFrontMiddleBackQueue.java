package seed.leetcode.demo.A1601to1700;

import java.util.LinkedList;

public class A1670_DesignFrontMiddleBackQueue {

}

class FrontMiddleBackQueue {

	private LinkedList<Integer> list = new LinkedList<>();

	public FrontMiddleBackQueue() {

	}

	public void pushFront(int val) {
		list.push(val);
	}

	public void pushMiddle(int val) {
		list.add(getMiddleIdx(), val);
	}

	public void pushBack(int val) {
		list.addLast(val);
	}

	public int popFront() {
		if (list.isEmpty())
			return -1;

		return list.pop();

	}

	public int popMiddle() {
		if (list.isEmpty())
			return -1;

		if (list.size() % 2 == 0)
			return list.remove(getMiddleIdx() - 1);
		else
			return list.remove(getMiddleIdx());
	}

	public int popBack() {
		if (list.isEmpty())
			return -1;

		return list.pollLast();
	}

	private int getMiddleIdx() {
		return list.size() / 2;
	}

}
