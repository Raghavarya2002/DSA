class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        
        for(int i = 0;i < rows;i++){
            for(int j = 0;j< cols;j++){
                if(grid[i][j] == '1'){
                    func(grid,i,j,rows,cols);
                    count++;
                }
            }
        }
        
       
        
        
        
        return count;
    }
    
    private void func(char[][] grid,int i , int j,int rows, int cols){
        if(i < 0 || j < 0 || i >= rows || j >= cols){
            return;
        }
        if(grid[i][j] == '0'){
            return;
        }
        
        grid[i][j] = '0';
        
        func(grid,i+1,j,rows,cols);
        func(grid,i-1,j,rows,cols);
        func(grid,i,j+1,rows,cols);
        func(grid,i,j-1,rows,cols);
    }
}
