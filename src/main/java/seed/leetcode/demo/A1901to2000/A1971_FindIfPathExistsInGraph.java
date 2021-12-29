package seed.leetcode.demo.A1901to2000;

import java.util.ArrayList;

public class A1971_FindIfPathExistsInGraph {

	// DFS
	public boolean validPath(int n, int[][] edges, int start, int end) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			adj.add(i, new ArrayList<>());
		}

		for (int i = 0; i < edges.length; i++) {
			adj.get(edges[i][0]).add(edges[i][1]);
			adj.get(edges[i][1]).add(edges[i][0]);
		}

		boolean[] visited = new boolean[n + 1];

		if (dfs(start, n, adj, visited, end))
			return true;

		return false;
	}

	public boolean dfs(int edge, int n, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int end) {
		if (edge == end)
			return true;
		visited[edge] = true;

		for (int nextEdge : adj.get(edge)) {
			if (!visited[nextEdge]) {
				if (dfs(nextEdge, n, adj, visited, end))
					return true;
			}
		}
		return false;
	}

//TLE

//	public boolean validPath(int n, int[][] edges, int start, int end) {
//
//		if (edges.length < 1)
//			return true;
//
//		for (int i = 0; i < edges.length; i++) {
//			int[] edge = edges[i];
//
//			if (start == edge[0]) {
//				if (findPath(edges, edge[0], edge[1], end, new HashSet<Integer>()))
//					return true;
//			} else if (start == edge[1]) {
//				if (findPath(edges, edge[1], edge[0], end, new HashSet<Integer>()))
//					return true;
//			}
//		}
//
//		return false;
//	}
//
//	private boolean findPath(int[][] edges, int from, int to, int target, Set<Integer> route) {
//
//		System.out.println("from = " + from + ", to = " + to);
//
//		if (to == target) {
//			System.out.println("found!");
//			return true;
//		}
//
//		if (!route.add(from)) {
//			System.out.println("already go " + from);
//			return false;
//		}
//
//		for (int i = 0; i < edges.length; i++) {
//			int u = edges[i][0];
//			int v = edges[i][1];
//
//			if ((from == u && to == v) || (from == v && to == u))
//				continue;
//
//			if (to == u && findPath(edges, to, v, target, new HashSet<Integer>(route))) {
//				return true;
//			} else if (to == v && findPath(edges, to, u, target, new HashSet<Integer>(route))) {
//				return true;
//			}
//		}
//
//		System.out.println("false");
//
//		return false;
//	}
}
