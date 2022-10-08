//input 
//1  2  3
//4  5  6
//7  8  9

//output
  //1
  //4
  //7
  //8
  //5
  //2
  //3
  //6
  //9

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];
    for(int i =0;i<n;i++){
        for(int j = 0;j<m;j++){
            arr[i][j] = sc.nextInt();
        }
    }
    
    //when column is even then rows will increase
    //and when column is odd then rows will decrease
    //outer loop on column(increase)
    
    for(int j =0;j<m;j++){
        if(j%2==0){
            for(int i =0;i<n;i++){
                System.out.println(arr[i][j]);
            }
        }
        else{
             for(int i =n-1;i>=0;i--){
                System.out.println(arr[i][j]);
            }
        }
    }
    
    
}

}
