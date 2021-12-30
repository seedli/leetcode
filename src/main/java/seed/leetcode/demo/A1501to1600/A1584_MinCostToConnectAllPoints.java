package seed.leetcode.demo.A1501to1600;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class A1584_MinCostToConnectAllPoints {

	// Passed, longer execution time, but memory saving.
	public int minCostConnectPoints(int[][] points) {
		if (points.length < 2)
			return 0;

		int[][] map = new int[points.length][points.length];
		calculateDists(map, points);

		List<Integer> unconnected = new LinkedList<>();
		for (int i = 1; i < points.length; i++)
			unconnected.add(i);

		List<Integer> connected = new ArrayList<>();
		connected.add(0); // pick 0 into the tree

		return backTracking(points, unconnected, connected, map);
	}

	private int backTracking(int[][] points, List<Integer> unconnected, List<Integer> connected, int[][] map) {
		if (unconnected.size() == 0)
			return 0;

		int point = -1;
		int shortest = Integer.MAX_VALUE;

		// find shortest edge and pick a point into the connected tree
		for (int u : unconnected) {
			for (int c : connected) {
				if (u != c && map[u][c] < shortest) {
					point = u;
					shortest = map[u][c];
				}
			}
		}

		if (point != -1) {
			unconnected.remove((Integer) point);
			connected.add(point);
		}

		return shortest + backTracking(points, unconnected, connected, map);
	}

	private void calculateDists(int[][] map, int[][] points) {
		for (int i = 0; i < points.length; i++) {
			for (int j = i; j < points.length; j++) {
				if (i != j) {
					int dist = cal(points[i], points[j]);
					map[i][j] = dist;
					map[j][i] = dist;
				}
			}
		}
	}

	private int cal(int[] p1, int[] p2) {
		return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
	}
}
