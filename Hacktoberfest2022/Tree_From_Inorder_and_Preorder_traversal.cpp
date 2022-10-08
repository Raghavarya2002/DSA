#include <iostream>
#include<queue>
using namespace std;
class node
{
public:    
    int data;
    node*left;
    node*right;
    node(int d)
    {
        data=d;
        left=NULL;
        right=NULL;
    }
};
node*build(int pre[],int in_order[],int s,int e)
{
      static int idx=0;
      if(s>e)
      return NULL;
     node*root=new node(pre[idx]);
     int k=pre[idx],i;
     for( i=s;i<=e;i++)
       if(k==in_order[i])
       break;
   idx++;    
   root->left=build(pre,in_order,s,i-1);
   root->right=build(pre,in_order,i+1,e);
   return root;
}
int main()
{
    int n;
    cin>>n;
    int pre[n],in_order[n];
    for(int i=0;i<n;i++)
     cin>>pre[i];
   for(int i=0;i<n;i++)
     cin>>in_order[i];  
    node*root=build(pre,in_order,0,n-1);
}
