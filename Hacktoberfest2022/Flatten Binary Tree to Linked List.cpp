class Solution {
public:
    void flatten(TreeNode* root) {
     if (!root) return;

    TreeNode* temp = root->right;
    root->right = root->left;
    root->left = NULL;
    TreeNode* rightTail = root;

    while (rightTail->right) {
      rightTail = rightTail->right;
    }

    rightTail->right = temp;
    flatten(root->right);   
    }
};
