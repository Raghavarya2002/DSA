#include <bits/stdc++.h>
using namespace std;

bool palindrome(int a,int b,char input[])
{
    if(a==b)
    {
        return 1;
    }
    
    if(input[a]!=input[b])
    {
        return 0;
    }

    if(a<b+1)
    {
    return palindrome(a+1,b-1,input);
    }


    return 1;
}



bool checkPalindrome(char input[])
{
    int x=strlen(input);

    if(x==0||x==1)
    {
        return 1;
    }

    return palindrome(0,x-1,input);
} 



int main() 
{
    char input[50];
    cin >> input;

    if(checkPalindrome(input)) {
        cout << "true" << endl;
    }
    else {
        cout << "false" << endl;
    }
}