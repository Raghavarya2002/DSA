class Solution {
    public int[] findBall(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] ans = new int[m];
        for(int i =0;i<m;i++) {
            ans[i] = dfs(grid ,0 , i );
        }
        return ans;
    }
    static int dfs(int[][] grid ,int row , int col) {
        if(row == grid.length){
            return col;
        }
        if(col< 0 || col>=grid[0].length) {
            return -1;
        }
        if(grid[row][col] == 1 && col +1 < grid[0].length && grid[row][col+1] == 1) {
            return dfs(grid , row+1 , col +1);
        }
        else if(grid[row][col] == -1 && col-1>=0 && grid[row][col-1] == -1) {
            return dfs(grid , row+1 , col-1);
        }
        else {
            return -1;
        }
    }
}
