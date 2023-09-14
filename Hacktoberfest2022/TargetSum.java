import java.util.*;

public class TargetSum{

    public static void main(String []args){
        int []array=new int[]{1,1,1,1,1};
        int targetSum=3;
        System.out.println(findTargetSumCount(array,targetSum));
        System.out.println(findTargetSumCount1D(array,targetSum));
        System.out.println(findTargetSumCount2D(array,targetSum));
    }
    
    //Brute force
    //Time complexity: O(2^n)
    //Space complexity: O(n)
    static int count;
    public static int findTargetSumCount(int[] nums, int targetSum) {
        count=0;
        findWays(nums, 0, 0, targetSum);
        return count;
    }
    
    public static void findWays(int[] nums, int idx, int sum, int targetSum) {
        if (idx == nums.length) {
            //target sum equals sum increment count
            if (sum == targetSum) {
                count++;
            }
        } else {
            //else generate both possibilities by adding and subtracting current number
            findWays(nums, idx + 1, sum + nums[idx], targetSum);
            findWays(nums, idx + 1, sum - nums[idx], targetSum);
        }
    }

   //using dynamic programming
   //Time complexity: O(totalSum*n)
   //Space complextiy:O(totalSum*n)
    public static int findTargetSumCount2D(int[] nums, int targetSum) {
        int totalSum = Arrays.stream(nums).sum();
        int[][] dp = new int[nums.length][2 * totalSum + 1];
        dp[0][nums[0] + totalSum] = 1;
        dp[0][-nums[0] + totalSum] += 1;
        
        for (int i = 1; i < nums.length; i++) {
            for (int sum = -totalSum; sum <= totalSum; sum++) {
                if (dp[i - 1][sum + totalSum] > 0) {
                    dp[i][sum + nums[i] + totalSum] += dp[i - 1][sum + totalSum];
                    dp[i][sum - nums[i] + totalSum] += dp[i - 1][sum + totalSum];
                }
            }
        }
        
        return Math.abs(targetSum) > totalSum ? 0 : dp[nums.length - 1][targetSum + totalSum];
    }

    //using dynamic programming
    //Time complexity: O(totalSum*n)
    //Space complexity: O(totalSum)
     public static int findTargetSumCount1D(int[] nums, int targetSum) {
        int total = Arrays.stream(nums).sum();
        int[] dp = new int[2 * total + 1];
        dp[nums[0] + total] = 1;
        dp[-nums[0] + total] += 1;
        
        for (int i = 1; i < nums.length; i++) {
            int[] next = new int[2 * total + 1];
            for (int sum = -total; sum <= total; sum++) {
                if (dp[sum + total] > 0) {
                    next[sum + nums[i] + total] += dp[sum + total];
                    next[sum - nums[i] + total] += dp[sum + total];
                }
            }
            dp = next;
        }
        
        return Math.abs(targetSum) > total ? 0 : dp[targetSum + total];
    }


}