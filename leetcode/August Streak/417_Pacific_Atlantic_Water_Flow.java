class Solution {
    
    private static int MAX_NUM = 1_000000;
    private static int MASK_PACIFIC = 2;
    private static int MASK_ATLANTIC = 4;
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        
        // search FROM ocean squares UPWARDS
        // put reachability flag for both oceans in input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {        
                if (i == 0 || j == 0) 
                    search(heights, i, j, 0, MASK_PACIFIC);
                if (i == n-1 || j == m-1)
                    search(heights, i, j, 0, MASK_ATLANTIC);
            }
        }
        
        // add square to result if reachable from both oceans
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int res = heights[i][j] / MAX_NUM;
                if (res == (MASK_PACIFIC | MASK_ATLANTIC)) result.add(List.of(i, j));
            }
        }
        return result;
    }
    
    private void search(int[][] heights, int x, int y, int prevH, int mask) {
        if (x >= heights.length || x < 0 || y < 0 || y >= heights[0].length) return;
        
        int h = heights[x][y] % MAX_NUM;
        int reachable =  heights[x][y] / MAX_NUM;
        
        if (h < prevH) return; // must jump UP or stay at current level
        
        if ((reachable & mask) > 0) return;
        //System.out.println("visit ["+x+","+y+"] with mask "+mask+"; "+reachable+" -> "+ (reachable | mask));
        reachable = reachable | mask;

        heights[x][y] = reachable * MAX_NUM + h;
 
        search(heights, x,y-1, h, mask);
        search(heights, x,y+1, h, mask);
        search(heights, x+1,y, h, mask);
        search(heights, x-1,y, h, mask);
        
    }
}
