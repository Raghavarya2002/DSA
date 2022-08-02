// Time Complexity: O(m*log(n)*log(max-min))
// Space Complexity: O(1)

// Note : m = no of rows, n = no of columns 
// Approach:

// Take the range { matrix[0][0] to matrix[m][n] } i.e. [min to max].
// Now Run the binary search, for each mid find the number of elements in matrix that are less than or equal to mid.
// To find number of elements in matrix that are less than or equal to mid. Find the upper_bound of mid in every row and add them.
// If number of elements in matrix that are less than or equal to mid >= k, then discard the right half of the search space, else discard left half.

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        
        int low = matrix[0][0], high = matrix[m-1][n-1];
        while(low<=high){
            int mid = low + (high-low)/2;
            if(noOfElementsLessThan(mid,matrix) >= k ) high = mid - 1;
            else low = mid + 1; 
        }
        return low;
    }
    private int noOfElementsLessThan(int target,int[][] matrix){
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            count += upper_bound(matrix[i],target);
        }
        return count;
        
    }
    static int upper_bound(int arr[], int key)
    {
        int low = 0, high = arr.length;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (key >= arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }
}
