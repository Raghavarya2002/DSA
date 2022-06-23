// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. You are required to find and print the k largest elements of array in increasing order.

import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int i =0;i< arr.length;i++){
          if(i < k){
              pq.add(arr[i]);
          }else{
              if(arr[i] > pq.peek()){
                  pq.remove();
                  pq.add(arr[i]); 
              }
          }
      }
      
      //Space complexity is K because size of size of priority queue is not more than K in any statement of the code
      //and time complexity of this is nlog^K bcoz  loop is running n times and the elements present in the priority queue is not more than the K
      
      while(pq.size() > 0){
          System.out.println(pq.remove());
      }
    }

}
