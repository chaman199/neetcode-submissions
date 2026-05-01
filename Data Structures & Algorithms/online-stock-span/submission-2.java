class StockSpanner {
    int i=0;
    Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        if(st.isEmpty()){
            st.push(new int[]{i++,price});
            return 1;
        }
        while(!st.isEmpty() && st.peek()[1]<=price){
            st.pop();
        }
        int topIndex = st.isEmpty()?-1:st.peek()[0];
        st.push(new int[]{i,price});
        return i++ - topIndex;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */