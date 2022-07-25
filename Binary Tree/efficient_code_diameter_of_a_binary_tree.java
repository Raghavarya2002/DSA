import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static int height(Node node) {
    if (node == null) {
      return -1;
    }

    int lh = height(node.left);
    int rh = height(node.right);

    int th = Math.max(lh, rh) + 1;
    return th;
  }

  public static int diameter1(Node node) {
    if(node == null){
        return 0;
    }
    //max distance between two nodes of lhs
    int ld = diameter1(node.left);
    
    //max distance between two nodes of rhs
    int rd = diameter1(node.right);
    
    //max distance between left's deepest and right's deepest
    int ldrd = height(node.left) + height(node.right) + 2;
    
    int diameter = Math.max(ldrd,Math.max(ld,rd));
    
    return diameter;
    
    
  }
  
//   above function of diameter1  gives time complexity of O(n^2) because after calculating left and right diameter using recursions calls means in post order of 
//   recursions calls we'll again and again calculating the height of the node using recursion again and height is also a recursively function that's why we need to optimize
//   this approach , so for this we'll making a class named as DiaPair which holds the height and the diameter so without calculating height on single euler we'll calculate
//   the height and diameter using this approach and this'll give the time complexity of O(n).
  
  static class DiaPair{
      int height;
      int dia;
  }
  
  public static DiaPair diameter2(Node node){
      if(node == null){
          DiaPair bp = new DiaPair();
          bp.height = -1;
          bp.dia = 0;
          return bp;
      }
      
      DiaPair lp = diameter2(node.left);
      DiaPair rp = diameter2(node.right);
      
      DiaPair mp = new DiaPair();
      mp.height = Math.max(lp.height,rp.height) + 1;
      int factor = lp.height + rp.height+2;
      mp.dia = Math.max(factor,Math.max(lp.dia,rp.dia));
      
      return mp;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);

    
    DiaPair p  = diameter2(root);
    System.out.println(p.dia);
  }

}
