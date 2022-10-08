import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // Array is sorted. Array may have duplicate values.
    
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i =0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    int data = sc.nextInt();
    int l =0;
    int h = arr.length-1;
    int FI =-1;
    //for first index
    while(l<=h){
        int mid = (l+h)/2;
        if(data<arr[mid]){
            h = mid-1;
        }
        else if(data> arr[mid]){
            l = mid+1;
        }
        else{
            FI = mid;
            h=mid-1;
            
        }
    }
    
    System.out.println(FI);
    
    //for last index
    
    l =0;
    h = arr.length-1;
    int LI=-1;
    
    while(l<=h){
        int mid = (l+h)/2;
        if(data<arr[mid]){
            h = mid-1;
        }
        else if(data> arr[mid]){
            l = mid+1;
        }
        else{
            LI = mid;
            l=mid+1;
            
        }
    }
    System.out.println(LI);
    
    
 }

}
