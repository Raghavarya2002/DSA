// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
int factorial(int n)
{
   int fact=1;
   for(int i=1;i<=n;i++)
   {
       fact*=i;
   }
   return fact;
}
int main() {
int n,count=0,rem=0;
cout<<"Choose between 0 to 12"<<endl<<"Enter Integer to check trailing zeroes: ";
cin>>n;
int asFactorial=factorial(n);
cout<<"Factorial of enterred number is: "<<asFactorial<<endl;
while(asFactorial%10==0)
{
    if(asFactorial>0)
    {
     rem=asFactorial%10;
     asFactorial/=10;
     count++;
    }
}
cout <<"Number of Trailing Zero :"<<count;
    return 0;
}
