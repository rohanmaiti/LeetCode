class Solution {
    public void setZeroes(int[][] matrix) {
        // let arr for col = arr[0][j];
        // let arr for row = arr[i][0];
        int zeroPos = 1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                matrix[i][0] = 0;
                if(j != 0)
                matrix[0][j] = 0;
                else
                zeroPos = 0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
               if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            // make the row zero
            for(int i=0;i<matrix[0].length;i++)
            matrix[0][i] = 0;
        }
        if(zeroPos == 0){
            // make the col zero
             for(int i=0;i<matrix.length;i++)
            matrix[i][0] = 0;
        }

        return;
        
    }
}

//    0  1  2  0 
// 0  0  1  2  0
// 3  3  4  5  2
// 1  1  3  1  5