class MyQueue {
    Stack<Integer> original=new Stack<>();
    Stack<Integer> dummy = new Stack<>();
    public MyQueue() {
        
        
    }
    
    public void push(int x) {
        original.push(x);
    }
    
    public int pop() {
        peek();
       return dummy.pop();
    }
    
    public int peek() {
        //when it asks for pop or peek we check first whether out dummy is empty or not to maintain reverse order if yes then pop out all elements of original and if not then keep pushing in original stack.
        if(dummy.empty()){
            while(!original.empty()){
            dummy.push(original.pop());
            }
        }
        return dummy.peek();
    }
    
    public boolean empty() {
        return original.empty() && dummy.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */