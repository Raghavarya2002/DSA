class Solution {
public:
    char c;
    stack<int> st;
    bool isValid(string s) {
        for(char c : s){
        if(c == '(' || c == '{' || c == '['){
            st.push(c);
        }
        
        else {
            if(st.empty()){
                return false;
            }
            
            if(c == ')' and st.top() != '('){
                return false;
            }
            if(c == '}' and st.top() != '{'){
                return false;
            }
            if(c == ']' and st.top() != '['){
                return false;
            }
            st.pop();
        }
    }
    return st.empty();
}
