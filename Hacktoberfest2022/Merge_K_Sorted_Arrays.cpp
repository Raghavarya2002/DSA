#include<iostream>
#include<queue>
#include<vector>
#define pp pair<int,pair<int,int>>
using namespace std;
int main() {
	int n,e;
	cin>>n>>e;
	vector<vector<int>> v(n,vector<int>(e));
	for(int i=0;i<n;i++)
	for(int j=0;j<e;j++)
	 cin>>v[i][j];
	priority_queue<pp,vector<pp>,greater<pp>> pq;
	vector<int> result;
	for(int i=0;i<n;i++)
	pq.push({v[i][0],{i,0}});
	while(!pq.empty())
	{
      pp k=pq.top();
	  pq.pop();
	  result.push_back(k.first);
	  int x=k.second.first;
	  int y=k.second.second;
	  if(y+1<e)
	  {
		pq.push({v[x][y+1],{x,y+1}});
	  }
	}
	for(auto x:result)
	cout<<x<<" ";
	return 0;
}