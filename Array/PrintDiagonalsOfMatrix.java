import java.io.*;
import java.util.*;

public class Solution {
    public static void printDiagonals(int[][] mat , int n){
        String space="";
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
                if(i==j||i+j==n-1){
                System.out.print(mat[i][j]+" ");
            }
              else{
                  System.out.print("  ");
              }
          }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mat = new int[n][n];
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                mat[row][col]=sc.nextInt();
            }
        }
        
        printDiagonals(mat,n);
        
    }
}