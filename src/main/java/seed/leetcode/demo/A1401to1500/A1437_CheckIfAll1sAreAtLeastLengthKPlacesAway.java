package seed.leetcode.demo.A1401to1500;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A1437_CheckIfAll1sAreAtLeastLengthKPlacesAway {

	public boolean kLengthApart(int[] nums, int k) {
		String strNums = IntStream.of(nums).boxed().map(Object::toString).collect(Collectors.joining());

		String pattern = k > 0 ? "10{0," + (k - 1) + "}1" : "0";

		return strNums.replaceFirst(pattern, "").length() == strNums.length();
	}
}
