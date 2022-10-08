#include<bits/stdc++.h> 
using namespace std; 
class Solution
{
public:
    int sumN(int n,int sum)
    {
        if(n==0)
        {
            cout<<sum;
            return -1;
        }
        sum+=n;
        sumN(n-1,sum);
    return sum;
    }
};
int main()
{
    {
        Solution ob;
        ob.sumN(4,0);
    }
    return 0;
}
