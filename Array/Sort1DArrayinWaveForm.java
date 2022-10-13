import java.io.*;
import java.util.*;

public class Solution {
    public static void waveSort(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i+1<arr.length;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int idx = 0; idx < arr.length; idx++){
            arr[idx] = scn.nextInt();
        }
        
        waveSort(arr);
        for(int idx = 0; idx < arr.length; idx++){
            System.out.print(arr[idx] + " ");
    }
}
}