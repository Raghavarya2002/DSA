import java.io.*;
import java.util.*;

public class Solution {
    public static void rotate180(int[][] mat, int n){
        for(int row=n-1;row>=0;row--){
            for(int col=n-1;col>=0;col--){
                System.out.print(mat[row][col]+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt();
        int mat[][] = new int[size][size];
        
        for(int idx = 0; idx < size; idx++) 
            for(int jdx = 0; jdx < size; jdx++)
                mat[idx][jdx] = sc.nextInt();
        
        rotate180(mat,size);
    }
}