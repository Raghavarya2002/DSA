#include<bits/stdc++.h>
using namespace std;



 // } Driver Code Ends
class Solution
{
    public:
    void sort012(int a[], int n)
    {
        int l=0;
        int m=0;
        int h=n-1;
        
        while(m<=h)
        {
            switch(a[m])
            {
                case 0:
                swap(a[l],a[m]);
                l++;
                m++;
                break;
                
                case 1:
                m++;
                break;
                
                case 2:
                swap(a[m], a[h]);
                h--;
                break;
            }
        }
    }
    
};

// { Driver Code Starts.
int main() {

    int t;
    cin >> t;

    while(t--){
        int n;
        cin >>n;
        int a[n];
        for(int i=0;i<n;i++){
            cin >> a[i];
        }

        Solution ob;
        ob.sort012(a, n);

        for(int i=0;i<n;i++){
            cout << a[i]  << " ";
        }

        cout << endl;
        
        
    }
    return 0;
}