#include<bits/stdc++.h>
using namespace std;
#define ll long long
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    ll t, n, k, b, s, i, ans;
    
    cin>>t;
    
    for(;t--;)
    {
        cin>>n>>k>>b>>s;
        
        if((k*b+n*(k-1))<s || s<k*b){
            cout<<"-1\n";
            continue;
        }
        ll a[n];
        
        a[0]=b*k;
        s=s-b*k;
        
        if(s>0){
            a[0]=a[0]+min(k-1, s);
            s=s-min(k-1, s);
        }
        
        
        for(i=1; i<n; i++)
        {
            if(s>0){
                a[i]=min(k-1, s);
                s=s-a[i];
            }else{
                a[i]=0;
            }
        }
        
        
        
        
            for(i=0; i<n; i++){
                cout<<a[i]<<" ";
            }
        cout<<"\n";
    }
}