class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length,i,j,k,res=0,cumm,val;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(i=0;i<m;i++)
            for(j=1;j<n;j++)
                matrix[i][j]+=matrix[i][j-1];
        
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                cumm=0;
                map.clear();
                map.put(0,1);
                for(k=0;k<m;k++){
                    cumm+=matrix[k][j]-(i>0?matrix[k][i-1]:0);
                    val=cumm-target;
                    if(map.containsKey(val))
                        res+=map.get(val);
                    map.put(cumm,map.getOrDefault(cumm,0)+1);
                }
            }
        }
        return res;
    }
}
