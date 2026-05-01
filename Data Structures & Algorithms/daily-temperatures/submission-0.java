class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> tempStack = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(tempStack.isEmpty()){
                tempStack.add(new int[]{i,temperatures[i]});
            }
            else {
                
                while(!tempStack.isEmpty() 
                    && tempStack.peek()[1] < temperatures[i]){
                    int[] top = tempStack.pop();
                    ans[top[0]] = i-top[0];
                }
                tempStack.add(new int[]{i,temperatures[i]});
            }
        }
        while(!tempStack.isEmpty())
        {
            int[] top = tempStack.pop();
            ans[top[0]]=0;
        }
        return ans;
    }
}
