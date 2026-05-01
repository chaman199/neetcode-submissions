class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int size = 0;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.offer(x);
        size += 1;
    }
    
    public int pop() {
        for(int i=0;i<size-1;i++){
            q2.offer(q1.poll());
        }
        size -= 1;
        int lastEle = q1.poll();
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
        return lastEle;
    }
    
    public int top() {
        for(int i=0;i<size-1;i++){
            q2.offer(q1.poll());
        }
        int lastEle = q1.poll();
        q2.offer(lastEle);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
        return lastEle;
    }
    
    public boolean empty() {
        return size==0;

    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */