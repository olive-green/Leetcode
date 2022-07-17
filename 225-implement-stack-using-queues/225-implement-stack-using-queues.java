class MyStack {
    Deque<Integer> dq=new ArrayDeque<Integer>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        dq.addLast(x);
    }
    
    public int pop() {
        return dq.pollLast();
    }
    
    public int top() {
        return dq.peekLast();
    }
    
    public boolean empty() {
        // System.out.println(dq);
        return dq.size()==0;
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