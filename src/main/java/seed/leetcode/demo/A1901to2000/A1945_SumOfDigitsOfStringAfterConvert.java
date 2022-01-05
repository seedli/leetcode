package seed.leetcode.demo.A1901to2000;

public class A1945_SumOfDigitsOfStringAfterConvert {

	public int getLucky(String s, int k) {
		int sum = 0;
		for (char c : s.toCharArray()) {
			sum += getAlphabetSum(c);
		}

		return run(sum, k-1);
	}

	private int run(int num, int k) {
		if (k == 0)
			return num;
		else
			return run(getNumberDigitsSum(num), k - 1);
	}

	private int getAlphabetSum(char c) {
		int alphaNum = "0abcdefghijklmnopqrstuvwxyz".indexOf(c);

		return getNumberDigitsSum(alphaNum);
	}

	private int getNumberDigitsSum(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
