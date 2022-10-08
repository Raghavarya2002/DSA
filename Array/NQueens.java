import java.io.*;
import java.util.*;

public class Solution {
    public static boolean queen(int[][] mat,int row,int col){
        int n=mat.length;
        //right
        for(int r=row,c=col+1;c<n;c++){
            if(mat[r][c]==1) return false;
        }
        //left
        for(int r=row,c=col-1;c>=0;c--){
            if(mat[r][c]==1) return false;
        }
        //top
        for(int r=row-1,c=col;r>=0;r--){
            if(mat[r][c]==1) return false;
        }
        //bottom
        for(int r=row+1,c=col;r<n;r++){
            if(mat[r][c]==1) return false;
        }
        //IN DIAGONAL RIGHT DIRECTION  ->
        for(int r=row+1,c=col+1;r<n && c<n;r++,c++){
            if(mat[r][c]==1) return false;
        }
        
         //IN DIAGONAL left-bootom   ->
        for(int r=row+1,c=col-1;r<n && c>=0;r++,c--){
            if(mat[r][c]==1) return false;
        }
          //IN DIAGONAL left-top   ->
        for(int r=row-1,c=col-1;r>=0 && c>=0;r--,c--){
            if(mat[r][c]==1) return false;
        }
        //IN DIAGONAL right-top   ->
        for(int r=row-1,c=col+1;r>=0 && c<n;r--,c++){
            if(mat[r][c]==1) return false;
        }
        return true;
           
        }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
         
        int[][] matrix= new int[n][n];
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                matrix[row][col]=sc.nextInt();
            }
        }
        
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
         if(matrix[row][col]==1&&queen(matrix,row,col)==false){
             System.out.println("Danger");
             return;
         }
            }
        }
        
        System.out.println("N Queens");
        
        
    }
}
