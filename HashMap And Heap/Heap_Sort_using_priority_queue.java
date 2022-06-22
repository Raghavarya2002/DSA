import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
   PriorityQueue<Integer>pq = new PriorityQueue<>();
   int[] ranks = {10,22,33,55,85,98,65,45,75,35,15,95,28,37};
   for(int val : ranks){
       pq.add(val); //nlogn because add remove of logn complexity and loop is running n times so total complexity for this loop is nlogn
       
   }
   
   while(pq.size() > 0){
       System.out.println(pq.peek());
       pq.remove(); // so this loop is also of nlogn complexity bcoz loop is running for each and every element and remove will take logn time , so total complexity for this loop will be nlogn
   }
   
   // so result will be sorted numbers of this queue because everthing is added previosly and then we peek an element from the queue and the highestpriority wwil be of 10 because of Priority Queue , by default #smallest element has the #highest priority in the priority queue.
   //so we remove the element , so all elements will be sorted
   
   // so first loop is nlogn and second loop is also of nlogn so total is 2logn which is again nlogn
   
   //if we've to reverse the sequence of the elements of the priority queue we've to pass the "Collections.reverseOrder() at the constructor of the priority queue like that "
   // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
   
   }

}

// output is : 
// 10
// 15
// 22
// 28
// 33
// 35
// 37
// 45
// 55
// 65
// 75
// 85
// 95
// 98
  
//   reversing vala :
// 98
// 95
// 85
// 75
// 65
// 55
// 45
// 37
// 35
// 33
// 28
// 22
// 15
10
