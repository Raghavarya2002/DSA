import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] arr = new int[n][m];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length-1;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int minrow=0;
        int maxrow=arr.length-1;
        
        int mincol = 0;
        int maxcol=arr[0].length-1;
        
        int totalelements = n*m;
        int counter =0;
        
        //left wall
        
        for(int i=minrow,j=mincol;i<=maxrow && counter<totalelements;i++){
            System.out.println(arr[i][j]);
            counter++;
        }
        mincol++;
        
        //bottom wall 
        
        for(int i=maxrow,j=mincol;j<=maxcol&& counter<totalelements;j++){
            System.out.println(arr[i][j]);
            counter++;
        }
        maxrow--;
        
        //right wall
        for(int i=maxrow,j=maxcol;i>=minrow&& counter<totalelements;i--){
            System.out.println(arr[i][j]);
            counter++;
        }
        maxcol--;
        
        //top wall
        for(int i=minrow,j=maxcol;j>=mincol&& counter<totalelements;j--){
            System.out.println(arr[i][j]);
            counter++;
        }
        minrow++;
        
       
    }

}
