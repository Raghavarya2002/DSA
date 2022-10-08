// A. Burenka Plays with Fractions
// time limit per test1 second
// memory limit per test256 megabytes
// inputstandard input
// outputstandard output
// Burenka came to kindergarden. This kindergarten is quite strange, so each kid there receives two fractions (ab and cd) with integer numerators and denominators. Then children are commanded to play with their fractions.

// Burenka is a clever kid, so she noticed that when she claps once, she can multiply numerator or denominator of one of her two fractions by any integer of her choice (but she can't multiply denominators by 0). Now she wants know the minimal number of claps to make her fractions equal (by value). Please help her and find the required number of claps!
inputCopy
8
2 1 1 1
6 3 2 1
1 2 2 3
0 1 0 100
0 1 228 179
100 3 25 6
999999999 300000000 666666666 100000000
33 15 0 84
outputCopy
1
0
2
0
1
1
1
1
// approach make ad=bc bye using three simple conditions

#include<bits/stdc++.h>
using namespace std;
int main(){
    long long t;
    cin>>t;
    long long a,b,c,d;
    for(int i=0;i<t;i++){
        cin>>a>>b>>c>>d;
        long long t1=a*d;
        long long t2=b*c;
        if(t1==t2)
           cout<<0<<endl;
        else if(t1==0 || t2==0)
           cout<<1<<endl;
        else if(t1%t2==0 || t2%t1==0)
           cout<<1<<endl;
        else
           cout<<2<<endl;
    }
    return 0;
}