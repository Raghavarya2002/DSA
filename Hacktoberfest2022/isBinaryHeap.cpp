// To check if binary tree is a heap we need to check for 2 conditions:
// 1. if the binary tree is a complete tree or not
// 2. if the tree is complete then for the max heap check if every parent is larger than it's children

// for counting total number of nodes in the binary tree
#include <iostream>
class Node
{
public:
    int data;
    Node *left;
    Node *right;
    Node(int data)
    {
        this->data = data;
        left = NULL;
        right = NULL;
    }
};

class Solution
{
public:
    int countNodes(Node *root)
    {
        if (root == NULL)
        {
            return 0;
        }
        int count = 1 + countNodes(root->left) + countNodes(root->right);
        return count;
    }
    // to check if the tree is complete or not
    bool isCBT(Node *root, int index, int totalNodes)
    {
        if (root == NULL)
        {
            return true;
        }

        if (index >= totalNodes)
        {
            return false;
        }

        bool leftAns = isCBT(root->left, 2 * index + 1, totalNodes);
        bool rightAns = isCBT(root->right, 2 * index + 2, totalNodes);
        if (leftAns && rightAns)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // now since the tree is complete so it's gauranteed that every node has 3 possibilities 1. it has no children 2. it has only left child 4. it has both left and right children
    bool isMaxOrder(Node *root)
    {
        // leaf node
        if (root->left == NULL && root->right == NULL)
        {
            return true;
        }
        // left child
        if (root->right == NULL)
        {
            if (root->data >= root->left->data)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            bool left = isMaxOrder(root->left);
            bool right = isMaxOrder(root->right);
            if (left && right && (root->data >= root->left->data && root->data >= root->right->data))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    bool isBinaryHeapTree(Node *root)
    {
        int totalNodes = countNodes(root);

        if (isCBT(root, 0, totalNodes) && isMaxOrder(root))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
};

// About me
// So my name is Chirag Aggarwal and currently I am learning web dev and DSA in parallel