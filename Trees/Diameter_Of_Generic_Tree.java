// 1. You are given a partially written GenericTree class.
// 2. You are required to find and print the diameter of tree. THe diameter is defined as maximum number of edges between any two nodes in the tree.
// Input is :
// 20
// 10 20 -50 -1 60 -1 -1 30 -70 -1 80 -1 90 -1 -1 40 -100 -1 -1 -1

// Approach:
// We need to maximize the number of edges between any two nodes to calculate diameter.
// To be noted that to maximize the number of edges we have to always consider the leaf nodes.
// Now we wish to find a diameter that passes through our current node.
// This can be found by adding the deepest subtree and second deepest subtree and adding 2 to their sum.
// Getting the deepest and second deepest subtree ensures that we are taking the maximum possible edges from the current node and 2 is added to link both the leaves.
// Now we can recurse this approach for every node in our tree as our diameter need not always pass through the root node. So at each node, we calculate the diameter from the current node and compare it with the global maximum and then we return the height of our subtree which can, later on, be used by any ancestor nodes to calculate their diameter and height.


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

  
    static int dia =0;
    static int calculateDiaReturnHeight(Node node){
        int deepestchildheight = -1;
        int seconddeepestchildheight = -1;
        for(Node child : node.children){
            int childheight = calculateDiaReturnHeight(child);
            
            if(childheight > deepestchildheight){
                seconddeepestchildheight = deepestchildheight;
                deepestchildheight = childheight;
            }else if(childheight > seconddeepestchildheight){
                seconddeepestchildheight = childheight;
                
            }
        }
        
        if(deepestchildheight + seconddeepestchildheight + 2 > dia){
            dia = deepestchildheight + seconddeepestchildheight + 2;
        }
        
        deepestchildheight +=1;
        
        return deepestchildheight;
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
    calculateDiaReturnHeight(root);
    System.out.println(dia);
  }

}
