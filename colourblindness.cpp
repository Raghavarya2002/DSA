// B. Colourblindness
// time limit per test1 second
// memory limit per test256 megabytes
// inputstandard input
// outputstandard output
// Vasya has a grid with 2 rows and n columns. He colours each cell red, green, or blue.

// Vasya is colourblind and can't distinguish green from blue. Determine if Vasya will consider the two rows of the grid to be coloured the same.

// Input
// The input consists of multiple test cases. The first line contains an integer t (1≤t≤100) — the number of test cases. The description of the test cases follows.

// The first line of each test case contains an integer n (1≤n≤100) — the number of columns of the grid.

// The following two lines each contain a string consisting of n characters, each of which is either R, G, or B, representing a red, green, or blue cell, respectively — the description of the grid.

// Output
// For each test case, output "YES" if Vasya considers the grid's two rows to be identical, and "NO" otherwise.

// You can output the answer in any case (for example, the strings "yEs", "yes", "Yes" and "YES" will be recognized as a positive answer).

// Example
// inputCopy
// 6
// 2
// RG
// RB
// 4
// GRBG
// GBGB
// 5
// GGGGG
// BBBBB
// 7
// BBBBBBB
// RRRRRRR
// 8
// RGBRRGBR
// RGGRRBGR
// 1
// G
// G
// outputCopy
// YES
// NO
// YES
// NO
// YES
// YES

problem link-https://codeforces.com/contest/1722/problem/B

// approach this question has only three cases 
// G B G
// G G B
// just see the condition you will solve it


#include<bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	int m;
	
	while(t--){
		cin>>m;
	vector<string> vec(2);

	// just for inputting the values is  matrix
    int counting=0; 
	for(int i=0;i<2;i++){
		cin>>vec[i];
	}
	for(int i=0;i<m;i++){
		if(vec[0][i]==vec[1][i] || (vec[0][i]=='G' && vec[1][i]=='B') || (vec[0][i]=='B' && vec[1][i]=='G'))
		   counting++;
	}
	
	bool flag=(counting==m);
	if(flag)
	  cout<<"yes\n";
	else
	  cout<<"no\n";
		
}
return 0;
}
