#include <bits/stdc++.h>
using namespace std;

string combination[10] = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

int keypad(int num, string output[])
{
    if (num == 0)
    {
        output[0] = "";
        return 1;
    }
    int x = num, sum = 0;

    while (x > 0)
    {
        x /= 10;
        sum++;
    }
    int b = (pow(10, sum - 1));
    int count = keypad(num % b, output);
    string output1[count];

    for (int i = 0; i < count; i++)
    {
        output1[i] = output[i];
    }

    int digit = num / b;
    int i = 0, j;
    for (; combination[digit][i] != '\0'; i++)
    {
        for (j = 0; j < count; j++)
        {
            output[count * i + j] = combination[digit][i] + output1[j];
        }
    }

    return i * j;
}

int main()
{
    int num;
    cin >> num;

    string output[10000];
    int count = keypad(num, output);
    for (int i = 0; i < count && i < 10000; i++)
    {
        cout << output[i] << endl;
    }
    return 0;
}