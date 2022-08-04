class Solution {
    public int uniquePaths(int m, int n) { //most optimal approach
         int N = n+m-2;
        int r = m-1;
        double res = 1;
    
        for(int i =1; i<= r;i++){
            res = res * (N - r + i)/i;
        }
    
        return (int) res;
    }
}


 public int uniquePaths(int i,int j, int m, int n) { //This is brute force approach and the TC -> exponential and SC -> exponential , this is not an optimal approach
    if(i==(n-1)&&j==m-1)) return1;
    if(i>=n||j>=m)return 0;
    else return uniquePaths(i+1,j)+uniquePaths(i,j+1);
    }
//eg, 2 rows and 3 columns
//Now this is optimal approach as compared to recursive approach using DP ,  ,and TC & SC will fall drastically exponentially , TC => O(m*n) SC => O(m*n)
//using dp we can resolve sub-overlapping problem which is present in above approach
//this is c++ using vector
 public int uniquePaths(int i,int j, int m, int n , vector<vector<int>> &dp) { 
    if(i == (n-1) && j == m-1)) return1;
    if(i>=n||j>=m)return 0;
     
     if(dp[i][j] != -1) return dp[i][j];
    else return dp[i][j] = uniquePaths(i+1,j,dp)+uniquePaths(i,j+1,dp);
    }

//eg, 2 rows and 3 columns
//Now again , both approaches are not optimal approaches  , we can make the solution more optimal using the Combinations (permutation and combination vala :) )
    
// RRD , DRR , RDR , , directions => m-1 in right and n-1 in bottom so total => m+n-2 , , So m+n-2Cm-1 right paths and m+n-2Cn-1 bottom paths
//and the TC => O(m-1)  or O(n-1)  depending on the above combination formula's and SC is O(1) , So this most optimal approach

//Now most optimal approach


public int uniquePaths(int m, int n) {
        int N = n+m-2;
        int r = m-1;
        double res = 1;
    
        for(int i =1; i<= r;i++){
            res = res * (N - r + i)/i;
        }
    
        return (int) res;
    }


