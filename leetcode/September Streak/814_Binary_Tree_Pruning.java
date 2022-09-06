/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(deleteNode(root)){
            return null; //if the condition is satisfied we simply remove that element
        }
        
        return root;
       
    }
    
    private boolean deleteNode(TreeNode root){
        if(root.left ==  null && root.val == 0 && root.right == null){
           return true; 
        }else{
            return false;
        }
        
    }
}
