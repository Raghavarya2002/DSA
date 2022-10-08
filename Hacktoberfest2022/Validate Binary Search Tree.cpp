class Solution {
public:

  bool checkBST(TreeNode *root, long long leftmax, long long rightmax){
        if(!root)
            return true;
        return root -> val > leftmax and root -> val < rightmax && checkBST(root -> left, leftmax, root -> val) && checkBST(root -> right, root -> val, rightmax);
    }
    bool isValidBST(TreeNode* root) {
        long long left = -2147483649;
        long long right = 2147483648;
        return checkBST(root, left, right);
       
        
    }
};
