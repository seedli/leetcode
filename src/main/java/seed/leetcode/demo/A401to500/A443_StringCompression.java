package seed.leetcode.demo.A401to500;

public class A443_StringCompression {
	public int compress(char[] chars) {
		if (chars.length == 0 || chars.length == 1)
			return chars.length;

		int idx = 0;
		int idx_c = 0;
		int num = 1;

		while (idx < chars.length) {
			char c = chars[idx];

			if (idx < chars.length - 1 && c == chars[idx + 1]) {
				num++;
			} else {
				// do compression
				chars[idx_c] = c;

				if (num != 1) {
					chars[idx_c] = c;

					for (char cNum : String.valueOf(num).toCharArray()) {
						chars[++idx_c] = cNum;
					}
				}

				idx_c++;
				num = 1;
			}

			idx++;
		}

		for (char c : chars)
			System.out.print(c);

		return idx_c;
	}

}
