package seed.leetcode.demo.A1701to1800;

public class A1779_FindNearestPointThatHasTheSameXorYCoordinate {

	public int nearestValidPoint(int x, int y, int[][] points) {
		int nearestIdx = -1;

		for (int i = 0; i < points.length; i++) {
			if (points[i][0] == x && points[i][1] == y)
				return i;
			else if (points[i][0] == x || points[i][1] == y) {
				if (nearestIdx == -1) {
					nearestIdx = i;
				} else {
					int d1 = manhattan(points[nearestIdx][0], points[nearestIdx][1], x, y);
					int d2 = manhattan(points[i][0], points[i][1], x, y);

					if (d2 < d1)
						nearestIdx = i;
				}
			}
		}

		return nearestIdx;
	}

	private int manhattan(int x1, int y1, int x2, int y2) {
		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
	}
}
