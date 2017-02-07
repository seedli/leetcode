package seed.leetcode.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017/2/7.
 */
public class A6_ZigZagConversion {
    public String convert(String s, int numRows) {

        List<List<String>> ListZigZag = new ArrayList<List<String>>(numRows);
        status Status = status.foward;

        char[] aryS = s.toCharArray();
        int RowIdx = 0;

        for(int i = 0; i<numRows; i++){
            ListZigZag.add(new ArrayList<String>());
        }

        for(int i = 0; i<s.length(); i++){
            ListZigZag.get(RowIdx).add(String.valueOf(aryS[i]));

            if(RowIdx == 0){
                if(RowIdx != numRows-1){
                    RowIdx++;
                }
                Status = status.foward;
            }else if(RowIdx == numRows-1){
                RowIdx--;
                Status = status.back;
            }else{
                if(Status == status.foward){
                    RowIdx++;
                }else{
                    RowIdx--;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(List<String> aryList : ListZigZag){
            for(String S : aryList){
                sb.append(S);
            }
        }

        return sb.toString();
    }

    enum status{foward, back}
}
