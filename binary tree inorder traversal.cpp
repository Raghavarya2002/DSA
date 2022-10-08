// link- https://leetcode.com/problems/binary-tree-inorder-traversal/
// striver link-https://www.youtube.com/watch?v=Z_NEgBgbRVI&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=7



class Solution {
public:
    void fun(TreeNode* root,vector<int>& v){
        if(root==NULL)
            return;
        v.push_back(root->val);
        fun(root->left,v);
        fun(root->right,v);

    }
    
    
    vector<int> preorderTraversal(TreeNode* root) {
    vector<int> v;
    fun(root,v);  
    return v;  





    }
};