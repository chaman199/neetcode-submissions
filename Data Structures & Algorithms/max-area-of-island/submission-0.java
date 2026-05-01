class Solution {
    public int maxAreaOfIsland(int[][] grid) {
     int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        int area = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0 && grid[i][j]==1){
                    area = Math.max(area,f(visited,grid,i,j));
                    
                }
            }
        }
        return area;
    }

    int f(int[][] visited, int[][] grid, int i, int j){
        int n = grid.length;
        int m = grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0 || visited[i][j]==1)
            return 0;
        visited[i][j] = 1;
        return 1+f(visited,grid,i+1,j)+f(visited,grid,i,j+1)+f(visited,grid,i-1,j)+f(visited,grid,i,j-1);
    }
}
