class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int ans = 0;
        while(l<r){
            if(heights[l] < heights[r]){
                ans = Math.max(ans, (r-l)*heights[l]);
                l++;
            }
            else{
                ans = Math.max(ans,(r-l)*heights[r]);
                r--;
            }
        }
        return ans;
    }
}
