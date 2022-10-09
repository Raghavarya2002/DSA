#include<iostream>
using namespace std;

int getMin(int num[], int n) {

    int min = INT_MAX;

    for(int i = 0; i<n; i++){
        if(num[i]<min){
            min=num[i];
        }
    }
    //return min value
    return min;
}
int getMax(int num[], int n){

    int max = INT_MIN;

    for(int i = 0; i<n; i++){
        if(num[i]>max){
            max=num[i];
        }
    }
    //rwturn max value
    return max;
}

int main(){

    int size;
    cin>>size;

    int num[100];

    //taking input in array
    for(int i=0; i<size; i++){
        cin>>num[i];
    }
    cout<<"Maximum value is"<<getMax(num ,size)<<endl;
    cout<<"Minimum value is"<<getMin(num ,size)<<endl;

    return 0;
}