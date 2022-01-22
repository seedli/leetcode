package seed.leetcode.demo.A1601to1700;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A1672_RichestCustomerWealth {
	public int maximumWealth(int[][] accounts) {
		return Stream.of(accounts).mapToInt(arr -> IntStream.of(arr).sum()).max().orElse(0);
	}
}
