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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if(root == null) return list;
        q.offer(root);
        while(q.size() > 0){
            int count = q.size();
            List<Integer> sublist = new LinkedList<Integer>();
            for(int i =0;i<count;i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                sublist.add(q.poll().val);
            }
            list.add(sublist);
            
        }
        return list;
    }
}
