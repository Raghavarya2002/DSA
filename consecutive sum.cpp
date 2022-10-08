// link-https://codeforces.com/contest/1733/problem/A
// youtube link-https://www.youtube.com/watch?v=vLkhLgUMjQA

// A. Consecutive Sum

// You are given an array a with n integers. You can perform the following operation at most k times:

// Choose two indices i and j, in which imodk=jmodk (1≤i<j≤n).
// Swap ai and aj.
// After performing all operations, you have to select k consecutive elements, and the sum of the k elements becomes your score. Find the maximum score you can get.

// Here xmody denotes the remainder from dividing x by y.

// Input
// The first line contains one integer t (1≤t≤600) — the number of test cases.

// Each test case consists of two lines.

// The first line of each test case contains two integers n and k (1≤k≤n≤100) — the length of the array and the number in the statement above.

// The second line of each test case contains n integers a1,a2,…,an (0≤ai≤109)  — the array itself.

// Output
// For each test case, print the maximum score you can get, one per line.

// Example
// inputCopy
// 5
// 3 2
// 5 6 0
// 1 1
// 7
// 5 3
// 7 0 4 0 4
// 4 2
// 2 7 3 4
// 3 3
// 1000000000 1000000000 999999997
// outputCopy
// 11
// 7
// 15
// 10
// 2999999997











// Approach
// from three buckets 
// [i%k] ki jagah elements enter kralo
// the bus top  ka element nikalo har bucket
// iske liye hum priority_queue krnege



#include<bits/stdc++.h>


using namespace std;
typedef long long ll;

int main(){
    long long t;
    cin>>t;
    
    while(t--){
        int n,k;
        cin>>n>>k;
       vector<priority_queue<ll>> v(k);
       for(int i=0;i<n;i++){
        ll p;
        cin>>p;
        v[i%k].push(p);

       }
       ll res=0;
       for(auto it:v){
            res+=it.top();
       }
       cout<<res<<endl;;
    }

    
   
    
	return 0;
}