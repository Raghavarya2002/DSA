import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		int l = str.length();
		int facto = factorial(l);
		
		for(int i =0;i<facto;i++){
		    StringBuilder s = new StringBuilder(str);
		    int temp =i;
		    for(int div = l;div>=1;div--){
		        int q = temp/div;
		        int rem = temp%div;
		    
		        System.out.print(s.charAt(rem));
		        s.deleteCharAt(rem);
		        temp =q;
		    }
		    System.out.println();
		}
		
	}
	public static int factorial(int n){
	    int fact =1;
	    while(n>0){
	        fact *=n;
	        --n;
	    }
	    return fact;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
