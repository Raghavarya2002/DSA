// 1. You are given a number x.
// 2. You are given another number n.
// 3. You are required to calculate x raised to the power n. Dont change the signature of power function .

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
        int xnm1= power(x,n-1);
        int xn = x*xnm1;
        return xn;
    }

}
