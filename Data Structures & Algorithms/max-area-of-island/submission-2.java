class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int maxArea = 0;
        boolean[][] visited = new boolean[ROWS][COLS];
        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    maxArea = Math.max(bfs(grid,visited,i,j,ROWS,COLS),maxArea);
                }
            }
        }
        return maxArea;
    }

    int bfs(int[][] grid, boolean[][] visited, int i, int j, int ROWS, int COLS){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i,j});
        visited[i][j] = true;
        int area = 0;
        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
        while(!queue.isEmpty()){
            int[] ele = queue.poll();
            area++;
            int r = ele[0];
            int c = ele[1];
            for(int k=0;k<4;k++){
                int[] dir = direction[k];
                int nextR = r + dir[0];
                int nextC = c + dir[1];
                if(nextR<0 || nextR>=ROWS || nextC<0 || nextC>=COLS || grid[nextR][nextC]==0 || visited[nextR][nextC])
                    continue;
                visited[nextR][nextC] = true;
                queue.offer(new int[]{nextR,nextC});
            }
        }
        return area;
    }
}
