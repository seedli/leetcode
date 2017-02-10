package seed.leetcode.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 2017/2/10.
 */
public class A51_NQueens {

    boolean mY[]; //y軸 有放Q
    boolean mX[]; //x軸 有放Q
    boolean md1[]; //  / 有放Q
    boolean md2[]; // \有放Q

    public List<List<String>> solveNQueens(int n) {
        boolean[][] solution = new boolean[n][n]; // // int[y] = x;

        mY = new boolean[n];
        mX = new boolean[n];
        md1 = new boolean[n*2-1];
        md2 = new boolean[n*2-1];

        Arrays.fill(mX, false);
        Arrays.fill(mY, false);
        Arrays.fill(md1, false);
        Arrays.fill(md2, false);

        List<List<String>> result = new ArrayList<>();
        backtrack(0, 0, 0, n, result, solution);

        return result;
    }

    private void backtrack(int X, int Y, int PutQNum, int N, List<List<String>> result, boolean[][] solution){
        if(X == N){
            Y++;
            X=0;
        }

        if( Y == N ){
            if(PutQNum < N) return;

            recordSolution(result, solution);

            return;
        }

        //Put Queen
        int d1= X+Y; int d2= N-1+Y-X;
        if( !mX[X] && !mY[Y] && !md1[d1] && !md2[d2] ){
            mX[X] = mY[Y] = md1[d1] = md2[d2] = true;
            solution[Y][X] = true;
            backtrack(X+1, Y, PutQNum+1, N, result, solution);
            //end this backtrack, turn back false
            mX[X] = mY[Y] = md1[d1] = md2[d2] = false;
        }

        //Not to put Queen
        solution[Y][X] = false;
        backtrack(X+1, Y, PutQNum, N, result, solution);
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
