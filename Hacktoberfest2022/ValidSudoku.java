import java.util.*;

public class ValidSudoku{

    public static void main(String []args){
        char [][]sudoku=new char[][]{{'8','3','.','.','7','.','.','.','.'},
                                    {'6','.','.','1','9','5','.','.','.'},
                                    {'.','9','8','.','.','.','.','6','.'},
                                    {'8','.','.','.','6','.','.','.','3'},
                                    {'4','.','.','8','.','3','.','.','1'},
                                    {'7','.','.','.','2','.','.','.','6'},
                                    {'.','6','.','.','.','.','2','8','.'},
                                    {'.','.','.','4','1','9','.','.','5'},
                                    {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(sudoku));
    }

    //using bitmasking
    public static boolean isValidSudoku(char[][] board) {
        //arrays for marking numbers as visited for row,column,block
        int brow[]=new int[9];
        int bcol[]=new int[9];
        int bblock[]=new int[9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                //if empty slot is encountered continue
                if(board[i][j]=='.'){
                    continue;
                }
                int val=(int)Math.pow(2,board[i][j]-'0');
                //check if the value is already encountered in the row
                if((brow[i]&val)>0){
                    return false;
                }
                //if not encountered, mark it as encountered
                brow[i]+=val;
                //check if the value is already encountered in the column
                if((bcol[j]&val)>0){
                    return false;
                }
                //if not encountered, mark it as encountered
                bcol[j]+=val;
                int mod = (3 * (i / 3)) + (j / 3);
                //check if the value is already encountered in the block
                if((bblock[mod]&val)>0){
                    return false;
                }
                //if not encountered, mark it as encountered
                bblock[mod]+=val;
            }
        }
        return true;
    }

}