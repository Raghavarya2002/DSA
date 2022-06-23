// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. The array is nearly sorted. Every element is at-max displaced k spots left or right to it's position in the sorted array. Hence it is being called k-sorted array.
// 4. You are required to sort and print the sorted array.

// Note -> You can use at-max k extra space and nlogk time complexity.

// Algorithm:
// We create a priority queue of size k+1. We insert the first k+1 elements in it.
// Now, we remove one element from the priority queue. This will be the smallest element as the removal from the priority queue gives the smallest element or the element of highest priority. Now, we have k elements remaining in the priority queue.
// So, we insert the next element in the priority queue and the size again becomes k+1. Now we repeat the same procedure until we cover the entire array.
// If the array is complete and some elements are left in the priority queue, we empty the priority queue completely and stop the procedure.

// Approach:
// Let us say, we have an array given below. We are also given k=2 i.e. this array is 2-sorted.
// Let us say that we have a funnel. This funnel can filter out the element of least value. So, we made a funnel of size k+1=2+1=3 in this case and kept it at the 0th index. So, it can accommodate three elements 2,3 and 1. Since this funnel can filter out the smallest element, we get element 1 out from this funnel. 
// After this, the funnel has only two elements inside it. So, we can put one more element into this funnel. Let's move this funnel one step ahead and put one more element into it.Now again, we will use this funnel's property to separate out the smallest element and we get another element in its sorted order.
// So, we can apply the same technique till we reach the end of the array. We have to keep repeating this procedure until we have nothing left to put into this funnel



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
      
      for(int i =0; i <= k; i++){
          pq.add(arr[i]);
      }
      
      for(int i = k+1; i < arr.length; i++){
          System.out.println(pq.remove());
          pq.add(arr[i]);
      }
      
      while(pq.size() > 0){
          System.out.println(pq.remove());
      }
      
   }

}
