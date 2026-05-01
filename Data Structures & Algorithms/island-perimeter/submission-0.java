class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    return f(grid,visited,i,j);
                }
            }
        }
        return 0;
    }
    int f(int[][] grid, boolean[][] visited, int i, int j){
        int rows = grid.length;
        int cols = grid[0].length;
        if(i<0 || j<0 || i>=rows || j>=cols || grid[i][j]==0){
            return 1;
        }
        if(visited[i][j])
            return 0;
        visited[i][j] = true;
        return f(grid,visited,i+1,j) + f(grid,visited,i,j+1) + f(grid,visited,i-1,j) + f(grid,visited,i,j-1);
    }
}