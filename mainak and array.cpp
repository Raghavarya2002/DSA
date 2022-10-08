// A. Mainak and Array
// time limit per test1 second
// memory limit per test256 megabytes
// inputstandard input
// outputstandard output
// Mainak has an array a1,a2,…,an of n positive integers. He will do the following operation to this array exactly once:

// Pick a subsegment of this array and cyclically rotate it by any amount.
// Formally, he can do the following exactly once:
// Pick two integers l and r, such that 1≤l≤r≤n, and any positive integer k.
// Repeat this k times: set al=al+1,al+1=al+2,…,ar−1=ar,ar=al (all changes happen at the same time).
// Mainak wants to maximize the value of (an−a1) after exactly one such operation. Determine the maximum value of (an−a1) that he can obtain.

// Input
// Each test contains multiple test cases. The first line contains a single integer t (1≤t≤50) — the number of test cases. Description of the test cases follows.

// The first line of each test case contains a single integer n (1≤n≤2000).

// The second line of each test case contains n integers a1,a2,…,an (1≤ai≤999).

// It is guaranteed that the sum of n over all test cases does not exceed 2000.

// Output
// For each test case, output a single integer — the maximum value of (an−a1) that Mainak can obtain by doing the operation exactly once.

// Example
// inputCopy
// 5
// 6
// 1 3 9 11 5 7
// 1
// 20
// 3
// 9 99 999
// 4
// 2 1 8 1
// 3
// 2 1 5
// outputCopy
// 10
// 0
// 990
// 7
// 4

// bdhiya approach h
// 3 segments mein approach h
// 1-phle element ko roko
// 2-last element ko roko
// 3-(i+1)%n isiliye kiya h kynki last wala apne aap shift ho jaaye aage kynki circular ka ques h na
//  space o(n)
//  time o(n)



#include<bits/stdc++.h>
using namespace std;
 
int main()
{   int t;
    cin>>t;
 
   while(t--){
    int n;
    cin>>n;
    vector<int> v;
    for(int i=0;i<n;i++){
        int m;
        cin>>m;
        v.push_back(m);
    }
    int maxi=0,y=v.size();
    for(int i=0;i<v.size();i++){
        maxi=max(maxi,v[i]-v[0]);
        maxi=max(maxi,v[n-1]-v[i]);
        maxi=max(maxi,v[i]-v[(i+1)%y]);
 
 
    }
    cout<<maxi<<endl;
   } 
 
 
return 0;
}