package seed.leetcode.demo.A0701to0800;

import java.util.ArrayList;
import java.util.List;

public class A722_RemoveComments {

	private static final String LC = "//";
	private static final String BC_S = "/*";
	private static final String BC_E = "*/";

	private boolean blockMode;

	public List<String> removeComments(String[] source) {
		List<String> res = new ArrayList<>();
		blockMode = false;

		String tmpS = "";
		for (String s : source) {
			s = process(s);

			if (blockMode) {
				tmpS += s;
				continue;
			}
			if (tmpS.length() > 0) {
				tmpS += s;
				res.add(tmpS);
				tmpS = "";
			} else if (!s.isEmpty()) {
				res.add(s);
			}
		}

		return res;
	}

	private String process(String s) {
		if (blockMode && s.indexOf(BC_E) < 0) {
			return "";
		}

		if (!blockMode) {
			if (s.indexOf(LC) >= 0 && (s.indexOf(BC_S) == -1 || s.indexOf(LC) < s.indexOf(BC_S))) {
				s = s.substring(0, s.indexOf(LC));
			}
			if (s.indexOf(BC_S) >= 0 && s.indexOf(BC_E) >= 0) {
				s = s.replaceFirst("\\/\\*(\\*(?!\\/)|[^*])*\\*\\/", "");
			}
			if (s.indexOf(BC_S) >= 0 && (s.indexOf(LC) == -1 || s.indexOf(BC_S) < s.indexOf(LC))) {
				s = s.substring(0, s.indexOf(BC_S));
				blockMode = true;
			}
		}

		if (blockMode && s.indexOf(BC_E) >= 0) {
			s = s.substring(s.indexOf(BC_E) + 2);
			blockMode = false;
		}

		if (s.indexOf(BC_S) > 0 || s.indexOf(LC) > 0)
			return process(s);
		else
			return s;
	}

//	private String process(String s) {
//		if (blockMode && s.indexOf(BC_E) < 0) {
//			return "";
//		}
//
//		if (!blockMode) {
//			while (s.indexOf(BC_S) > -1 || s.indexOf(LC) > -1) {
//				if (s.indexOf(LC) >= 0 && (s.indexOf(BC_S) == -1 || s.indexOf(LC) < s.indexOf(BC_S))) {
//					s = s.substring(0, s.indexOf(LC));
//				} else if (s.indexOf(BC_S) >= 0) {
//					if (s.indexOf(BC_E) >= 0 && s.indexOf(BC_E) - s.indexOf(BC_S) > 2) {
//						s = s.replaceFirst("\\/\\*(\\*(?!\\/)|[^*])*\\*\\/", "");
//					} else {
//						s = s.substring(0, s.indexOf(BC_S));
//						blockMode = true;
//					}
//				}
//			}
//		}
//
//		if (blockMode && s.indexOf(BC_E) >= 0) {
//			s = s.substring(s.indexOf(BC_E) + 2);
//			blockMode = false;
//		}
//
//		return s;
//	}
}
