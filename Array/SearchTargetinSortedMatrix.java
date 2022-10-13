import java.io.*;
import java.util.*;

public class Solution {
    public static void searchTarget(int[][] matrix,int target){
        int row=0, col= matrix[0].length-1;
        while(row<matrix.length&&col>=0){
            if(matrix[row][col]==target){
                System.out.println(row);
                System.out.println(col);
                return;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
       System.out.print("Not Found");
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
         int cols=sc.nextInt();
        int[][] matrix= new int[rows][cols];
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                matrix[row][col]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        searchTarget(matrix,target);
        
          
    }
}