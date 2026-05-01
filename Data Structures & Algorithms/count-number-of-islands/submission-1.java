class Solution {
    public int numIslands(char[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int numberOfIslands = 0;
        boolean[][] visited = new boolean[ROWS][COLS];
        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    makeIslandVisited(grid,visited,i,j,ROWS,COLS);
                    numberOfIslands++;
                }
            }
        }
        return numberOfIslands;
    }
    void makeIslandVisited(char[][] grid, boolean[][] visited, int i, int j, int ROWS, int COLS){
        if(i<0 || j<0 || i>=ROWS || j>=COLS || grid[i][j]=='0' || visited[i][j])
            return ;
        visited[i][j] = true;
        makeIslandVisited(grid,visited,i+1,j,ROWS,COLS);
        makeIslandVisited(grid,visited,i,j+1,ROWS,COLS);
        makeIslandVisited(grid,visited,i-1,j,ROWS,COLS);
        makeIslandVisited(grid,visited,i,j-1,ROWS,COLS);
    }
}
