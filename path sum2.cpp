// link-https://leetcode.com/problems/path-sum-ii/
// path sum 2

// approach
// just keep the sum of every root value
// traverse to the extreme left and extreme right subtree
// main this is that deleting the value before returning bcoz that value is of no use (v.pop_back())
// also if(root==NULL) return; plays an important role in backtracking when you will dry run the code


class Solution {
public:
    vector<vector<int>> ans;
        vector<int> v;
    void fun(TreeNode* root,int targetSum,int sum){
        
        if(root==NULL)
            return;
         v.push_back(root->val);
        sum+=root->val;
        
        if(root->left==NULL && root->right==NULL && (sum==targetSum)){
            ans.push_back(v);
        }
        fun(root->left,targetSum,sum) ;
        fun(root->right,targetSum,sum);
            v.pop_back();
        
           }
    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        int sum=0;
        fun(root,targetSum,sum);
        return ans;      
    }
};