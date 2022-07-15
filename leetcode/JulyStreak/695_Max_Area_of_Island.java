class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        //we stand at 1 (i,j)
        //left area => (i,j-1) , upArea => (i-1,j) , righrArea(i,j+1) , downArea(i+1,j)
        //Total Area of an island is = 1 + UpArea + DownArea + LeftArea + RightArea //formula
        //Time Complexity : O(m*n) where n = length of the matrix and m = breadth of the matrix 
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea,getCurrentArea(i,j,grid));
                    
                }
            }
        }
        return maxArea;
    }
    
    private int getCurrentArea(int i,int j,int[][] grid){ 
        
        //base Case
        
        if(i<0 || j< 0 || i>= grid.length || j >= grid[0].length || grid[i][j] <= 0){
            return 0;
        }
        
        
        grid[i][j] = -1;
       
        
        int leftArea = getCurrentArea(i,j-1,grid);
        int rightArea = getCurrentArea(i,j+1,grid);
        int upArea = getCurrentArea(i-1,j,grid);
        int downArea = getCurrentArea(i+1,j,grid);
        
        int totalArea = 1 + leftArea + rightArea + upArea + downArea;
        
        return totalArea;
        
  
    }
}
