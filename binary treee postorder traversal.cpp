// link=https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/
// striver link-https://www.youtube.com/watch?v=COQOU6klsBg&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=8


class Solution {
public:
    void fun(TreeNode* root,vector<int>& v){
        if(root==NULL)
            return;
        fun(root->left,v);
         fun(root->right,v);
         v.push_back(root->val);
        
    }
    vector<int> postorderTraversal(TreeNode* root) {
     vector<int> v;
    fun(root,v);
       return v;
    }
};