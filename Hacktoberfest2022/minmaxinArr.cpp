#include<iostream>
using namespace std;

int main(){
    int n=6;
    int arr[n] = {5,8,9,3,6,7};
    int maxx = INT32_MIN;
    int minn = INT32_MAX;

    for(int i=0;i<n;i++){
        maxx = max(arr[i],maxx);
        minn = min(arr[i],minn);
    }s
    cout<<maxx<<" "<<minn;

    return 0;
}

// another approach is by divind the array in 2 half and then comparing both half


