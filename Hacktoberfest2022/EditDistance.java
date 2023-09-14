import java.util.*;

public class EditDistance{
    
    public static void main(String [] args){
         String word1="horse";
         String word2="ros";
         System.out.println(minimumDistanceRecursion(word1,word2,0,0));
         System.out.println(minimumDistance(word1,word2));
    }

    public static int minimumDistanceRecursion(String word1,String word2,int idx1,int idx2){
    	// If first string is empty, the only option is to
        // insert all characters of second string into first
        if(idx1==word1.length()){
            return word2.length()-idx2;
        }

        // If second string is empty, the only option is to
        // remove all characters of first string
        
        if(idx2==word2.length()){
            return word1.length()-idx1;
        }

        // If current characters of two strings are same,
        // Ignore the characters and get count for remaining strings.
        if (word1.charAt(idx1) == word2.charAt(idx2))
            return minimumDistanceRecursion(word1, word2, idx1+1, idx2+1);
        
         //If the current characters are not same
         //return 1+minimum of all operations
         //insert,replace,delete
        return 1+ Math.min(minimumDistanceRecursion(word1,word2,idx1+1,idx2),
                            Math.min(minimumDistanceRecursion(word1,word2,idx1,idx2+1),
                                     minimumDistanceRecursion(word1,word2,idx1+1,idx2+1)));
    }

    //using dynamic programming
    //Time Complexity: O(n*m)
    //Space Complexity: O(n*m)
    public static int minimumDistance(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        int [][]dp=new int[n+1][m+1];
        for(int i=n;i>=0;i--){
            for(int j=m;j>=0;j--){
                if(i==n&&j==m){
                    dp[i][j]=0;
                }
                else if(i==n){
                    dp[i][j]=m-j;
                }
                else if(j==m){
                    dp[i][j]=n-i;
                }
                else{
                    //if current characters are same
                    if(word1.charAt(i)==word2.charAt(j)){
                        dp[i][j]=dp[i+1][j+1];
                    }
                    else{
                        //If current characters are different
                        //1+minimum of all insert,delete,replace operations
                        dp[i][j]=Math.min(dp[i+1][j],
                                          Math.min(dp[i+1][j+1],dp[i][j+1]))
                                          +1;   
                    }
                }
            }
        }
        return dp[0][0];
    }


}