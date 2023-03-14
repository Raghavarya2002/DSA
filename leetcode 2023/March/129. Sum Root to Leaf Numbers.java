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
    private int sum = 0;
    public int sumNumbers(TreeNode root) {
        
        sumNumberHelper(root,0);
        return sum;
    }
    
    private void sumNumberHelper(TreeNode root, int val){
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            sum += val * 10 + root.val;
            return;
        }
        
        sumNumberHelper(root.left,val * 10 + root.val);
        sumNumberHelper(root.right,val * 10 + root.val);
    }
}
