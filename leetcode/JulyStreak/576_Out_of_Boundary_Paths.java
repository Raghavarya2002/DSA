class Solution {
    
    private Long[][][] dp = null;
    private int modulus = 1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        
      dp = new Long[m+1][n+1][maxMove+1];
        return (int)findPathsMemoizaton(m,n,maxMove,startRow,startColumn);
        
    }
    
    public long findPathsMemoizaton(int m , int n , int maxMove, int row , int col){
        
        //basecase
            
        
        if(maxMove < 0){
            return 0;
            
        }
        
        //boundary
        
        if(row == m || col == n || row < 0 || col < 0){
            return 1;
        }
        
        if(dp[row][col][maxMove] != null){
            return dp[row][col][maxMove];
        }
        
        long result =0;
        long leftmaxMove = findPathsMemoizaton(m,n,maxMove-1,row,col-1);
        long rightmaxMove = findPathsMemoizaton(m,n,maxMove-1,row,col+1);
        long upmaxMove = findPathsMemoizaton(m,n,maxMove-1,row-1,col);
        long bottommaxMove = findPathsMemoizaton(m,n,maxMove-1,row+1,col);
        
        result = ((leftmaxMove + rightmaxMove + upmaxMove + bottommaxMove) % modulus);
        
        dp[row][col][maxMove] = result;
        return result;
    }
}
