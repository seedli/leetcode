package seed.leetcode.demo.A1501to1600;

public class A1584_MinCostToConnectAllPoints {

	// TODO solve it !!!!!

	public int minCostConnectPoints(int[][] points) {
		if (points.length < 2)
			return 0;

		int[][] map = new int[points.length][points.length];
		boolean[][] connected = new boolean[points.length][points.length];
		calculateDists(map, points);

		int res = backTracking(points, 0, connected, map);

		return res;
	}

	private void calculateDists(int[][] map, int[][] points) {
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				if (i != j) {
					int dist = cal(points[i], points[j]);
					map[i][j] = dist;
					map[j][i] = dist;
				}
			}
		}
	}

	private int backTracking(int[][] points, int currentIdx, boolean[][] connected, int[][] map) {
		if (currentIdx > points.length - 1)
			return 0;

		int cost = Integer.MAX_VALUE;
		int targetIdx = currentIdx;
		// find shortest cost
		for (int i = 0; i < points.length; i++) {
			if (currentIdx == i)
				continue;

			int tmp = map[currentIdx][i];
			if (tmp < cost) {
				targetIdx = i;
				cost = tmp;
			}
		}
		if (cost == Integer.MAX_VALUE)
			return 0;

		if (targetIdx != currentIdx && !connected[currentIdx][targetIdx]) {
			connected[currentIdx][targetIdx] = true;
			connected[targetIdx][currentIdx] = true;
		} else {
			cost = 0;
		}

		return cost + backTracking(points, currentIdx + 1, connected, map);
	}

	private int cal(int[] p1, int[] p2) {
		return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
	}
}
