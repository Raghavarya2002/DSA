class Solution {
    public int maxPoints(int[][] points) {
        
        if(points.length <= 0) return 0;
        if(points.length <= 2) return points.length;
        
        int max = 0;
        for(int[] points1 : points){
            //slope , no. of points that hae same slope value passing through point1
            Map<Double, Integer> map = new HashMap<>();
            
            
            for(int[] points2 : points){
                if(points1 == points2) continue;
                
                double slope = 0;
                
                //if x1 = x2 then it means the line is vertical
                if(points1[0] == points2[0]){
                    slope = Double.POSITIVE_INFINITY;
                }else{
                    //slope m = (y2-y1)/(x2-x1) 
                    slope = (points2[1] - points1[1])/ (double)(points2[0] - points1[0]);
                }
                map.put(slope, map.getOrDefault(slope,0) + 1);
                if(map.get(slope) > max){
                    max = map.get(slope);
                }
            }
        }
        return max+1;
    }
}
