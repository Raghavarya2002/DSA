/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) 
    {
        vector<vector<int>>v;
        if(!root) return v;
        queue<TreeNode * > q;
        q.push(root);
        while(!q.empty())
        {
            int s = q.size();
            vector<int>h;
            for(int i = 0; i<s ; i++)
            {
                TreeNode * k = q.front();
                h.push_back(k->val);
                if(k->left) q.push(k->left);
                if(k->right) q.push(k->right);
                q.pop();
            }
            v.push_back(h);
        }
        return v;
    }
};