class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
         int m = text1.length();
        int n = text2.length();

        // Create a table to store the lengths of the
        // longest common subsequences of substrings.
        int[][] L = new int[m+1][n+1];

        // Fill the table in bottom-up order.
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (text1.charAt(i-1) == text2.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }

        // Return the length of the longest common subsequence.
        return L[m][n];
    }
}
