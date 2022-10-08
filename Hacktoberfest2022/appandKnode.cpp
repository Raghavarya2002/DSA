#include<iostream>
using namespace std;

class node{
    public:
    int data;
    node*next;
    node(int val){
        data=val;
        next=NULL;
    }
};

void insertatTail(node*&head,int val){
    node*n=new node(val);
    if(head==NULL){
        head=n;
        return ;
    }
    node*temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=n;
}

int length(node*head){
    int l=0;
    node*temp=head;
    while(temp!=NULL){
        l++;
        temp=temp->next;
        
    }
    return l;
}

node* kappend(node*&head,int k){
    node* newhead;
    node* newtail;
    node* tail=head;
    int l=length(head);
    k=k%l;
    int count =1;
    while(tail->next!=NULL){
        if(count==l-k){
            newtail=tail;
        }
        if(count==l-k+1){
            newhead=tail;
        }
        tail=tail->next;
        count++;
    }
    newtail->next=NULL;
    tail->next=head;
    return newhead;
}

void display(node* head){
    node*temp=head;
    while(temp!=NULL){
        cout<<temp->data<<"->";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}

int main(){
    node*head=NULL;
    insertatTail(head,3);
    insertatTail(head,31);
    insertatTail(head,32);
    insertatTail(head,33);
    insertatTail(head,34);
    insertatTail(head,35);
    display(head);
    node*newhead=kappend(head,3);
    display(head);
}