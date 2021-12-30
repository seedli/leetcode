package seed.leetcode.demo.A0001to0100;

/**
 * Created by User on 2017/2/15.
 */
public class A079_WordSearch {

    public boolean exist(char[][] board, String word) {
        char[] aryWord = word.toCharArray();
        boolean[][] track = new boolean[board.length][board[0].length];

        if(aryWord.length == 0) return true;

        for(int Y=0; Y<board.length; Y++){
            for(int X=0; X<board[0].length; X++){
                if(board[Y][X] == aryWord[0]){
                    if(backtrack(board, aryWord, track, X, Y, 1)) return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, char[] aryWord, boolean[][] track, int X, int Y, int depth){
        if(depth >= aryWord.length){
            return true;
        }

        track[Y][X] = true;
        //go right
        if(X+1 < board[0].length && !track[Y][X+1] && board[Y][X+1] == aryWord[depth]){
            if(backtrack(board, aryWord, track, X+1, Y, depth+1)) return true;
        }
        //go down
        if(Y+1 < board.length && !track[Y+1][X] && board[Y+1][X] == aryWord[depth]){
            if(backtrack(board, aryWord, track, X, Y+1, depth+1)) return true;
        }
        //go left
        if(X-1 >= 0 && !track[Y][X-1] && board[Y][X-1] == aryWord[depth]){
            if(backtrack(board, aryWord, track, X-1, Y, depth+1)) return true;
        }
        //go up
        if(Y-1 >= 0 && !track[Y-1][X] && board[Y-1][X] == aryWord[depth]){
            if(backtrack(board, aryWord, track, X, Y-1, depth+1)) return true;
        }
        track[Y][X] = false;

        return false;
    }

}
