class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();
        int []res = new int[temp.length];
        
        for(int i=0;i<temp.length;i++){
            
            while(!st.empty() && temp[st.peek()] < temp[i]){
                
                int prev = st.pop();
                res[prev] = i - prev;
            }
            
            st.push(i);
        }
        return res;
    }
}
