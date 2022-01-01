package seed.leetcode.demo.A1601to1700;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A1670_DesignFrontMiddleBackQueueTest {

	@Test
	public void test() {
		FrontMiddleBackQueue q = new FrontMiddleBackQueue();

		q.pushFront(1); // [1]
		q.pushBack(2); // [1, 2]
		q.pushMiddle(3); // [1, 3, 2]
		q.pushMiddle(4); // [1, 4, 3, 2]
		assertEquals(1, q.popFront()); // return 1 -> [4, 3, 2]
		assertEquals(3, q.popMiddle()); // return 3 -> [4, 2]
		assertEquals(4, q.popMiddle()); // return 4 -> [2]
		assertEquals(2, q.popBack()); // return 2 -> []
		assertEquals(-1, q.popFront()); // return -1 -> [] (The queue is empty)
	}
}
