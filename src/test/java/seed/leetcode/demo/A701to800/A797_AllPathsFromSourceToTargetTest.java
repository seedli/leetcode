package seed.leetcode.demo.A701to800;

import java.util.List;

import org.junit.Test;

public class A797_AllPathsFromSourceToTargetTest {

	@Test
	public void test() {
		A797_AllPathsFromSourceToTarget a = new A797_AllPathsFromSourceToTarget();

		List<List<Integer>> result = null;

		result = a.allPathsSourceTarget(new int[][] { { 4, 3, 1 }, { 3, 2, 4 }, { 3 }, { 4 }, {} });
		printResult(result);

//		result = a.allPathsSourceTarget(new int[][] { { 1, 2, 3, 4 }, {}, {}, {}, {} });
//		printResult(result);
//
//		result = a.allPathsSourceTarget(new int[][] { {} });
//		printResult(result);
//
//		result = a.allPathsSourceTarget(new int[][] { { 4, 3, 1 }, { 3, 2, 4 }, {}, { 4 }, {} });
//		printResult(result);
//
//		result = a.allPathsSourceTarget(new int[][] { { 2 }, {}, { 1 } });
//		printResult(result);
	}

	private void printResult(List<List<Integer>> result) {
		for (List<Integer> path : result) {
			path.forEach(i -> System.out.print(i + " "));
			System.out.println(" ↵");
		}
		System.out.println("end");

	}
}
