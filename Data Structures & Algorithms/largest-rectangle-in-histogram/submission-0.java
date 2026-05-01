class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> st = new Stack<>();
        int ans = 0;
        for(int i=0;i<heights.length;i++){
            int[] top = new int[]{heights[i],i}; 
            while(!st.isEmpty() && st.peek()[0]>heights[i]){
                top = st.pop();
                ans = Math.max(ans, (i-top[1])*top[0]);
            }
            st.push(new int[]{heights[i],top[1]});
        }
        while(!st.isEmpty()){
            int[] top = st.pop();
            ans = Math.max((heights.length-top[1])*top[0],ans);
        }
        return ans;
    }
}
