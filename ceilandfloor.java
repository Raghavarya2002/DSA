import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i =0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    
    int data = sc.nextInt();
    
    int l =0;
    int h = arr.length-1;
    int floor =0; //lower bound
    int ceil =0; //upper bound
    
    while(l<=h){
        int mid = (l+h)/2;
        if(data <arr[mid]){
            h=mid-1;
            ceil=arr[mid];
        }
        else if(data>arr[mid]){
            l = mid + 1;
            floor = arr[mid];
        }
        else{
            ceil = arr[mid];
            floor=arr[mid];
            break;
            
        }
    }
    
    System.out.println(ceil);
    System.out.println(floor);
    
 }

}
