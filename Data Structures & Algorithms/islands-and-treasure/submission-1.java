class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<List<Integer>> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    queue.offer(List.of(i,j));
                }
            }
        }
        int dist = 0;
        while(!queue.isEmpty()){
            int length = queue.size();
            for(int k=0;k<length;k++){
                List<Integer> list = queue.poll();
                int i = list.get(0);
                int j = list.get(1);
                visited[i][j] = true;
                addToQueue(grid,i+1,j,visited,queue);
                addToQueue(grid,i-1,j,visited,queue);
                addToQueue(grid,i,j-1,visited,queue);
                addToQueue(grid,i,j+1,visited,queue);
                grid[i][j] = dist;
            }
            dist += 1;
        }
    }

    void addToQueue(int[][] grid, int i, int j, boolean[][] visited, Queue<List<Integer>> queue){
        int n = grid.length;
        int m = grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==-1 || visited[i][j])
            return;
        visited[i][j] = true;
        queue.offer(List.of(i,j));
    }
}
