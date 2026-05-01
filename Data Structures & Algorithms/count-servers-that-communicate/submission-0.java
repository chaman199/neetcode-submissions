class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++){
            int countone = 0;
            for(int j=0;j<n;j++){
                countone += grid[i][j];
            }
            if(countone <= 1)
                continue;
            count += countone;
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    grid[i][j]=-1;
            }
        }

        for(int j=0;j<n;j++){
            int countone = 0;
            int unmarked = 0;
            for(int i=0;i<m;i++){
                countone += Math.abs(grid[i][j]);
                if(grid[i][j]>0) 
                    unmarked++;
                else if(grid[i][j]<0)
                    grid[i][j]=1;
            }
            if(countone>=2)
                count += unmarked;
        }
        return count;
    }
}