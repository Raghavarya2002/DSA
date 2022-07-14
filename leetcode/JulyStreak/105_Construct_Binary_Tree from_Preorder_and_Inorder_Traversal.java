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
private int preStart = 0;
public TreeNode buildTree(int[] preorder, int[] inorder) {
return recursion(preorder, inorder, 0, preorder.length - 1);
}

private TreeNode recursion(int[] preorder, int[] inorder, int left, int right) {
    if (preStart == preorder.length || left > right ) {
        return null;
    }
    TreeNode root = new TreeNode(preorder[preStart]);
    for (int i = left; i <= right; i++) {
        if (preorder[preStart] == inorder[i]) {
            preStart++;
            root.left = recursion(preorder, inorder, left, i - 1);
            root.right = recursion(preorder, inorder, i + 1, right);
            break;
        }
    }
    return root;
}
}
