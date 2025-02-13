class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0; int right = m-1;
        int left = 0; int down = n-1;
        while(top <= down && left <= right){
            // left to right
            for(int i=left;i<=right;i++)
            l.add(matrix[top][i]);
            top++;

            // top to bottom
            for(int i=top;i<=down;i++)
            l.add(matrix[i][right]);
            right--;
            if(top<=down){
            // right to left
            for(int i=right;i>=left;i--)
            l.add(matrix[down][i]);
            down--;
            }

            // down to top
            if(left <= right){
            for(int i=down;i>=top;i--)
            l.add(matrix[i][left]);
            left++;
            }
            
        }
        return l;
    }
}