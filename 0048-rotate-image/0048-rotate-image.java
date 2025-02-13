class Solution {
    public void rotate(int[][] matrix) {
        // APPROACH - 01
        int n = matrix.length;
        int ans[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][n-1-i] =  matrix[i][j];
            }
        }
        for(int i=0;i<n;i++)
        matrix[i] = ans[i].clone();
        return;
    }
}