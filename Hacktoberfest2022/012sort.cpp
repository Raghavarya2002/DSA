#include<iostream>
using namespace std;

class Solution
{
    public:
    void sort012(int a[], int n)
    {
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                c0++;
            }
            else if(a[i]==1){
                c1++;
            }
            else{
                c2++;
            }
        }
        int i=0;
        while(c0--){
            a[i++] =0;
        }
        while(c1--){
            a[i++] =1;
        }
        while(c2--){
            a[i++] =2;
        }
        
        
       for(int i=0;i<n;i++){
        cout<<a[i];
       } 
    }
    
};

int main(){
    int n;
    cin>>n;
    int arr[n];
    Solution s;
    s.sort012(arr,n);
}