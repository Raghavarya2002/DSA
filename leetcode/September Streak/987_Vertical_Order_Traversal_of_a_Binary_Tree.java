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

class Tuple{
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode _node, int _row, int _col){
        node = _node;
        row = _row;
        col = _col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
       TreeMap<Integer, TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        
        Queue<Tuple> que = new LinkedList<Tuple>();
        que.offer(new Tuple(root,0,0));
        while(!que.isEmpty()){
            Tuple tuple = que.poll();
            TreeNode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;
            
            if(!map.containsKey(x)){
                map.put(x, new TreeMap<>());
            }
            
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y, new PriorityQueue<>());
            }
            
            map.get(x).get(y).offer(node.val);
            
            if(node.left != null){
                que.offer(new Tuple(node.left,x-1,y+1));
            }
            if(node.right != null){
                que.offer(new Tuple(node.right,x+1,y+1));
            }
            
            
        }
        
        List<List<Integer>> ls = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()){
            ls.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes : ys.values()){
                while(!nodes.isEmpty()){
                    System.out.println(nodes.peek());
                    ls.get(ls.size() -1).add(nodes.poll());
                }
            }
        }
        
        return ls;
        
        
    }
}
