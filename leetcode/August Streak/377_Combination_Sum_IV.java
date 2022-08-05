class Solution {
    int[] dp;
    public int combinationSum4(int[] nums, int target) {
        dp = new int[target + 1];
        Arrays.fill(dp, -1);
        return result(nums, target);
    }
    public int result(int[] nums, int target) {
        if (target < 0)
            return 0;
        if (target == 0)
            return 1;
        if (dp[target] != -1)
            return dp[target];
        int res = 0;
        for (int i = 0; i < nums.length; i++) 
            res += result(nums, target - nums[i]);
        dp[target] = res;
        return res;
    }
}
