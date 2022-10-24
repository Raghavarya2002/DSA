/*
Author: Kabir Singh Mehrok <https://github.com/KabirSinghMehrok>

Title: Count Good Nodes in Binary Tree
Description: Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
*/


public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
 
class Solution {
    public int goodNodes(TreeNode root) {
        // dfs traversal to every node
        // keep track of the max val along the path
        // if given val > maxval, +1 and recurse, with updated maxval
        // else, traverse
        return recurse(root, root.val);
    }
    
    public int recurse(TreeNode root, int maxval)
    {
        if (root == null) return 0;
        if (root.val >= maxval) {
            return 1 + recurse(root.right, root.val) + recurse(root.left, root.val);
        }
        else return recurse(root.right, maxval) + recurse(root.left, maxval);
    }
}