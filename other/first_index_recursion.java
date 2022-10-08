// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the first index at which x occurs in array a.
// 5. If x exists in array, print the first index where it is found otherwise print -1.
  
  
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int f = firstIndex(arr,0,x);
        System.out.println(f;
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        else{
        int fiisa = firstIndex(arr,idx+1,x);
        return fiisa;
        }

    }

}
