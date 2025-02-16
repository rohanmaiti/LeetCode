class Solution {
    public boolean isSafe(char [][]matrix, int row, int col, int n){
        // row wise
        for(int i=0;i<n;i++)
        if(matrix[row][i] == 'Q') return false;
        // col wise
        for(int i=0;i<n;i++)
        if(matrix[i][col] == 'Q') return false;

      
        // left up cross
        int i=col-1;
        int j=row-1;
        while(i>=0 && j>=0){
            if(matrix[j][i] == 'Q')
            return false;
            i--;
            j--;
        }

        //left down cross
        i = col+1;
        j = row+1;
          while(i<n && j<n){
            if(matrix[j][i] == 'Q')
            return false;
            i++;
            j++;
        }

        // right up cross
        // i-- , j++
        i = col+1;
        j = row-1;
          while(i<n && j>=0){
            if(matrix[j][i] == 'Q')
            return false;
            i++;
            j--;
        }

        // right down cross
        // i++ , j--
        i = col-1;
        j = row+1;
          while(i>=0 && j<n){
            if(matrix[j][i] == 'Q')
            return false;
            i--;
            j++;
        }

        return true;


    }
    public void sol(char [][]matrix,int n, int row, List<List<String>> result){
        if(row == n){
            List<String> l = new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<n;j++){
                    sb.append(matrix[i][j]);
                }
                l.add(sb.toString()); 
            }
            result.add(l);
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe( matrix, row, i, n)){
                matrix[row][i] = 'Q';
                sol(matrix, n, row+1, result);
                matrix[row][i] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char [][]matrix = new char[n][n];
        for(int i=0;i<n;i++)
        Arrays.fill(matrix[i],'.');

        sol(matrix, n, 0, result);
        return result;
    }
}