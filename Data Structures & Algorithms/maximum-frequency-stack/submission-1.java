class FreqStack {
    int max = 0;
    List<Stack<Integer>> list;
    Map<Integer,Integer> map;
    public FreqStack() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public void push(int val) {
        Stack<Integer> st;
        int count = map.getOrDefault(val,0)+1;
        map.put(val,count);
        if(max >= count){
            list.get(count-1).push(val);
        } 
        else{
            st = new Stack<>();
            st.push(val);
            list.add(st);
            max = count;
        }
    }
    
    public int pop() {
        int ans = list.get(max-1).pop();
        map.put(ans,map.get(ans)-1);
        if(list.get(max-1).isEmpty()){
            list.remove(max-1);
            max -= 1;
        }
        return ans;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */