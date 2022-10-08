#include <bits/stdc++.h>
using namespace std;

double geometricSum(int k)
{
    if (k == 0)
    {
        return 1;
    }
    else
    {
        float y = pow(2, k);
        float x = 1 / y;
        return x + geometricSum(k - 1);
    }
}

int main()
{
    int k;
    cin >> k;
    cout << fixed << setprecision(5);
    cout << geometricSum(k) << endl;
}