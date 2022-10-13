class MyStack {
    Queue<Integer> qu1,qu2;
    public MyStack() {
        qu1 = new LinkedList<>();
        qu2 = new LinkedList<>();
    }
    
    public void push(int x) {
        qu1.add(x);
    }
    
    public int pop() {
        while(qu1.size() != 1)
        {
            qu2.add(qu1.poll());
        }
        int ans = qu1.poll();
        Queue<Integer> tem = qu1;
        qu1 = qu2;
        qu2 = tem;
        return ans;
    }
    
    public int top() {
        while(qu1.size() != 1)
        {
            qu2.add(qu1.poll());
        }
        int ans = qu1.poll();
        qu2.add(ans);
        Queue<Integer> tem = qu1;
        qu1 = qu2;
        qu2 = tem;
        return ans;
    }
    
    public boolean empty() {
        return qu1.isEmpty();
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