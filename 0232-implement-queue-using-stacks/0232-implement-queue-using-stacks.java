class MyQueue {
    private Queue<Integer> s;
    public MyQueue() {
        s=new LinkedList<>();
    }
    
    public void push(int x) {
        s.add(x);
    }
    
    public int pop() {
        return s.poll();
    }
    
    public int peek() {
        return s.peek();
    }
    
    public boolean empty() {
        if(!s.isEmpty()){
            return false;
        }
        return true;
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