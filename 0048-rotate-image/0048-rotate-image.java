class Solution {
    public void rotate(int[][] matrix) {
        // APPROACH - 01
        // int n = matrix.length;
        // int ans[][] = new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         ans[j][n-1-i] =  matrix[i][j];
        //     }
        // }
        // for(int i=0;i<n;i++)
        // matrix[i] = ans[i].clone();
        // return;

        // APPROACH - 02
        int n = matrix.length;
        // step-01 transpose the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        // reverse the each row 
        for(int i=0;i<n;i++){
            int k = 0;
            int j = n-1;
            while(k<j){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = temp;
                k++;
                j--;
            }
        }
        return;
    }
}