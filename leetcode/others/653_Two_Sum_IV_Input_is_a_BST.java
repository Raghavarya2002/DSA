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
//I'm writing optimized approach , not bruteforce
//bruteforce :  Inorder traversal => sorted elements in array => now two pointer approach , if sum is greater than 'k' , we'll reduce the pointer from right and vice-versa
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        BSTIterator l = new BSTIterator(root,false);
        BSTIterator r = new BSTIterator(root,true);
        
        int i = l.next();
        int j = r.next();
        
        while(i<j){
            if(i+j == k) return true;
            else if(i + j < k) i = l.next();
            else j = r.next();
        }
        return false;
    }
}

public class BSTIterator{
    private Stack<TreeNode> st = new Stack<TreeNode>();
    boolean reverse = true;
    
    public BSTIterator(TreeNode root,boolean isReverse){
        reverse = isReverse;
        pushAll(root);
    }
    
    public boolean hasNext(){
        return !st.isEmpty();
    }
    
    
    public int next(){
        TreeNode temp = st.pop();
        if(reverse == false) pushAll(temp.right);
        else pushAll(temp.left);
        
        return temp.val;
    }
    
    private void pushAll(TreeNode node){
        while(node != null){
            st.push(node);
            if(reverse == true) node = node.right;
            else node = node.left;
        }
    }
}
