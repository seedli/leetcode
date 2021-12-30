package seed.leetcode.demo.A0701to0800;

import java.util.ArrayList;
import java.util.List;

public class A797_AllPathsFromSourceToTarget {

	List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		result.clear();

		dfs(0, graph, new ArrayList<Integer>());

		return result;
	}

	private void dfs(int edge, int[][] graph, List<Integer> track) {
		int[] adj = graph[edge];
		track.add(edge);
		if (edge == graph.length - 1) {
			result.add(new ArrayList<Integer>(track));
			return;
		} else {
			for (int i = 0; i < adj.length; i++) {
				dfs(adj[i], graph, track);
				track.remove(track.size() - 1);
			}
		}
	}
}
