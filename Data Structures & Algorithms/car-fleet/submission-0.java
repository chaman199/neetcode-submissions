class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] p = new int[n][2];
        for(int i=0;i<n;i++){
            p[i][0] = position[i];
            p[i][1] = speed[i];
        }
        Stack<Double> st = new Stack<>();
        Arrays.sort(p,(a,b)-> Integer.compare(a[0],b[0]));
        for(int[] arr: p){
            double time = (double)(target - arr[0])/arr[1];
            // System.out.println("position:"+arr[0]+" speed:"+arr[1]+" time:"+time);
            while(!st.isEmpty() && st.peek()<=time){
                st.pop();
            }
            st.push(time);
        }
        return st.size();
    }
}
