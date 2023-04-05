class Solution {
    public int minimizeArrayValue(int[] nums) {
        long sum = 0, res = 0;
        
        for(int i = 0; i< nums.length;i++){
            sum += nums[i];
            res = Math.max(res, (sum + i)/(i+1));
        }
        
        return (int)res;
    }
}
