#include<bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node *left, *right;
    int lbit, rbit;

    Node(){
        data = 0;
        left = right = NULL;
        lbit = rbit = 0;
    }
};

struct TBT: public Node{
    Node* dummy;

    TBT(){
        dummy = new Node();
        dummy->data = 999;
        dummy->left = dummy;
        dummy->right = dummy;
        dummy->lbit = 0;
        dummy->rbit = 1;
    }
    void insert(int val);
    void inorder();
    Node* inorder_successor(Node* n);
    void preorder();
    Node* preorder_successor(Node* n);
};

void TBT::insert(int val){
    if (dummy->left==NULL && dummy->right==NULL){
        Node* root = new Node();
        root->data = val;
        root->left = dummy->left;
        root->right = dummy->right;
        root->lbit = dummy->lbit;
        root->rbit = 0;

        dummy->left = root;
        dummy->lbit = 1;
        return;
    }
    
    Node* curr = new Node;
    curr = dummy->left;
    while (true){
        if (curr->data > val){
            Node* n = new Node();
            n->data = val;
            if (curr->lbit == 0){
                n->left = curr->left;
                n->right = curr;
                n->lbit = curr->lbit;
                n->rbit = 0;

                curr->left = n;
                curr->lbit = 1;
                return;
            }
            else{
                curr = curr->left;
            }
        }

        if (curr->data < val){
            Node* n = new Node();
            n->data = val;
            if (curr->rbit == 0){
                n->right = curr->right;
                n->left = curr;
                n->rbit = curr->rbit;
                n->lbit = 0;

                curr->right = n;
                curr->rbit = 1;
                return;
            }
            else{
                curr = curr->right;
            }
        }
    }
}

void TBT::inorder(){
    Node* n;
    n = dummy->left;
    while(n->lbit == 1){
        n = n->left;
    }
    while (n!=dummy){
        cout<<n->data<<" ";
        n = inorder_successor(n);
    }
}

Node* TBT::inorder_successor(Node* n){
    if (n->rbit == 0){
        return n->right;
    }
    else{
        n = n->right;
    }
    while (n->lbit == 1){
        n = n->left;
    }
    return n;
}

void TBT::preorder(){
    Node * n;
    n = dummy->left;

    while (n!=dummy){
        cout<<n->data<<" ";
        n = preorder_successor(n);
    }
}

Node* TBT::preorder_successor(Node* n){
    if (n->lbit == 1){
        return n->left;
    }
    while (n->rbit == 0){
        n = n->right;
    }
    return n->right;
}



int main(){
    TBT t1;
    t1.insert(15);
    t1.insert(12);
    t1.insert(34);
    t1.insert(3);
    t1.insert(22);
    t1.insert(57);
    
    t1.inorder();
    cout<<"\n";
    t1.preorder();

    return 0;
}