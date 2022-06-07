// 1. You are given a partially written GenericTree class.
// 2. You are required to complete the body of levelorderLineWise function. The function is expected to visit every node in "levelorder fashion" and print them from left to right (level by level). All nodes on same level should be separated by a space. Different levels should be on separate lines.


import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
    Node(){
        
    }
    Node(int data){
        this.data = data;
    }
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
    System.out.println("Node Pre " + node.data);

    for(Node child: node.children){
      System.out.println("Edge Pre " + node.data + "--" + child.data);
      traversals(child);
      System.out.println("Edge Post " + node.data + "--" + child.data);
    }

    System.out.println("Node Post " + node.data);
  }
  
  private static class Pair{
      Node node;
      int level;
      
      Pair(Node node , int level){
          this.node = node;
          this.level = level; 
          }
  }

  public static void levelOrderLinewise(Node node){
    // Level order line wise approach 4
    
    Queue<Pair> mainq = new ArrayDeque<>();
    mainq.add(new Pair(node, 1));
    
    int level =1;
    while(mainq.size() > 0 ){
        Pair p = mainq.remove();
        if(p.level > level){
            level = p.level;
            System.out.println();
        }
        System.out.print(p.node.data + " ");
        for(Node child : p.node.children){
            Pair childpair = new Pair(child , p.level + 1);
            mainq.add(childpair);
        }
    }
  
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
    levelOrderLinewise(root);
  }

}
