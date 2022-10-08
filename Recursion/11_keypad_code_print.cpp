#include <bits/stdc++.h>
using namespace std;

string combination[10] = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

void printkey(int num, string s)
{
    if(num==0)
    {
        cout<<s<<endl;
        return ;
    }

    int x=num%10;

    for (int  i = 0; combination[x][i]!='\0'; i++)
    {
        printkey(num/10,combination[x][i] +s);
    }
    

}

void printKeypad(int num)
{
    string s="";
    printkey(num,s);
}


int main()
{
    int num;
    cin >> num;
    
    printKeypad(num);

    return 0;
}