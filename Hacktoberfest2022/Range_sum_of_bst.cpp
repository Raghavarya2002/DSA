// Given the root node of a binary search tree and two 
// integers low and high, return the sum of values of all 
// nodes with a value in the inclusive range [low, high].

#include <bits/stdc++.h>
using namespace std;

// Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution {
public:
    void findans(TreeNode* root,int low,int high,int& sum)
    {
        if(root==NULL) return;
        
        if(root->val>=low && root->val<=high) sum+=root->val;
        
        findans(root->left,low,high,sum);
        findans(root->right,low,high,sum);
    }
    int rangeSumBST(TreeNode* root, int low, int high) {
        int sum=0;
        findans(root,low,high,sum);
        return sum;
    }
};