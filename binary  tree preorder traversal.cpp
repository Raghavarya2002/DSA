// link=https://leetcode.com/problems/binary-tree-preorder-traversal/
// striver link=https://www.youtube.com/watch?v=RlUu72JrOCQ&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=6


// approach
// simple traverse ROOT LEFT RIGHT as it is preorder


class Solution {
public:
    void fun(TreeNode* root,vector<int>& v){
        v.push_back(root->val);
        fun(root->left,v);
        fun(root->right,v);

    }
    
    
    vector<int> preorderTraversal(TreeNode* root) {
    vector<int> v;
    fun(TreeNode* root,v)  
    return v;  





    }
};