class MyStack {
    
    //declaring two queues
    Queue<Integer> q1;
      // Queue<Integer> q2=new LinkedList<>();

    public MyStack() {
        q1=new LinkedList<Integer>();
    }
    
    public void push(int x) {
        // check whether
        q1.add(x);
        int siz=q1.size();
        while(siz>1){
            q1.add(q1.poll());
            siz--;
        }
        
    }
    
    public int pop() {
       return q1.poll();
    }
    
    public int top() {
        // while(q1.size()>1){
        //     q2.add(q1.poll());
        // }
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
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