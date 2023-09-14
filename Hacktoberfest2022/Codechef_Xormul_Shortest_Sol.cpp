//Shortest Solution to codechef question XORMUL, LINK- "https://www.codechef.com/problems/XORMUL?tab=statement"


#include<iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
	int T;
	cin >> T;
	while(T--){
	    int n,a,b;
	    cin >> n >> a >> b;
	    int c=0;
	    bool ok=true;
	    for(int i=n-1;i>=0;i--){
	        if(((1<<i)&a)==((1<<i)&b)){
	            if(((1<<i)&a)==0)c+=(1<<i);
	        }
	        else if(ok){
	            if(((1<<i)&b))c+=(1<<i);
	            ok=false;
	        }
	        else{
	            if(((1<<i)&a))c+=(1<<i);
	        }
	    }
	    cout << c << endl;
	}
	return 0;
}
