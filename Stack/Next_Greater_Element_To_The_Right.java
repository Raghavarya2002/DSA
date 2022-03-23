// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to "next greater element on the right" for all elements of array
// 4. Input and output is handled for you.

// "Next greater element on the right" of an element x is defined as the first element to right of x having value greater than x.
// Note -> If an element does not have any element on it's right side greater than it, consider -1 as it's "next greater element on right"

// Sample Input 
// 5
// 5
// 3
// 8
// -2
// 7
// Sample Output
// 8
// 8
// -1
// 7
// -1



import java.io.*;
import java.util.*;

public class Main {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
  }

  public static int[] solve(int[] arr) {
    int[] nge = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    st.push(arr[arr.length-1]);
    nge[arr.length-1] = -1;
    for(int i = arr.length-2;i>=0;i--){
        //-a+
        while(st.size() > 0 && arr[i] >= st.peek()){
            st.pop();
        }
        
        if(st.size()==0){
            nge[i] =-1;
        }else{
            nge[i] =st.peek();
        }
        st.push(arr[i]);
        
        
    }
    return nge;
  }

}
