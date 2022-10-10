// // Online C++ compiler to run C++ program online
// #include <iostream>
// using namespace std;
// void merge(int arr[], int s, int e){
//     int mid = (s+e)/2;
//     int len1 = mid - s+1;
//     int len2 = e - mid;
    
//     int *first = new int[len1];
//     int *second = new int[len2];
    
    
//     for(int i = 0; i<len1; i++){
//         int main = s;
//         first[i]  = arr[main++];
//     }
    
//     int main = mid+1;
//     for(int i = 0; i<len2; i++){
//         second[i] = arr[main++];
//     }
    
//     int index1 = 0;
//     int index2 = 0;
   
    
//     while(index1 < len1 && index2 < len2){
//         if(first[index1] < second[index2]){
//             arr[main++] = first[index1++];
//         }
//         else{
//             arr[main++] = second[index2++];
//         }
//     }
//     while(index1 < len1){
//         arr[main++] = first[index1++];
//     }
//     while(index2 < len2){
//         arr[main++] = second[index2++];
//     }
//     delete [] first;
//     delete [] second;
// }

// void mergesort(int *arr, int s, int e ){
//     if(s>=e){
//         return;
//     }
//     int mid = (s+e)/2;
    
//     //sorting left part
//     mergesort(arr, s, mid);
    
//     //sorting right part
//     mergesort(arr, mid+1, e);
    
//     //merging both the part
//     merge(arr, s, e);
    
    
// }
// int main() {
//     // Write C++ code here
//     int arr[5] = {4,2,5,1,3};
//     int size = 5;
//      merge(arr, 0, size - 1);
// for(int i = 0; i<size; i++){
// cout<<arr[i]<<" ";
// }
//     cout<<endl;

//     return 0;
// }


#include <iostream>
using namespace std;
class node{
public:
int data;
node * next;

node(int data){
    this -> data = data;
    this -> next = NULL;
}
};
void insertathead(node * &head, int d){
    node * temp = new node(d);
    temp -> next = head;
    head = temp;
}

void print(node* &head){
    node * temp = head;
    while(temp != NULL){
        cout<<temp -> data<<" ";
        temp = temp -> next;
    }
    cout<<endl;
}
int main(){
node * node1 = new node(20);
cout<<node1 -> data<<endl;
cout<<node1 -> next<<endl;
cout<<"Insertion at Head :- "<<endl;
node * head = node1;
insertathead(head, 90);
print(head);
insertathead(head, 80);
print(head);
    return 0;
}