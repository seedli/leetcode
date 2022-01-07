package seed.leetcode.demo.A1201to1300;

import java.util.ArrayList;
import java.util.List;

public class A1291_SequentialDigits {

	public List<Integer> sequentialDigits(int low, int high) {
		List<Integer> result = new ArrayList<>();
		if (low > 123456789)
			return result;

		int num = findFirstSequentialDigits(low);

		while (num <= high) {
			if (num > 123456789)
				break;

			result.add(num);

			num = getNextSequentialDigits(num);
		}

		return result;
	}

	private int findFirstSequentialDigits(int num) {
		if (isSequentialDigits(num))
			return num;
		else {
			char[] cs = String.valueOf(num).toCharArray();

			if (10 - cs.length < Integer.valueOf(Character.getNumericValue(cs[0]))) {
				return genSequentialDigits(cs.length + 1, 1);
			} else {
				int tmp = genSequentialDigits(cs.length, Integer.valueOf(Character.getNumericValue(cs[0])));
				if (tmp > num) {
					return tmp;
				} else {
					if (cs.length + Integer.valueOf(Character.getNumericValue(cs[0])) + 1 > 10)
						return genSequentialDigits(cs.length + 1, 1);
					else
						return genSequentialDigits(cs.length, Integer.valueOf(Character.getNumericValue(cs[0])) + 1);
				}
			}
		}
	}

	private boolean isSequentialDigits(int num) {
		char[] cs = String.valueOf(num).toCharArray();

		char prev = 'N';
		for (char c : cs) {
			if (prev == 'N') {
				prev = c;
				continue;
			}
			if (c - prev != 1)
				return false;

			prev = c;
		}
		return true;
	}

	private int getNextSequentialDigits(int num) {
		char[] cs = String.valueOf(num).toCharArray();
		if (10 - cs.length == Integer.valueOf(Character.getNumericValue(cs[0]))) {
			return genSequentialDigits(cs.length + 1, 1);
		} else {
			// + 11111
			for (int i = 0; i < cs.length; i++)
				num += 1 * (Math.pow(10, i));

			return num;
		}
	}

	private int genSequentialDigits(int length, int startWith) {
		int num = 0;

		for (int i = length - 1; i >= 0; i--) {
			num += startWith++ * (i == 0 ? 1 : Math.pow(10, i));
		}

		return num;
	}

}
