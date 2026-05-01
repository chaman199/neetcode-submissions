class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int asteroid: asteroids){
            while(!st.isEmpty() && st.peek()>0 && asteroid<0){
                int diff = st.peek() + asteroid;
                if(diff > 0){
                    asteroid = 0;
                } 
                else if(diff < 0){
                    st.pop();
                }
                else{
                    st.pop();
                    asteroid = 0;
                }
            }
            if(asteroid!=0)
                st.push(asteroid);
        } 
        int n = st.size();
        int[] ans = new int[n];
        while(!st.isEmpty()){
            ans[--n] = st.pop();
        }
        return ans;
    }
}