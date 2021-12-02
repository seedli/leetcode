package seed.leetcode.demo.A001to100;

/**
 * Created by User on 2017/2/7.
 */
public class A036_ValidSudoku {

    public static void main(String[] args){
        char[][] board = new char[][]{
                {'.','.','.','.','5','.','.','1','.'},
                {'.','4','.','3','.','.','.','.','.'},
                {'.','.','.','.','.','3','.','.','1'},
                {'8','.','.','.','.','.','.','2','.'},
                {'.','.','2','.','7','.','.','.','.'},
                {'.','1','5','.','.','.','.','.','.'},
                {'.','.','.','.','.','2','.','.','.'},
                {'.','2','.','9','.','.','.','.','.'},
                {'.','.','4','.','.','.','.','.','.'}
        };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {

        //check each cells in the raw and column
        for(int x=0; x<board.length; x++){
            for(int y=0; y<board.length; y++){
                if(board[x][y] == '.') continue;
                if( ! isValidCell(x,y,board,board[x][y])){
                    return false;
                }
            }
        }

        //check each nine 3x3 grids
        if( ! check3x3grid(""+board[0][0]+board[0][1]+board[0][2]+board[1][0]+board[1][1]+board[1][2]+board[2][0]+board[2][1]+board[2][2])) return false;
        if( ! check3x3grid(""+board[0][3]+board[0][4]+board[0][5]+board[1][3]+board[1][4]+board[1][5]+board[2][3]+board[2][4]+board[2][5])) return false;
        if( ! check3x3grid(""+board[0][6]+board[0][7]+board[0][8]+board[1][6]+board[1][7]+board[1][8]+board[2][6]+board[2][7]+board[2][8])) return false;
        if( ! check3x3grid(""+board[3][0]+board[3][1]+board[3][2]+board[4][0]+board[4][1]+board[4][2]+board[5][0]+board[5][1]+board[5][2])) return false;
        if( ! check3x3grid(""+board[3][3]+board[3][4]+board[3][5]+board[4][3]+board[4][4]+board[4][5]+board[5][3]+board[5][4]+board[5][5])) return false;
        if( ! check3x3grid(""+board[3][6]+board[3][7]+board[3][8]+board[4][6]+board[4][7]+board[4][8]+board[5][6]+board[5][7]+board[5][8])) return false;
        if( ! check3x3grid(""+board[6][0]+board[6][1]+board[6][2]+board[7][0]+board[7][1]+board[7][2]+board[8][0]+board[8][1]+board[8][2])) return false;
        if( ! check3x3grid(""+board[6][3]+board[6][4]+board[6][5]+board[7][3]+board[7][4]+board[7][5]+board[8][3]+board[8][4]+board[8][5])) return false;
        if( ! check3x3grid(""+board[6][6]+board[6][7]+board[6][8]+board[7][6]+board[7][7]+board[7][8]+board[8][6]+board[8][7]+board[8][8])) return false;

        return true;
    }

    public static boolean check3x3grid(String str3x3){

        if(str3x3.length() - str3x3.replace("1", "").length() > 1) return false;
        if(str3x3.length() - str3x3.replace("2", "").length() > 1) return false;
        if(str3x3.length() - str3x3.replace("3", "").length() > 1) return false;
        if(str3x3.length() - str3x3.replace("4", "").length() > 1) return false;
        if(str3x3.length() - str3x3.replace("5", "").length() > 1) return false;
        if(str3x3.length() - str3x3.replace("6", "").length() > 1) return false;
        if(str3x3.length() - str3x3.replace("7", "").length() > 1) return false;
        if(str3x3.length() - str3x3.replace("8", "").length() > 1) return false;
        if(str3x3.length() - str3x3.replace("9", "").length() > 1) return false;

        return true;
    }

    public static boolean isValidCell(int x, int y, char[][] board, char cell){

        for(int i=0; i<board.length; i++){
            char value = board[x][i];
            if(i==y || value == '.'){
                continue;
            }else if(value == cell){
                return false;
            }
        }

        for(int i=0; i<board.length; i++){
            char value = board[i][y];
            if(i==x || value == '.'){
                continue;
            }else if(value == cell){
                return false;
            }
        }

        return true;
    }
}
