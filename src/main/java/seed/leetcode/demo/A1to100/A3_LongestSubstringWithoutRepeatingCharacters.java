package seed.leetcode.demo.A1to100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 2017/5/9.
 */
public class A3_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> KeySet = new HashSet<>();
        if(s.length() > 0){
            int LongestLength = 1;
            char[] aryS = s.toCharArray();
            for(int i=0; i<aryS.length; i++){
                for(int j=i; j<aryS.length; j++){
                    if(KeySet.add(aryS[j])){
                        if(KeySet.size() > LongestLength){
                            LongestLength = KeySet.size();
                        }
                    }else{
                        break;
                    }
                }
                KeySet.clear();
            }
            return LongestLength;
        }else{
            return 0;
        }
    }

    public int lengthOfLongestSubstring2(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }

}
