// 1. You are given a partially written GenericTree class.
// 2. You are required to complete the body of traversals function. The function is expected to visit every node. While traversing the function must print following content in different situations.
//    2.1. When the control reaches the node for the first time -> "Node Pre" node.data.
//    2.2. Before the control leaves for a child node from a node -> "Edge Pre" 
//    node.data--child.data.
//    2.3. After the control comes back to a node from a child -> "Edge Post" node.data- 
//    -child.data.
//     2.4. When the control is about to leave node, after the children have been visited 
//     -> "Node Post" node.data.


import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static int size(Node node) {
    int s = 0;

    for (Node child : node.children) {
      s += size(child);
    }
    s += 1;

    return s;
  }

  public static int max(Node node) {
    int m = Integer.MIN_VALUE;

    for (Node child : node.children) {
      int cm = max(child);
      m = Math.max(m, cm);
    }
    m = Math.max(m, node.data);

    return m;
  }

  public static int height(Node node) {
    int h = -1;

    for (Node child : node.children) {
      int ch = height(child);
      h = Math.max(h, ch);
    }
    h += 1;

    return h;
  }

  public static void traversals(Node node){
      //euler's left ,before call of recursion ,on the way deep in the recursion , node's pre-area
    System.out.println("Node Pre " + node.data);
    for(Node child : node.children){
        //edge pre-area
        System.out.println("Edge Pre " + node.data + "--" + child.data);
        traversals(child);
        // edge post-area
        System.out.println("Edge Post " +node.data + "--" + child.data);
        
    }
    //euler's right ,after call of the recursion ,on the way out of the recursion , node's post-area
    System.out.println("Node Post " + node.data);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    traversals(root);
  }

}
