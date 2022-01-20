package seed.leetcode.demo.A2101to2200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class A2115_FindAllPossibleRecipesFromGivenSuppliesTest {

	@Test
	public void test() {
		A2115_FindAllPossibleRecipesFromGivenSupplies a = new A2115_FindAllPossibleRecipesFromGivenSupplies();

		List<String> res = null;
		List<List<String>> ingredients = new ArrayList<>();

		ingredients.add(Arrays.asList("yeast", "flour"));
		res = a.findAllRecipes(new String[] { "bread" }, ingredients, new String[] { "yeast", "flour", "corn" });
		System.out.println(Arrays.toString(res.toArray()));

		ingredients.clear();

		ingredients.add(Arrays.asList("yeast", "flour"));
		ingredients.add(Arrays.asList("bread", "meat"));
		res = a.findAllRecipes(new String[] { "bread", "sandwich" }, ingredients,
				new String[] { "yeast", "flour", "meat" });
		System.out.println(Arrays.toString(res.toArray()));

	}
}
