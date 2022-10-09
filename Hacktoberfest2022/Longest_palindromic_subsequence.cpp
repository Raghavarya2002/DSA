#include<bits/stdc++.h>
using namespace std;

#define ll long long
#define ull unsigned ll
#define endl "\n"
#define F first
#define S second
#define PB push_back
#define MP make_pair
#define all(a) a.begin(),a.end()
#define allr(a) a.rbegin(),a.rend()

typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<ll> vll;
typedef pair<int,int> pii;
typedef pair<ll,ll> pll;
typedef vector<pii> vpii;
typedef vector<pll> vpll;

int LCS(string text1, string text2) {
    int sizea=text1.size();
    int sizeb=text2.size();
    vi prev(sizeb+1,0);
    vi curr(sizeb+1,0);
				for(int i=1;i<=sizea;i++){
    				for(int j=1;j<=sizeb;j++){
    								if(text1[i-1]==text2[j-1])curr[j]=1 +prev[j-1];
    								else curr[j]= max(prev[j],curr[j-1]);    
        }
        prev=curr;
    }
    return prev[sizeb];   
}
int longestPalindromeSubseq(string s) {
    string s1=s;
    reverse(s1.begin(),s1.end());
    return LCS(s,s1);
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        cout<<longestPalindromeSubseq(s)<<endl;
    }
    return 0;
}
