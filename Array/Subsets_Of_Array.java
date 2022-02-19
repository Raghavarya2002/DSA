import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i =0;i<arr.length;i++){
    arr[i]=sc.nextInt();
    }
    
    int limit = (int)Math.pow(2,arr.length);
    
    for(int i=0;i<limit;i++){
        String subset ="";
        int temp =i;
        
        for(int j =arr.length-1;j>=0;--j){
            int r = temp%2;
            temp=temp/2;
            
            if(r==0){
                subset = "-	" + subset;
            }
            else{
                subset = arr[j] + "\t" + subset;
            }
        }
        System.out.println(subset);
    }
    
    
 }

}

//Input
/*
3
10
20
30
*/

//output
/*
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30	
*/
