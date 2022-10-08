#include <bits/stdc++.h>
using namespace std;

void inserted(stack<int>&s, int ele){
    if(s.size()==0){
     s.push(ele);
     return;
    }

    int temp=s.top();
    s.pop();

    inserted(s, ele);
     s.push(temp);
     return;
}

void reversestack(stack<int>&s){
    if(s.size()==1 ){
       return;
    }
    
    int x=s.top();
    s.pop();
    reversestack(s);
    
    inserted(s,x);
    return ; 
    
}

int main() {
	stack<int>s;
	s.push(1);
	s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		reversestack(s);

        while(!s.empty()){
            cout<<s.top()<<endl;
            s.pop();
        }
	return 0;
}
