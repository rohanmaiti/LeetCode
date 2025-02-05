class Solution {
    public static boolean sol(int i, int j, char [][] board, String word, int index){
        // invalid conditions 
        if(i<0 || i>=board.length || j<0 || j>= board[0].length || index >= word.length() || board[i][j] != word.charAt(index)) return false;
        if(index == word.length()-1)
        return true;
        char c = board[i][j];
        board[i][j] = '#';
        
        boolean right =  sol(i,j+1,board,word, index+1);
        boolean down =  sol(i+1,j,board,word, index+1);
        boolean left =  sol(i,j-1,board,word, index+1);
        boolean top =  sol(i-1,j,board,word, index+1);

        board[i][j] = c;
        return right || down || left || top;

    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j] == word.charAt(0)){
                    boolean ans = sol(i,j,board,word, 0);
                    if(ans) return true;
                } 
            }
        }
        return false;
    }
}