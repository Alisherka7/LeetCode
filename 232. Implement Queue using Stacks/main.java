class MyQueue {
    List <Integer> data = new ArrayList <>();
    int top ;

    public MyQueue() {
        top = 0;
    }
    
    public void push(int x) {
        data.add(x);
    }
    
    public int pop() {
        return data.remove(top);
    }
    
    public int peek() {
        return data.get(top);
    }
    
    public boolean empty() {
        if(top == data.size())
        return true;
        else
        return false;
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
