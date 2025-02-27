class Solution {
    boolean solved = false;
    public boolean isSafe(char [][]board, int row, int col, int num){
        // check row 
        for(int i=0;i<9;i++){
            if(board[row][i]-'0' == num)
            return false;
        }
        // check col
        for(int i=0;i<9;i++){
            if(board[i][col]-'0' == num)
            return false;
        }
        // check in the grid
        int startRow = 0;
        if(row >=0 && row < 3){
            startRow = 0;
        }
        else if(row >=3 && row < 6){
            startRow = 3;
        }
        else startRow = 6;

        // int startRow = row/3 * 3;
        int startCol = col / 3 * 3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(board[i][j]-'0' == num)
                return false;
            }
        }
        return true;

    }
    public void sol(char [][]board, int row, int col){
        if(col == 9){
            col = 0;
            row = row+1;
            sol(board, row, col);
            return;
        }
        if(row == 9){
            solved = true;
            return;
        }
        if(board[row][col] == '.'){
            for(int i=1;i<=9;i++){ 
            if(isSafe(board, row, col, i)){
            board[row][col] = (char) (i+'0');
            sol(board, row, col+1);
            if(solved == true) return;
            board[row][col] = '.';
            }
            }
        }
        else {
            sol(board, row, col+1);
        }
       
        
    }
    public void solveSudoku(char[][] board) {
        solved = false;
        int row = 0;
        int col = 0;
        sol(board, row, col);
    }
}