package seed.leetcode.demo.A0901to1000;

public class A925_LongPressedName {

	public boolean isLongPressedName(String name, String typed) {

		int idxN = 0;
		int idxT = 0;
		char cPrev = '?';

		while (idxT < typed.length() || idxN < name.length()) {
			char cName = idxN >= name.length() ? cPrev : name.charAt(idxN);
			char cType = idxT >= typed.length() ? '?' : typed.charAt(idxT);

			if (cName == cType) {
				idxN++;
				idxT++;
				cPrev = cName;
			} else if (cName != cType && cType == cPrev) {
				idxT++;
			} else {
				return false;
			}
		}

		return true;
	}
}
