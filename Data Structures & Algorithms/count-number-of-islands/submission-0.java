class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0 && grid[i][j]=='1'){
                    f(visited,grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    void f(int[][] visited, char[][] grid, int i, int j){
        int n = grid.length;
        int m = grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]=='0' || visited[i][j]==1)
            return;
        visited[i][j] = 1;
        f(visited,grid,i+1,j);
        f(visited,grid,i,j+1);
        f(visited,grid,i-1,j);
        f(visited,grid,i,j-1);
    }
}
