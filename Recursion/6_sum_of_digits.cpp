#include <bits/stdc++.h>
using namespace std;

int sumOfDigits(int n)
{
    if(n==0)
    {
        return 0;
    }
    else
    {
        int x=n%10;
        return x+ sumOfDigits(n/10);

    }
}

int main()
{
    int n;
    cin >> n;
    cout << sumOfDigits(n) << endl;
}