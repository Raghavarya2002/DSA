#include<iostream>
#include<stack>
using namespace std;

void solve(stack<int>&inputStack,int cnt ,int N){
    if(cnt==N/2){
        inputStack.pop();
        return;
    }
    int num=inputStack.top();
    inputStack.pop();
    
    solve(inputStack,cnt+1,N);
    inputStack.push(num);
}

void deleteMiddle(stack<int>&inputStack, int N){
	
   // Write your code here
     int cnt=0;
      solve(inputStack,cnt,N);
   
}
int main(){
	//Create a stack
   stack<int> s;
   s.push(1);
   s.push(3);
   s.push(5);
   s.push(7);
   s.push(9);
   int stackSize=s.size();
   deleteMiddle(s,stackSize);
   	cout<<s.top()<<" ";
   	s.pop();
   	cout<<s.top()<<" ";
   	s.pop();
   	cout<<s.top()<<" ";
   	s.pop();
   	cout<<s.top()<<" ";
   	s.pop();
   	cout<<endl;
   	cout<<"Middle element 5 got deleted"<<endl;
	return 0;
};