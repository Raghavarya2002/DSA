//ye code bhi waahiyat hai , haha , jaise fibonacci vala tha , ab isko optimize karna hai using Dynamic programming approach
//ek problem ko isme baar baar solve kr rhe hai , 2 ko baar baar solve , 1 ko baar baar solve kr rhe hai

//recursively code

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countpath = countPaths(n);
        System.out.println(countpath);
    }
    
    public static int countPaths(int n){
        if(n < 0){
            return 0;
        }
        
        else if(n == 0){
            return 1;
        }
        
        int nm1 = countPaths(n-1);
        int nm2 = countPaths(n-2);
        int nm3 = countPaths(n-3);
        
        int countpath = nm1 + nm2+ nm3;
        
        return countpath;
    }

}


//ab aati hai bhyii Dynamic Programming Approach (Memoization yaani ki memorize kar lia and phir usi ko use kar liya)
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countpath = countPaths(n, new int[n+1]);
        System.out.println(countpath);
    }
    
    public static int countPaths(int n , int[] qb){
        if(n < 0){
            return 0;
        }
        
        else if(n == 0){
            return 1;
        }
        
        if(qb[n] > 0){
            return qb[n];
        }
        
        System.out.println("Hello" + n);
        int nm1 = countPaths(n-1,qb);
        int nm2 = countPaths(n-2,qb);
        int nm3 = countPaths(n-3,qb);
        
        
        
        int countpath = nm1 + nm2+ nm3;
        
        qb[n] = countpath;
        
        return countpath;
    }

}



//or ab dubara ab nayye tarike se ek or approach seekhenge (Tabulation Approach)
// step 1: create storage like array and assign meaning , meaning mtlb array me like 4th index pe hum kya store krenge , 4th pe ye store krenge ki 4th se 0 tak ke jaane ke kitne raste hain
// Step 2: Identify the direction of problem (chhoti problem kis taraf hai badi kis taraf hai eg. 0 se 0chhoti problem hai ya 6 se 0 chhoti problem , answer is o se o chhoti problem hai)
  
//   TOH HMESHA CHHOTE SE BADE KI TARAF PROBLEM SOLVE HOTI HAI (ALWAYS IDENTIFY THE DIRECTION)

//   Step 3: Travel and Solve
  
  //Tabulation Approach (isko recursively and memoization se bhi kr skte hai , but abhi iteratively kia is approach ko)
      //Iteratively
    public static int countPathsTab(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        
        
        for(int i = 1;i<=n;i++){
            
            if(i == 1){
                dp[i] = dp[i-1];
            }
            
            else if(i == 2){
                dp[i] = dp[i-1] + dp[i-2];
            }
            
            else{
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
            
            
        }
        
        return dp[n];
    }
