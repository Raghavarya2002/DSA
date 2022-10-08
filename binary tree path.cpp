link -https://leetcode.com/problems/binary-tree-paths/submissions/

// binary tree path
// approach
// just simple traverse the binary tree
// just keep in my mind that we have no right and no left so we just have to add that root->val to the string
// if above condtion doesn;t meet then just add to string ans with additon of  this ("->")




class Solution {
public:
    vector<string> v;
    void fun(TreeNode* root,string ans){
        if(root==NULL)
             return;
        if(root->left==NULL && root->right==NULL){
            ans+=to_string(root->val);
            v.push_back(ans);
            return;
            
        }
        ans+=to_string(root->val)+"->";
        fun(root->left,ans);
        fun(root->right,ans);
    }
    vector<string> binaryTreePaths(TreeNode* root) {
        fun(root,"");
        return v;
        
    }
};