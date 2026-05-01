class FreqStack {
    int max = 0;
    Map<Integer,Stack<Integer>> ms;
    Map<Integer,Integer> map;
    public FreqStack() {
        ms = new HashMap<>();
        map = new HashMap<>();
    }
    
    public void push(int val) {
        int count = map.getOrDefault(val,0)+1;
        map.put(val,count);
        if(max < count){
            max = count;
            ms.putIfAbsent(max,new Stack<>());
        } 
        ms.get(count).push(val);
    }
    
    public int pop() {
        int ans = ms.get(max).pop();
        map.put(ans,map.get(ans)-1);
        if(ms.get(max).isEmpty()){
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