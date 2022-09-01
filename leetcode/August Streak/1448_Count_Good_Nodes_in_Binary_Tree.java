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
    public int goodNodes(TreeNode root) {
        return needHelp(root, root.val);
    }
    
    public int needHelp(TreeNode node, int currentMax){
        if (node == null){
            return 0;
        }
        int count = 0;
        if (node.val >= currentMax){
            count = 1;
            currentMax = node.val;
        }
        
        return count + needHelp(node.left, currentMax) + needHelp(node.right, currentMax);
    }
}
