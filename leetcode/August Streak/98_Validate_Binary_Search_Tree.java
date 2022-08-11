class Solution {
    public boolean isValidBST(TreeNode root) {
       
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    public boolean isValidBST(TreeNode root,long minval,long maxval){
        if(root == null) return true;
        if(root.val >= maxval || root.val <= minval) return false;
        
        return isValidBST(root.left,minval,root.val) && isValidBST(root.right,root.val,maxval);
    }
}
