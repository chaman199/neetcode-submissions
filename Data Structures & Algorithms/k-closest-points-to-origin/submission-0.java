class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)-> Integer.compare(a[2],b[2]));
        for(int[] point: points){
            queue.offer(new int[]{point[0],point[1],point[0]*point[0]+point[1]*point[1]});
        }
        int[][] ans = new int[k][2];
        for(int i=0;i<k;i++){
            int[] point = queue.poll();
            ans[i][0] = point[0];
            ans[i][1] = point[1];
        }
        return ans;
    }
}
