// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print the longest sequence of consecutive elements in the array (ignoring duplicates).
// Note -> In case there are two sequences of equal length (and they are also the longest), then print the one for which the starting point of which occurs first in the array.

// We have to solve this problem in O(n) Complexity

// TIME COMPLEXITY- O(n) , bcoz of three loops , last while loop is running and it is equal to the sum of means sigma of while loop is equals to n , n+n+n(for + while) 
// Since the hashmap is traversed once therefore the time complexity is linear.


// SPACE COMPLEXITY- O(n) where n= number of entities in the Hashmap.
  
// We construct a hashmap (Integer vs. Boolean) for all the elements of the array and store "true" against them all initially.This "true" represents that its corresponding element is the starting element of a desired sequence.

// Now we iterate through the entire loop and check whether a number, 1 less than that element is present in the hashmap or not. If the element is not present then we do nothing.
// For example, if we are at the element 10 of the array, then we check whether the number previous to 10 i.e. 10-1=9, is present in the hashmap or not.

// If we find out that the previous number is present in the hashmap, then it could not be the starting of the consecutive sequence. Hence we mark that element as "false".
// Hence, since 9 is present in the hashmap, therefore 10 is marked as "false".

// Had the previous number not been present in the hashmap, the current element of the array would have been left as "true".

// On iterating through all the elements and applying the above algorithm, our hashmap . Now, the elements marked as "true" are those elements which are actually at the starting index of a desired consecutive sequence.

// Now we run a third loop for all the elements and choose those elements which are marked "true".

// For every "true" element, we find all its consecutive elements in the hashmap.
// For example, for the element "5", the consecutive sequence becomes 5-6. The size of this sequence is 2. This size is stored as "mh" and the starting element is stored as "mval".

// Now the next sequence with "1" as the starting element is 1-2-3. The size of the sequence is 3. Since this size is greater than "mh" length, therefore, 3 is the new "mh" and the new "mval" is 1.

// This goes on until we find the max length out of all the sequences i.e. 5 for the sequence 8-9-10-11-12. Hence "ml" is 5 and "mval" is 8.

// Now all consecutive elements of the final "mval" till "mh" are printed.

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0;i< arr.length;i++){
        arr[i] = sc.nextInt();
    }
    
    HashMap<Integer , Boolean> hm = new HashMap<>();
    for(int val : arr){
        hm.put(val , true);
    }
    
    for(int val : arr){
        if(hm.containsKey(val -1)){
            hm.put(val , false);
        }
    }
    
    int maxstartpoint =0;
    int maxlength =0;
    for(int val : arr){
        if(hm.get(val) == true){
            int templength = 1;
            int tempstartpoint = val;
            
            while(hm.containsKey(tempstartpoint + templength)){
                templength++;
            }
            
            if(templength > maxlength){
                maxstartpoint = tempstartpoint;
                maxlength = templength;
            }
        }
    }
    
    for(int i =0;i< maxlength; i++){
        System.out.println(maxstartpoint + i);
    }
    
    
    
 }

}
