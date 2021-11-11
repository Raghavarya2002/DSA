import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
   
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i<arr.length;i++){
        arr[i]= sc.nextInt();
    }
    
    int num = sc.nextInt();
    int temp=0;
    for(int i =0;i<arr.length;i++){
        if(arr[i] == num){
            temp = i;
            break;
        }
    }
    System.out.println(temp);
 }

}
