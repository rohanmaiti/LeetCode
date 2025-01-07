class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Org> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    // push in the queue
                    q.add(new Org(i,j,0));
                }
            }
        }
        int temp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            temp[i] = grid[i].clone();;
        }
        int maxTime = 0;

        while(!q.isEmpty()){
            Org o = q.poll();
            int x = o.x;
            int y = o.y;
            int t = o.t;
            // up
            if(x-1>=0 && (grid[x-1][y] == 1 && temp[x-1][y] == 1)){
                q.add(new Org(x-1,y,t+1));
                temp[x-1][y] = 2;
            }
            // right 
             if(y+1<n && (grid[x][y+1] == 1 && temp[x][y+1] == 1)){
                q.add(new Org(x,y+1,t+1));
                temp[x][y+1] = 2;
            }
            // down
             if(x+1<m && (grid[x+1][y] == 1 && temp[x+1][y] == 1)){
                q.add(new Org(x+1,y,t+1));
                temp[x+1][y] = 2;
            }
            // left
             if(y-1>=0 && (grid[x][y-1] == 1 && temp[x][y-1] == 1)){
                q.add(new Org(x,y-1,t+1));
                temp[x][y-1] = 2;
            }
            maxTime = Math.max(maxTime, t);
        }

         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(temp[i][j] == 1){
                   return -1;
                }
            }
        }
        return maxTime;

    }
}

class Org{
    int x;
    int y;
    int t;
    Org(int x,int y,int t){
        this.x = x;
        this.y = y;
        this.t = t;
    }
}