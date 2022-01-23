package seed.leetcode.demo.A1601to1700;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A1700_NumberOfStudentsUnableToEatLunch {

	public int countStudents(int[] students, int[] sandwiches) {
		int numOfStudents = 0;
		int sanIdx = 0;
		Queue<Integer> stus = new LinkedList<>(IntStream.of(students).boxed().collect(Collectors.toList()));

		while (!stus.isEmpty()) {
			int stu = stus.poll();
			if (stu == sandwiches[sanIdx]) {
				sanIdx++;
				numOfStudents = 0;
			} else {
				stus.add(stu);
				if (++numOfStudents == sandwiches.length - sanIdx)
					return numOfStudents;
			}
		}

		return 0;
	}
}
