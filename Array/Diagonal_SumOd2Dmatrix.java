class Solution {
    public int diagonalSum(int[][] mat) {
       int n=mat.length;
         int sum=0;
        for(int row=0;row<n;row++){ 
            for(int col=0;col<n;col++){
                if(row==col || row+col==n-1){
                    sum=sum+mat[row][col];
                }
            }
        }
        
       
        return sum;
        
        
    }
}