import java.io.*;
import java.util.*;

public class Solution {
    public static int maxProductSubArray(int[] arr){
        int maxProduct=1;
        for(int i=0;i<arr.length;i++){
            int product=1;
           for(int j=i;j<arr.length;j++){
                product=arr[j]*product;
               maxProduct=Math.max(product,maxProduct);
           }
        }
        return maxProduct;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int idx = 0; idx < arr.length; idx++){
            arr[idx] = scn.nextInt();
        }
        
        System.out.println(maxProductSubArray(arr));
    }
}