//TC: O(m*n* log(d)) , d stands for min(m,n)
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        //i-j
        Map<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        
        for(int i = 0;i < rows; i++){
            for(int j = 0; j < cols; j++){
                
                int diagonalKey = i-j;
                
                PriorityQueue<Integer> pq = map.getOrDefault(diagonalKey, new PriorityQueue<>());
                pq.offer(mat[i][j]);
                map.put(diagonalKey,pq);
                
            }
        }
        
          for(int i = 0;i < rows; i++){
            for(int j = 0; j < cols; j++){
                
                int diagonalKey = i-j;
                
                PriorityQueue<Integer> pq = map.get(diagonalKey);
                mat[i][j] = pq.poll();
                
            }
        }
        
        return mat;
    }
}
