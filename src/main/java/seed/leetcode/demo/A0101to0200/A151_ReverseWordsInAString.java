package seed.leetcode.demo.A0101to0200;

public class A151_ReverseWordsInAString {

	public String reverseWords(String s) {
		s = s.trim().replaceAll("\\s+", " ");

		String[] arr = s.split("\\s");
		if (arr.length == 1)
			return s;

		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i > 0; i--)
			sb.append(arr[i]).append(" ");

		return sb.append(arr[0]).toString();
	}
}
