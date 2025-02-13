class Solution {
    public void setZeroes(int[][] matrix) {
        // APPROACH - 01
        // int m = matrix.length;
        // int n = matrix[0].length;
        // HashSet<Integer> rowSet = new HashSet<>();
        // HashSet<Integer> colSet = new HashSet<>();
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j] == 0){
        //             rowSet.add(i);
        //             colSet.add(j);
        //         }
        //     }
        // }
        // for(var val : rowSet){
        //     for(int i=0;i<n;i++)
        //     matrix[val][i] = 0;
        // }
        //  for(var val : colSet){
        //     for(int i=0;i<m;i++)
        //     matrix[i][val] = 0;
        // }

        // APPROACH - 02
        int m = matrix.length;
        int n = matrix[0].length;
        int row[] = new int[m];
        int col[] = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(matrix[i][j] == 0){
                  row[i] = 1;
                  col[j] = 1;
               }
            }
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(row[i] == 1 || col[j] == 1){
                 matrix[i][j] = 0;
               }
            }
        }
        return;

        

    }
  
}