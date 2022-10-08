// array recovery

// link=https://codeforces.com/contest/1739/problem/B

// For an array of non-negative integers a of size n, we construct another array d as follows: d1=a1, di=|ai−ai−1| for 2≤i≤n.

// Your task is to restore the array a from a given array d, or to report that there are multiple possible arrays.

// Input
// The first line contains a single integer t (1≤t≤100) — the number of test cases.

// The first line of each test case contains one integer n (1≤n≤100) — the size of the arrays a and d.

// The second line contains n integers d1,d2,…,dn (0≤di≤100) — the elements of the array d.

// It can be shown that there always exists at least one suitable array a under these constraints.

// Output
// For each test case, print the elements of the array a, if there is only one possible array a. Otherwise, print −1.

// Example
// inputCopy
// 3
// 4
// 1 0 2 5
// 3
// 2 6 3
// 5
// 0 0 0 0 0
// outputCopy
// 1 1 3 8
// -1
// 0 0 0 0 0

#include<bits/stdc++.h>
using namespace std;
int main(){
  int t;
  cin>>t;
  while(t--){
    int n;
    cin>>n;
    vector<int> d(n);
    vector<int> a(n);
   for(auto &i:d)
     {
      cin>>i;
     }
     a[0]=d[0];
    int s=a[0],c=0,m;
     for(int i=1;i<n;i++){
      
      a[i]=d[i]+s;
      m=s-d[i];
      if(m!=a[i] && m>0)
        c++;
      s=a[i];
     }
if(c>0){
  cout<<-1<<endl;
}
else{
     for(auto it:a)
        cout<<it<<" ";
     cout<<endl;
}

 
  }
	
	return 0;
}
