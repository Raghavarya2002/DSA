#include <bits/stdc++.h>
using namespace std;

int power(int x, int n)
{
    if(n==0)
    {
        return 1;
    }
    n--;
    return x*power(x,n);
}

int main()
{
    int x, n;
    cin >> x >> n;

    cout << power(x, n) << endl;
    return 0;
}