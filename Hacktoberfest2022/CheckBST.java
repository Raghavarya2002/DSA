public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        // code here.
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root,list);
        int temp = list.get(0);
        for(int i=1; i<list.size(); i++){
            if(list.get(i)<temp){
                return false;
            }
            temp = list.get(i);
        }
        return true;
    }
    void inOrder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left,list);
        list.add(root.data);
        inOrder(root.right, list);
    }
}