class MyStack {
    // Deque<Integer> dq=new ArrayDeque<Integer>();
    Queue<Integer> q=new LinkedList<Integer>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        // dq.addLast(x);
        q.add(x);
        for(int i=0;i<q.size()-1;i++)
            q.add(q.remove());
    }
    
    public int pop() {
        // return dq.pollLast();
        return q.remove();
    }
    
    public int top() {
        // return dq.peekLast();
        return q.peek();
    }
    
    public boolean empty() {
        // System.out.println(dq);
        // return dq.size()==0;
        return q.isEmpty();
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