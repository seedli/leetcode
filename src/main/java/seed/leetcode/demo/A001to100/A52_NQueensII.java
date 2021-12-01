package seed.leetcode.demo.A001to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 2017/2/10.
 */
public class A52_NQueensII {

    boolean mY[]; //yè»? ??‰æ”¾Q
    boolean mX[]; //xè»? ??‰æ”¾Q
    boolean md1[]; //  / ??‰æ”¾Q
    boolean md2[]; // \??‰æ”¾Q
    int result = 0;

    public int totalNQueens(int n) {
        return solveNQueens(n);
    }

    public int solveNQueens(int n) {
        boolean[][] solution = new boolean[n][n]; // // int[y] = x;

        mY = new boolean[n];
        mX = new boolean[n];
        md1 = new boolean[n*2-1];
        md2 = new boolean[n*2-1];

        Arrays.fill(mX, false);
        Arrays.fill(mY, false);
        Arrays.fill(md1, false);
        Arrays.fill(md2, false);

        backtrack(0, 0, 0, n, solution);

        return result;
    }

    private void backtrack(int X, int Y, int PutQNum, int N, boolean[][] solution){
        if(X == N){
            Y++;
            X=0;
        }

        if( Y == N ){
            if(PutQNum < N) return;

            result = result + 1;
            //System.out.println(result);
            //recordSolution(result, solution);

            return;
        }

        //Put Queen
        int d1= X+Y; int d2= N-1+Y-X;
        if( !mX[X] && !mY[Y] && !md1[d1] && !md2[d2] ){
            mX[X] = mY[Y] = md1[d1] = md2[d2] = true;
            solution[Y][X] = true;
            backtrack(X+1, Y, PutQNum+1, N, solution);
            //end this backtrack, turn back false
            mX[X] = mY[Y] = md1[d1] = md2[d2] = false;
        }

        //Not to put Queen
        solution[Y][X] = false;
        backtrack(X+1, Y, PutQNum, N, solution);
    }

    private void recordSolution(List<List<String>> result, boolean[][] solution){
        List<String> solutionLine = new ArrayList<>();
        for(boolean[] Line : solution){
            String strLine = "";
            for(boolean cell : Line){
                if(cell){
                    strLine += "Q";
                }else{
                    strLine += ".";
                }
            }
            solutionLine.add(strLine);
        }
        result.add(solutionLine);
    }

}
