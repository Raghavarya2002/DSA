// 1. You are required to complete the code of our MedianPriorityQueue class. The class should mimic the behaviour of a PriorityQueue and give highest priority to median of it's data.
// 2. Here is the list of functions that you are supposed to complete
// 2.1. add -> Should accept new data.
// 2.2. remove -> Should remove and return median value, if available or print "Underflow" otherwise and return -1
// 2.3. peek -> Should return median value, if available or print "Underflow" otherwise and return -1
// 2.4. size -> Should return the number of elements available
// Note -> If there are even number of elements in the MedianPriorityQueue, consider the smaller median as median value.

// In this question, we have to create our own queue but this is not a normal priority queue. This is a median priority queue. What do we mean by this?
// A median priority queue will be just like the normal priority queue but in the priority queue when we call the remove function it removes the smallest element (Element of highest priority) but in the median priority queue we want the remove() function to remove the median of the elements present in the queue. Same will be the case for the peek() function. Also, the time complexity of these methods should remain the same for these methods as in a normal priority queue i.e peek() should be O(1) and remove should be O(logn).
// What if there are even numbers of elements in the median priority queue?
// If there are odd elements then the middle element is the median but if there are an even number of elements, the smaller element in the median pair will be the one which we give priority to in our median priority queue. Also, if the priority queue is empty, we will return -1 and print "Underflow" for the peek() and remove() functions. We have to also complete the body of the size() and add(val) functions also. 

// Approach: at the Bottom

import java.io.*;
import java.util.*;

public class Main {

  public static class MedianPriorityQueue {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    
    //left vali = smaller half of data [max priority queue] , sabse bade element of peek me bhej deti hai
    //right vali = greater half of data[min type ki priority queue], greayer half ka smaller element

    public MedianPriorityQueue() {
      left = new PriorityQueue<>(Collections.reverseOrder());
      right = new PriorityQueue<>();
    }

    public void add(int val) {
      if(right.size() > 0 && val > right.peek()){
          right.add(val);
      }else{
          left.add(val);
      }
      
      if(left.size() - right.size() == 2){
          right.add(left.remove());
      }else if(right.size() - left.size() == 2){
          left.add(right.remove());
      }
    }

    public int remove() {
       if(this.size() == 0){
            System.out.println("Underflow");
            return -1;
        }else if(left.size() >= right.size()){
         return left.remove();
      }else{
          return right.remove();
      }
    }

    public int peek() {
        
        if(this.size() == 0){
            System.out.println("Underflow");
            return -1;
        }else if(left.size() >= right.size()){
         return left.peek();
      }else{
          return right.peek();
      }
    }

    public int size() {
      return left.size()+right.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MedianPriorityQueue qu = new MedianPriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}



// We will use two priority queues to implement the median priority queue. One priority queue is named as left and the other is named as right. The left priority queue stores the smaller first half of the elements and the right priority queue stores the greater half of the elements. The left priority queue is a max priority queue and the right priority queue is a min priority queue.

// If there were 6 elements in the priority queue, they will be present in the left and right priority queues as shown above. The peek of the left priority queue gives the max value in it (since it is a max priority queue) and the peek of the right priority queue gives the least value in it (since it is a min priority queue). Now let us implement each function one-by-one to understand the working of this procedure.

// Add(value) in Median Priority Queue
// there are equal numbers of elements in both the priority queues. So, the first rule is this only. Now, what if there are an odd number of elements in the median priority queue? So, one priority queue will have more number of elements as compared to the other. But the question is, how much can they differ in their size?
// The two priority queues (left and right) will have the max difference of 1 in their sizes. Meaning one priority queue can have at most one element more than the other. So, the difference in their sizes can be less than or equal to one. Also, which priority queue will have more elements is not specific. Any priority queue can have more elements than the other.
// Now, let us try to insert some elements in the median priority queue and understand the procedure and think of the code side-by-side.
// Let us say we have an empty median priority queue right now. We have to insert the first element. So, the element will always be inserted in the left priority queue by default unless it satisfies a particular condition that we will study in a short while.
// So, the element gets inserted in the left priority queue.
// But, we had another rule also that the difference in the size of the priority queues should not be greater than one. Here it is 2. So, we will remove an element from the left priority queue and it to the right priority queue. Which element will be removed? Since the left priority queue is a max priority queue therefore 20 will be removed and we will add it to the right priority queue. Thus the definition of both the queues is also maintained.
// We know that by default the elements are added to the left priority queue. But, when the element being inserted is greater than the element present at the peek() of the right priority queue, the input element gets inserted into the right priority queue.
// So, these are all the rules for adding an element to the median priority queue. To sum up:

// The elements are added by default to the left priority queue.
// The difference between the size of the two priority queues should be maintained to 1. If the difference increases, shift one element from the queue with higher no of elements to the one with the lower.
// If the input element is greater than the value of peek() of the right priority queue, then it is added to the right priority queue only.
