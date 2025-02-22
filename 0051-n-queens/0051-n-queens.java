class Solution {
    public boolean isSafe(char [][]grid, int row, int col){
        int i = row;
        // up
        while(i>=0){
            if(grid[i][col] == 'Q') return false;
            i--;
        }
        // down
        i = row;
        while(i<grid.length){
            if(grid[i][col] == 'Q') return false;
            i++;
        }
        // left
        i = col;
        while(i>=0){
             if(grid[row][i] == 'Q') return false;
            i--;
        }
        // right
        i = col;
        while(i<grid.length){
             if(grid[row][i] == 'Q') return false;
            i++;
        }
        // left up corner
        i = row;
        int j = col;
        while(i>=0 && j >=0){
            if(grid[i][j] == 'Q') return false;
            i--;
            j--;
        } 
        // right dowm corner
        i = row;
        j = col;
        while(i < grid.length && j < grid.length){
            if(grid[i][j] == 'Q') return false;
            i++;
            j++;
        } 
        // right up corner
        i = row;
        j = col;
        while(i >= 0 && j < grid.length){
            if(grid[i][j] == 'Q') return false;
            i--;
            j++;
        } 
        // left down corner
        i = row;
        j = col;
        while(i < grid.length && j >= 0){
            if(grid[i][j] == 'Q') return false;
            i++;
            j--;
        } 

        return true;

    }
    public void sol(char [][] grid, int row, List<List<String>> result){
        if(row == grid.length){
            // capture image of grid
            List<String> l = new ArrayList<>();
            for(int i=0;i<grid.length;i++){
                String s = String.valueOf(grid[i]);
                l.add(s);
            }
            result.add(new ArrayList<>(l));
            return ;
        }

        for(int i=0;i<grid.length;i++){
            if(isSafe(grid, row, i)){
                grid[row][i] = 'Q';
                sol(grid, row+1, result);
                grid[row][i] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char grid[][] = new char[n][n];
        for(int i=0;i<n;i++)
        Arrays.fill(grid[i], '.');
        List<List<String>> result = new ArrayList<>();
        sol(grid, 0, result);
        return result;
    }
}