#include <bits/stdc++.h>
using namespace std;

void replace(char s[])
{
    if (s[0] == '\0')
    {
        return;
    }

    if (s[0] == 'p' && s[1] == 'i')
    {
        int i;
        for (i = 0; s[i] != '\0'; i++)
        {
        }

        for (; i > 1; i--)
        {
            s[i + 2] = s[i];
        }
        s[0] = '3';
        s[1] = '.';
        s[2] = '1';
        s[3] = '4';
    }
    replace(s + 1);
}

int main()
{

    char s[1000];
    cin.getline(s, 10000);
    replace(s);
    cout << s << endl;
    return 0;
}