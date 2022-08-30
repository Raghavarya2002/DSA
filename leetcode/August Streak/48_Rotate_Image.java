//Approach : transpose the matrix and reverse the columns and boom !!

class Solution {
    public void rotate(int[][] matrix) {
        
        //transpose of the matrix
           for(int i =0;i<matrix.length;i++){
           for(int j =i;j<matrix[0].length;j++){ //only we've to move into the upper/lower triangle of the matrix bcoz some elements are already transposed
               int temp = matrix[i][j]; 
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
           }
       }
        
           //after first row to first column , we've to reverse the column 
       for(int i =0;i<matrix.length;i++){
           int leftindex=0;
           int rightindex=matrix[i].length-1;
           while(leftindex<rightindex){
               int temp = matrix[i][leftindex];
               matrix[i][leftindex]=matrix[i][rightindex];
               matrix[i][rightindex]=temp;
               
               leftindex++;
               rightindex--;
           }
       }
    }
}
