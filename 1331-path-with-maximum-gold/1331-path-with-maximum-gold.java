class Solution {
    public int solution(int [][]grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>= grid[0].length || grid[i][j] == 0){
            return 0;
        }
        
        int temp = grid[i][j];
        grid[i][j] = 0;
        int right = solution(grid, i+1, j);
        int down = solution(grid,i,j+1);
        int left = solution(grid,i-1,j);
        int up = solution(grid,i,j-1);
        grid[i][j] = temp;
        int max = Math.max(Math.max(left,right), Math.max(up, down));
        return grid[i][j] + max;

    }
    public int getMaximumGold(int[][] grid) {
        int maxCoin = 0;
       
        for(int i=0;i<grid.length;i++){
            int sol = 0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] != 0){
                     sol = solution(grid, i, j);
                     maxCoin = Math.max(sol, maxCoin);
                }
                
            }
        }

        return maxCoin;
    }
}