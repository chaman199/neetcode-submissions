class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)
                    q.add(new int[]{i,j,0});
            }
        }
        int maxTime = 0;
        int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int[] ele = q.poll();
            int r = ele[0];
            int c = ele[1];
            int time = ele[2];
            for(int i=0;i<direction.length;i++){
                int nextR = r + direction[i][0];
                int nextC = c + direction[i][1];
                if(nextR <0 || nextR >= m || nextC <0 || nextC >= n || grid[nextR][nextC]!=1)
                    continue;
                grid[nextR][nextC] = 2;
                q.offer(new int[]{nextR,nextC,time+1});
                maxTime = Math.max(maxTime,time+1);

            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    return -1;
            }
        }
        return maxTime;

    }
}
