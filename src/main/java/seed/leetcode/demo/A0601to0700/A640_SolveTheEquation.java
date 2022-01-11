package seed.leetcode.demo.A0601to0700;

public class A640_SolveTheEquation {

	public String solveEquation(String equation) {
		String[] s = equation.split("=");
		int[] a = process(s[0]);
		int[] b = process(s[1]);

		int numOfX = a[0] - b[0];
		int num = b[1] - a[1];

		if (numOfX == 0 && num == 0)
			return "Infinite solutions";
		else if (numOfX == 0 && num != 0)
			return "No solution";
		else if (num == 0)
			return "x=0";

		if (numOfX != 1) {
			num = num / numOfX;
			numOfX = 1;
		}

		return (numOfX > 1 || numOfX < 0 ? String.valueOf(numOfX) + "x" : numOfX == 1 ? "x" : "") + "="
				+ (String.valueOf(num));
	}

	private int[] process(String s) {
		int[] res = new int[2];

		int numOfX = 0;
		int num = 0;
		int tmpNum = 0;
		char[] cs = s.toCharArray();

		char opr = '+';

		boolean hasDigit = false;
		for (char c : cs) {
			if (Character.isDigit(c)) {
				tmpNum = tmpNum * 10 + Character.getNumericValue(c);
				hasDigit = true;
			} else if (c == 'x') {
				if (hasDigit) {
					if (opr == '+')
						numOfX += tmpNum;
					else
						numOfX -= tmpNum;
				} else {
					if (opr == '+')
						numOfX++;
					else
						numOfX--;
				}
				tmpNum = 0;
				hasDigit = false;
			} else if (c == '+' || c == '-') {
				if (opr == '+')
					num += tmpNum;
				else
					num -= tmpNum;

				opr = c;
				tmpNum = 0;
				hasDigit = false;
			}
		}
		if (tmpNum != 0) {
			if (opr == '+')
				num += tmpNum;
			else
				num -= tmpNum;
		}

		res[0] = numOfX;
		res[1] = num;
		return res;
	}
}
