class Solution {
    
    public String tree2str(TreeNode root) {
        if(root == null) return "";
        StringBuilder sb = new StringBuilder();
        
        int val = root.val;
        
        // Get strig from both subtrees
        String left = tree2str(root.left);
        String right = tree2str(root.right);
        
        sb.append(val+"");
        
        // Ignore left part only if both left and right children are null
        // Else append left, even if empty parenthesis
        sb.append((left.isEmpty() && right.isEmpty()) ? "" : "("+left+")");
        
        // Append right part only if right child is not null
        sb.append((right.isEmpty()) ? "" : "("+right+")");
        
        return sb.toString();
    }
    
}
