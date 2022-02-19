import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
   Scanner sc = new Scanner(System.in);
   int m1 = sc.nextInt();
   int n1 = sc.nextInt();
   int[][] arr1 = new int[m1][n1];
   for(int i =0;i<m1;i++){
       for(int j =0;j<n1;j++){
           arr1[i][j] = sc.nextInt();
       }
   }
   
    int m2 = sc.nextInt();
   int n2 = sc.nextInt();
   int[][] arr2 = new int[m2][n2];
   for(int i =0;i<m2;i++){
       for(int j =0;j<n2;j++){
           arr2[i][j] = sc.nextInt();
       }
   }
   
   if(n1!=m2){
       System.out.println("Invalid Input");
       return;
   }
   
   
       // new matrix will be of size  2*4 = m1*n2
  int[][] arr3 = new int[m1][n2];
   
   for(int i =0;i<m1;i++){
       for(int j =0;j<n2;j++){
           for(int k =0;k<m1;k++){ // matrix1 - 2*3 , matrix2- 3*4 , k = m1 or n2 , because r1 c2 , r2 c1 , for multiplication of matrix c2=r2 like 3 in above example 
           arr3[i][j] += arr1[i][k]*arr2[k][j];
           }
       }
   }
   
   for(int i =0;i<m1;i++){
       for(int j =0;j<n2;j++){
          System.out.print(arr3[i][j] + " ");
            }
        System.out.println();
            }
        }
    }
   
   
   
