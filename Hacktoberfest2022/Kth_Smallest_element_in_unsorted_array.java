
import java.util.*;

public class  Kth_Smallest_element_in_unsorted_array{

   public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of array");
      int n=sc.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      System.out.println("Enter the value of k");
      int k = sc.nextInt();
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      for(int i =0;i< arr.length;i++){
          if(i < k){
              pq.add(arr[i]);
          }else{
                  pq.remove();
                  pq.add(arr[i]); 
          }
      }
          System.out.println(pq.remove());
      
    }
}
