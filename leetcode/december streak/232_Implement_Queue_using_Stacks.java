class MyQueue {

    Stack<Integer> queue;

    public MyQueue() {
        queue = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(queue.isEmpty()){
            queue.push(x);
            return;
        }
        int pop = queue.pop();
        push(x);
        queue.push(pop);
    }

    public int pop() {
        return queue.pop();
    }
    
    public int peek() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}
