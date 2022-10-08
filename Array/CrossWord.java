import java.io.*;
import java.util.*;

public class Solution {
    public static boolean findWord(char[][] mat, int row, int col,String word){
        int n=mat.length;
        int idx=0;
         
        // horizontal - right
        for(int r = row, c = col; c < n && idx < word.length(); c++, idx++){
            if(mat[r][c] != word.charAt(idx)) break;
        }
        
        if(idx == word.length()) return true;
        
        // top to bottom
        
        idx=0;
        
        for(int r=row,c=col;r<n &&idx<word.length();r++,idx++ ){
            if(mat[r][c]!=word.charAt(idx)) break;
        }
        
            if(idx == word.length()) return true;
        //right-down-wise diagonal --->
        
        idx=0;
        for(int r=row,c=col;r<n&&c<n&&idx<word.length();r++,c++,idx++){
         if(mat[r][c]!=word.charAt(idx)) break;
        }
           if(idx == word.length()) return true;
        
        //left down-wise diagonal -->
        idx=0;
        for(int r=row,c=col;r<n&&c>=0&&idx<word.length();r++,c--,idx++){
            if(mat[r][c]!=word.charAt(idx)) break;
        }
        if(idx == word.length()) return true;
        
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
         
        char[][] matrix= new char[n][n];
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                matrix[row][col]=sc.next().charAt(0);  
            }
        }
        String word = sc.next();
       
          for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
               if(findWord(matrix,row,col,word)==true){
                   System.out.println("true");
                   return;
               }
        }
    }
        System.out.println("false");
        
        
}
}



