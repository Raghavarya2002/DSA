#include<iostream>
using namespace std;

void merge(int arr[], int l, int mid, int h){

    int n1=mid-l+1;
    int n2=h-mid;

    int a[n1];
    int b[n2];

    for(int i=0; i<n1; i++){
        a[i]=arr[l+i];

    }

    for(int i=0; i<n2; i++){
        b[i]=arr[mid+1+i];
        
    }

    int i=0;
    int j=0;
    int k=l;

    while(i<n1 && j<n2){

        if(a[i]<b[j]){
           arr[k]=a[i];
            i++; 
            k++;
        }
        else{
            arr[k]=b[j];
             j++;
             k++;

        }

    }

    while(i<n1){
         arr[k]=a[i];
            i++; 
            k++;
    }
    while(j<n2){
       arr[k]=b[j];
             j++;
             k++;

    }
}

void mergesort(int arr[], int l, int h){

    if(l<h){
        int mid=(l+h)/2;

        mergesort(arr, l, mid);
        mergesort(arr,mid+1, h);

        merge(arr,l,mid,h);
    }

   
}

int main(){

int arr[]={5,2,3,1,8,7,9};
int l=0;
int h=6;
mergesort(arr, l,h);
 for(int i=l; i<=h; i++){
        cout<<arr[i]<<" ";
    }
 return 0;
}
