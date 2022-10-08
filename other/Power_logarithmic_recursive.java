// 1. You are given a number x.
// 2. You are given another number n.
// 3. You are required to calculate x raised to the power n. Don't change the signature of power function.

// Note1 -> The previous version expects the call stack to be of n height. This function expects call function to be only log(n) high.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        
       int xnb2=power(x,n/2);
       int xn =xnb2*xnb2;
       if(n%2==1){
           xn=xn*x;
           }
        return xn;
           
      
    }

}
