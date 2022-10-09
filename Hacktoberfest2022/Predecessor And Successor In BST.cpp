Problem Statement
You have been given a binary search tree of integers with ‘N’ nodes. You are also given 'KEY' which represents data of a node of this tree.
  Your task is to find the predecessor and successor of the given node in the BST.
  
  Output Format :
For each test case, print two single space-separated integers representing data values of the predecessor and the successor node, respectively. If any of the two doesn’t exist, print -1 in place of it.

Print output of each test case in a separate line.
Note:
You are not required to print anything explicitly. It has already been taken care of. Just implement the function.
Constraint :
1 <= T <= 100
1 <= N <= 5000
0 <= data <= 10^6 and data != -1

Time Limit: 1 sec
Sample Input 1:
1
15 10 20 8 12 16 25 -1 -1 -1 -1 -1 -1 -1 -1
10
Sample Output 1:
8 12
  
  
  /* code in c++*/
  
  /*************************************************************
    Following is the Binary Tree node structure
    template <typename T>
    class BinaryTreeNode
    {
    public :
        T data;
        BinaryTreeNode<T> *left;
        BinaryTreeNode<T> *right;
        BinaryTreeNode(T data) {
            this -> data = data;
            left = NULL;
            right = NULL;
        }
        ~BinaryTreeNode() {
            if (left)
            {
                delete left;
            }
            if (right)
            {
                delete right;
            }
        }
    };
*************************************************************/

pair<int,int> predecessorSuccessor(BinaryTreeNode<int>* root, int key)
{
    // find key
    BinaryTreeNode<int>*temp = root;
    int pre = -1;
    int succ = -1;
    
    
    
    while(temp->data != key){
        if(temp->data > key) {
            
            succ = temp->data;
             temp = temp->left;
            
        }
        else{
          
            pre = temp->data;
            temp = temp->right;
        }
        
    }
    
    //  pred and succ
    // pred 
    BinaryTreeNode<int>*leftTree = temp->left;
    while(leftTree != NULL){
        pre = leftTree->data;
        leftTree = leftTree->right;
    }
    
    // succ
    BinaryTreeNode<int>*rightTree = temp->right;
    while(rightTree != NULL){
         succ = rightTree->data;
        rightTree = rightTree ->left;
    }
    
    pair<int,int>ans = make_pair(pre,succ);
    return ans;
    
}
