package seed.leetcode.demo.A1501to1600;

import java.util.Arrays;
import java.util.stream.IntStream;

public class A1588_SumOfAllOddLengthSubarrays {
	public int sumOddLengthSubarrays(int[] arr) {
		int sum = IntStream.of(arr).sum();

		int len = 3;
		while (len <= arr.length) {
			for (int i = 0; i + len <= arr.length; i++) {
				sum += IntStream.of(Arrays.copyOfRange(arr, i, i + len)).sum();
			}
			len += 2;
		}

		return sum;
	}
}
