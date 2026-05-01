class MinStack {
    long min;
    Stack<Long> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(0L);
            min = val;
            return;
        }
        stack.push(val-min);
        min = val < min ? val: min;
    }
    
    public void pop() {
        if(stack.isEmpty()) return;

        Long val = stack.pop();
        if(val < 0)
            min = min - val;
    }
    
    public int top() {
        Long val = stack.peek();
        if(val > 0)
            return (int) (val + min);
        return (int) min;
    }
    
    public int getMin() {
        return (int) min;
    }
}
