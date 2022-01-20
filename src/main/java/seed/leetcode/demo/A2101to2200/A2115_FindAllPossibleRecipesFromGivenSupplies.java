package seed.leetcode.demo.A2101to2200;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A2115_FindAllPossibleRecipesFromGivenSupplies {
	public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
		int[] countOfSupplies = new int[recipes.length];
		List<String> result = new ArrayList<>();
		List<String> suppliess = Stream.of(supplies).collect(Collectors.toList());
		List<String> newSupplies = null;

		// iterate over ingredients
		while (suppliess.size() > 0) {
			newSupplies = new ArrayList<>();

			for (int i = 0; i < suppliess.size(); i++) {
				for (int j = 0; j < ingredients.size(); j++) {
					if (countOfSupplies[j] == ingredients.get(j).size())
						continue;

					if (ingredients.get(j).contains(suppliess.get(i))) {
						if (++countOfSupplies[j] == ingredients.get(j).size()) {
							result.add(recipes[j]);
							newSupplies.add(recipes[j]);
						}
					}
				}
			}

			suppliess = newSupplies;
		}
		return result;
	}
}
