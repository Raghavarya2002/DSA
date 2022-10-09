#include <iostream>
using namespace std;
int main()
{
  int n1=1,n2=2,n3,i,n;
  cout<<"Enter a number upto which you want itreate"<<endl;
  cin>>n;
  cout<<n1<<n2;
   for(i=1;i<=n;i++)
   {
    n3=n1+n2;
    n1=n2;
    n2=n3;
    cout<<n3;
    }
}
