#include<bits/stdc++.h>
using namespace std;

int multiplyNumbers(int m, int n)
{
    if(n==0||m==0)
    {
        return 0;
    }
    else
    {
        n--;
        return m+multiplyNumbers(m,n);
    }



}

int main() {
    int m, n;
    cin >> m >> n;
    cout << multiplyNumbers(m, n) << endl;
}