/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* findLCA(TreeNode*root,TreeNode*p,TreeNode*q)
    {
        if(root==NULL)
            return NULL;
        if(root==p||root==q)
            return root;
        TreeNode*Node1=findLCA(root->left,p,q);
        TreeNode*Node2=findLCA(root->right,p,q);
        if(Node1&&Node2)
            return root;
        return Node1?Node1:Node2;
    }
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        return findLCA(root,p,q);
    }
};