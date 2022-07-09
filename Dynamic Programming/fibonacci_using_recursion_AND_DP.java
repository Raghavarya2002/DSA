//fibonacci using recursion
//Behuda code hai ye , haha , ek ka fibonacci hum baar baar solve krte hai jaise kbhi 2 ka kbhi 3 ka kbhi kisi ka toh jab ek chiz solve kr li toh baar baar usi ko kyu solve krna , and answer toh same ka same hi rhega jitni baar solve krlo tohchlo aage dekhte hai kya hota hai iska optimize usig dynamic programming approach

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fibo = fib(n);
    System.out.println(fibo);
 }
 
 public static int fib(int n){
     
     if(n == 0 || n == 1){
         return n;
     }
     
     int fibnm1 = fib(n-1);
     int fibnm2 = fib(n-2);
     int fibn = fibnm1 + fibnm2;
     
     return fibn;
     
 }

}


//now optimize code of fibonacci using DP approach
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fibo = fibMemoized(n,new int[n+1]);
    System.out.println(fibo);
 }
 
 public static int fib(int n){
     
     if(n == 0 || n == 1){
         return n;
     }
     
     int fibnm1 = fib(n-1);
     int fibnm2 = fib(n-2);
     int fibn = fibnm1 + fibnm2;
     
     return fibn;
     
 }
 
  public static int fibMemoized(int n,int[] qb){
     
     if(n == 0 || n == 1){
         return n;
     }
     
     if(qb[n] != 0){
         return qb[n];
     }
     
     int fibnm1 = fibMemoized(n-1,qb);
     int fibnm2 = fibMemoized(n-2,qb);
     int fibn = fibnm1 + fibnm2;
     
     qb[n] = fibn;
     
     return fibn;
     
 }

}
