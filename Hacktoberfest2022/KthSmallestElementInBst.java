Question Link : https://leetcode.com/problems/kth-smallest-element-in-a-bst/

class KthSmallestElementInBst {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        in(root,al);
        return al.get(k-1);
    }
    public void in(TreeNode root,ArrayList<Integer> al){
        if(root==null){
            return;
        }
        in(root.left,al);
        al.add(root.val);
        in(root.right,al);
    }
}
