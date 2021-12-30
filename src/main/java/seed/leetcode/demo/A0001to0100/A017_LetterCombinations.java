package seed.leetcode.demo.A0001to0100;

import java.util.*;

/**
 * Created by seedli on 2017/1/25.
 */
public class A017_LetterCombinations {

    public static void main(String[] args){
        System.out.println(letterCombinations("232"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> resultList = new ArrayList<>();

        if(!digits.equals("")){
            String[] arrDigits = digits.split("(?!^)");
            Map<String, String[]> MapNumLetters = new HashMap<>();
            MapNumLetters.put("2", new String[]{"a","b","c"});
            MapNumLetters.put("3", new String[]{"d","e","f"});
            MapNumLetters.put("4", new String[]{"g","h","i"});
            MapNumLetters.put("5", new String[]{"j","k","l"});
            MapNumLetters.put("6", new String[]{"m","n","o"});
            MapNumLetters.put("7", new String[]{"p","q","r","s"});
            MapNumLetters.put("8", new String[]{"t","u","v"});
            MapNumLetters.put("9", new String[]{"w","x","y","z"});

            List<String[]> listDigits = new ArrayList<>();
            for(String digit: arrDigits){
                listDigits.add(MapNumLetters.get(digit));
            }

            Combinations(listDigits, resultList, 0, "");
        }

        return resultList;
    }

    public static void Combinations(List<String[]> Lists, List<String> result, int depth, String current){
        if(depth == Lists.size()){
            result.add(current);
            return;
        }

        for(int i = 0; i < Lists.get(depth).length; ++i){
            Combinations(Lists, result, depth + 1, current + Lists.get(depth)[i]);
        }
    }


}
