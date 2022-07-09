//fibonacci using recursion


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
