// selection sort 
#include<iostream>
using namespace std;

int main(){
    int n ;
    int arr[n];
    cout<<"enter the size of the array";
    cin>>n;
    cout<<"enter the element into the array";
    for(int i =0;i<n;i++){
        cin>>arr[i];
    }
    for(int i =0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                int temp =arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
}
