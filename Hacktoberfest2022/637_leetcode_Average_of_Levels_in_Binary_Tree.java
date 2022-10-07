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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int size = que.size();
            double sum = 0;
            int numofele = size; // number of elements
            
            while(size-- > 0){
                TreeNode head = que.poll();
                sum += head.val;
                if(head.left != null){
                    que.offer(head.left);
                }
                if(head.right != null){
                    que.offer(head.right);
                }
                
            }
            
            result.add(new Double(sum/numofele));
        }
        
        return result;
        
    }
}
