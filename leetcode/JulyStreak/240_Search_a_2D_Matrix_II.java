class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = 0;
        
        if(m != 0){
            n = matrix[0].length;
            
        }
        
        if(m == 0 || n == 0){
            return false;
        }
        
        int i = m-1;
        int j =0;
        
        while(i >= 0 && j < n){
            int curr = matrix[i][j];
            if(curr == target){
                return true;
            }
            else if(curr > target){
                i--;
            }
            else{
                j++;
            }
        }
        return false;
    }
}
