class Solution {
    //Space optimized solution
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int index2[] = new int[2];
        int index1[] = new int[2];
        int curr[] = new int[2];

        for(int index = n-1;index >= 0;index--){
            
            curr[1] = Math.max( -prices[index] + index1[0] , 0 + index1[1]);
            
            curr[0] = Math.max( prices[index] + index2[1] ,  0 + index1[0]);

            index2 = (int [])(index1.clone());
            index1 = (int [])(curr.clone());

        }

        return curr[1];
    }
    
}
