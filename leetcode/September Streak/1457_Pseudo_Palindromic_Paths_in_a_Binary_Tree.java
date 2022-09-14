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
    
    private int result = 0;
    
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] freq = new int[10];
        
        myhelper(root,freq);
        return result;
    }
    
    private void myhelper(TreeNode root, int[] freq){
        if(root == null) return;
        
        freq[root.val]++;
        
        if(root.left == null && root.right == null) { //leaf nodes
            if(isPallindrome(freq)){
                result++;
            }
        }
        myhelper(root.left,freq);
        myhelper(root.right,freq);
        
        freq[root.val]--;
    }
    
    private boolean isPallindrome(int[] freq){
        boolean oddfreqfound = false;
        for(int ele : freq){
           if(ele % 2 != 0){
               if(oddfreqfound){
                   return false;
               }else{
                   oddfreqfound = true;
               }
           }
        }
        return true;
    }
    
    
}
