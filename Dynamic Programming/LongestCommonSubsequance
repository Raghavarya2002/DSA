public class LCS {
    public static void main(String[] args) {
        String s = "acd";
        String t = "ced";
        int ind1 = s.length();
        int ind2 = t.length();
        int[][] dp = new  int[ind1][ind2];
        for (int i = 0; i < ind1; i++) {
            for (int j = 0; j < ind1; j++) {
                dp[i][j] = -1;

            }

        }
        System.out.println(lcs(s,t,ind1-1,ind2-1,dp));
    }
    
    // Recursion approch with  2^n complexcity 
    static int lcs(String s, String t, int ind1 , int ind2){
        // base case
        // if the index is going to negative then  this is the end of the string
        if (ind1 < 0 || ind2 < 0){
            return 0 ;
        }
        // check that it is mathed or not 
        if (s.charAt(ind1) == t.charAt(ind2)){
            return   1 + lcs(s,t,ind1-1,ind2-1);

        }
        // when the index is not match then we just move the element  we have to kepp one move one for the checking the element one by one
        return  0 + Math.max(lcs(s,t,ind1-1,ind2),lcs(s,t,ind1,ind2-1));
    }
    // memorazarion Approch

    static int lcs(String s, String t, int ind1 , int ind2 ,int[][] dp){
        // base case
        // if the index is going to negative then  this is the end of the string
        if (ind1 < 0 || ind2 < 0){
            return 0 ;
        }
        if (dp[ind1][ind2] != -1 ) return  dp[ind1][ind2] ;
        if (s.charAt(ind1) == t.charAt(ind2)){
            return dp[ind1][ind2] =   1 + lcs(s,t,ind1-1,ind2-1);

        }
        // when the index is not match then we just move the element  we have to kepp one move one for the checking the element one by one
        return dp[ind1][ind2] =   0 + Math.max(lcs(s,t,ind1-1,ind2),lcs(s,t,ind1,ind2-1));
    }
    
    // Tabulation approch 
     }
    static int lcs(String s1, String s2){
        int n = s1.length();
        int m = s2.length();


        // declred the dp
        int dp[][] = new int[n+1][m+1];
//        for(int rows[]: dp)
//            Arrays.fill(rows,-1);

        for (int i = 0; i <=n ; i++) {
            dp[i][0] = 0 ;

        }
        for (int i = 0; i <=m ; i++) {
            dp[0][i] = 0 ;

        }
        for (int ind1 = 1; ind1 <=n ; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                if (s1.charAt(ind1-1) == s2.charAt(ind2-1) ){
                    dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
                }
                else
                {
                    dp[ind1][ind2] = 0 + Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
                }

            }

        }
        return dp[n][m];
    }
    
