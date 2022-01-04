package seed.leetcode.demo.A2001to2100;

public class A2047_NumberOfValidWordsInASentence {

	public int countValidWords(String sentence) {
		int res = 0;
		String[] arr = sentence.split(" ");

		for (String s : arr) {
			if (verify(s))
				res++;
		}

		return res;
	}

	private boolean verify(String s) {
		if (s.isBlank())
			return false;

		boolean HAppeared = false;
		boolean EAppeared = false;
		Character prevType = null;

		for (Character c : s.toCharArray()) {
			if (prevType != null && prevType == 'E')
				return false;

			if (c.equals('-')) {
				if (HAppeared || prevType == null)
					return false;

				HAppeared = true;
				prevType = 'H';
			} else if (c.equals(',') || c.equals('.') || c.equals('!')) {
				if (EAppeared || (prevType == null && s.length() > 1) || (prevType != null && prevType == 'H'))
					return false;

				EAppeared = true;
				prevType = 'E';
			} else if (Character.isLowerCase(c)) {

				prevType = 'C';
			} else if (Character.isDigit(c)) {
				return false;
			}
		}

		return prevType != 'H' && (prevType == 'E' || prevType == 'C');
	}
}
