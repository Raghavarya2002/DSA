// A. Two Elevators
// Vlad went into his appartment house entrance, now he is on the 1-th floor. He was going to call the elevator to go up to his apartment.

// There are only two elevators in his house. Vlad knows for sure that:

// the first elevator is currently on the floor a (it is currently motionless),
// the second elevator is located on floor b and goes to floor c (b≠c). Please note, if b=1, then the elevator is already leaving the floor 1 and Vlad does not have time to enter it.
// If you call the first elevator, it will immediately start to go to the floor 1. If you call the second one, then first it will reach the floor c and only then it will go to the floor 1. It takes |x−y| seconds for each elevator to move from floor x to floor y.

// Vlad wants to call an elevator that will come to him faster. Help him choose such an elevator.

// Input
// The first line of the input contains the only t (1≤t≤104) — the number of test cases.

// This is followed by t lines, three integers each a, b and c (1≤a,b,c≤108, b≠c) — floor numbers described in the statement.

// Output
// Output t numbers, each of which is the answer to the corresponding test case. As an answer, output:

// 1, if it is better to call the first elevator;
// 2, if it is better to call the second one;
// 3, if it doesnt matter which elevator to call (both elevators will arrive in the same time).
// Example
// inputCopy
// 3
// 1 2 3
// 3 1 2
// 3 2 1
// outputCopy
// 1
// 3
// 2

#include <bits/stdc++.h>
using namespace std;
 #define ll long long
int main()
{ 
    int t;
cin>>t;
while(t--){
    int a,b,c;
    cin>>a>>b>>c;
   
    if(abs(b-c)+abs(c-1)>(a-1))
      cout<<1<<endl;
    else if(abs(b-c)+abs(c-1)<(a-1))
      cout<<2<<endl;
    else
      cout<<3<<endl;
    
}
    return 0;
}

