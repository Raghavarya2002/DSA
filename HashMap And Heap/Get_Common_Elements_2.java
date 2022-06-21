// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. You are required to find the intersection of a1 and a2. To get an idea check the example below:
 
// if a1 -> 1 1 2 2 2 3 5
// and a2 -> 1 1 1 2 2 4 5
// intersection is -> 1 1 2 2 5

// Input : 7
// 1
// 1
// 2
// 2
// 2
// 3
// 5
// 7
// 1
// 1
// 1
// 2
// 2
// 4
// 5

// Note -> Don't assume the arrays to be sorted.

// Approach :
// We make a Hashmap table for every unique element of a1 vs. its frequency.we iterate through every element of the array a1 and subsequently increase the frequency against it.

// Now, we iterate through each element of the array a2. If that element is present in our Hashmap, then it is printed and the record of that element is removed from the hashmap . If the element is not present then we do nothing.

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int [] arr1 = new int[n1];
    
    for(int i =0;i< arr1.length;i++){
        arr1[i] = sc.nextInt();
    }
    
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    
    for(int i=0;i< arr2.length;i++){
        arr2[i] = sc.nextInt();
    }
    
    HashMap<Integer , Integer> hm = new HashMap<>();
    
    for(int val : arr1){
        if(hm.containsKey(val)){
            int oldfreq = hm.get(val);
            int newfreq = oldfreq + 1;
            hm.put(val, newfreq);
        }else{
            hm.put(val , 1);
        }
    }
    
    
     for(int val : arr2){
        if(hm.containsKey(val) && hm.get(val) > 0){
        System.out.println(val);
            int oldfreq = hm.get(val);
            int newfreq = oldfreq - 1;
            hm.put(val, newfreq);
        }
    }
    
 
 
 }

}
