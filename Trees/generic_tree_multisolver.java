// Previously we calculated size, height, min and max using recursion.

// Here, we will use data members and will keep changing their values. That is we are going to traverse through a tree but not return anything.

// Approach
// So if we are given a tree as in figure 1, then we initialize the data members. Size is initialized as 0, min as +8, max as -8 and height as 0.
// This method uses an example approach, "as we keep visiting nodes, the size of the data member is increased" .

// EULER PATH
// Since height is made in heap and depth is made in stack, therefore height always remains in the heap but depth can vanish as each level of stack is popped.

// Remember Reader, height is the depth of the deepest node.

// We mention the depth of an element beside that element in the following figures.

// Following figures represent the traversals of the first few elements.

// Observe that we kept the Node class, display function and construction function as the same.

// We want you to focus on the multisolver function.

// We declare some properties of size, min, max and height.
// These values are always available in heap and do not need to be passed in recursion.
// We define our previously declared properties in the main function with default values.
// Hence, size is initialized as 0, min as +8, max as -8 and height as 0.
// The function of multisolver is passed 2 parameters, a node and depth. This depth variable is present in the stack.
// We change the values of our previously defined variables in the pre area of our recursive function.
// Here, with each traversal the size is increased by one. The min and max values are compared with the data of the node and accordingly changed. And the value of height is the maximum of previous height and the depth.
// Height is declared in heap and Depth is in stack.
// The function multisolver is called recursively for all the children of the node and the depth is increased with each call.
// Analysis:
// Time Complexity:
// O(n)

// Space Complexity:
// O(1)




Input , enter individually
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1

import java.io.*;

import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList< Node> children = new ArrayList< >();
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

    Stack< Node> st = new Stack< >();
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
  //******************************MULTISOLVER*******************************

  static int size;        //1
  static int min;
  static int max;
  static int height;

  public static void multisolver(Node node, int depth) { //3

    size++;  //4
    min = Math.min(min, node.data);
    max = Math.max(max, node.data);
    height = Math.max(height, depth);

    for (Node child : node.children) { //5
      multisolver(child, depth + 1);
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

    size = 0;         //2
    min = Integer.MAX_VALUE;
    max = Integer.MIN_VALUE;
    height = 0;

    multisolver(root, 0);

    System.out.println("Size=" + size);
    System.out.println("Min=" + min);
    System.out.println("Max=" + max);
    System.out.println("Height=" + height);
  }

}


