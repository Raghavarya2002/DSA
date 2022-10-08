int height(BinaryTreeNode<int> *root){
    if(root == NULL)
        return 0;
    return 1 + max(height(root -> left), height(root -> right));
}

bool isBalanced(BinaryTreeNode<int> *root) {
    if(root == NULL)
        return true;
    int lh = height(root -> left);
    int rh = height(root -> right);
    
    if(lh - rh > 1 && rh - lh > 1)
        return false;
    if( abs(lh - rh) <= 1 && isBalanced(root -> left) && isBalanced(root -> right))
        return true;
    return false;
    
}
