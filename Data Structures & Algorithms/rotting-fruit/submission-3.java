class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<List<Integer>> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.offer(List.of(i,j));
                }
            }
        }
        // System.out.println(queue);
        int dist = 0;
        while(!queue.isEmpty()){
            int length = queue.size();
            for(int k=0;k<length;k++){
                List<Integer> list = queue.poll();
                int i = list.get(0);
                int j = list.get(1);
                addToQueue(grid,i+1,j,queue);
                addToQueue(grid,i-1,j,queue);
                addToQueue(grid,i,j-1,queue);
                addToQueue(grid,i,j+1,queue);
                grid[i][j] = 2;
            }
            if(!queue.isEmpty())
                dist += 1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return dist;
    }

    void addToQueue(int[][] grid, int i, int j, Queue<List<Integer>> queue){
        int n = grid.length;
        int m = grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0 || grid[i][j]==2)
            return;
        queue.offer(List.of(i,j));
    }
}
