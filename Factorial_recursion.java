import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int facnminus1 = factorial(n-1);
        int fn = n*facnminus1;
        return fn;
    }

}
