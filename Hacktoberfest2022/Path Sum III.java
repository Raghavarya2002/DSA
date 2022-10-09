import java.util.*;
 import java.io.*;
  
 class TreeNode {
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

public class Main{

    public static int pathSum(TreeNode root, int targetSum) {
      HashMap<Long,Integer> map=new HashMap<Long,Integer>();
      map.put((long)0,1);
      return paths(root,0,targetSum,map);
    }
    public static int paths(TreeNode root,long currsum,int target,HashMap<Long,Integer> map){
      if(root==null)return 0;
     
      currsum+=root.val;
      int res=map.getOrDefault(currsum-target,0);
      map.put(currsum,map.getOrDefault(currsum,0)+1);
      res+=paths(root.left,currsum,target,map)+paths(root.right,currsum,target,map);
      map.put(currsum,map.get(currsum)-1);
      return res;
   }
    public static void main(String args[]){
         int target=8;
         TreeNode root=new TreeNode(10);
         root.left=new TreeNode(5);
         root.right=new TreeNode(-3);
         root.left.left=new TreeNode(3);
         root.left.right=new TreeNode(2);
         root.right.right=new TreeNode(11);
         root.left.right.right=new TreeNode(1);
         root.left.left.left=new TreeNode(3);
         root.left.left.right=new TreeNode(-2);
         int ans=pathSum(root,target);
         System.out.println("Number of paths with sum=8 is "+ans);
     }
 }
