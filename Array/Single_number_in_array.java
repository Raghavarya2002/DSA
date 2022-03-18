// 136. Single Number
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.
// Input: nums = [2,2,1]
// Output: 1
// Input: nums = [4,1,2,1,2]
// Output: 4
// leetcode
// basically we used the XOR operator because it  returns true if, and only if, the operands are different. So, for example, the XOR operator can be used when we have to check for two conditions that can't be true at the same time.

  class Solution {
    public int singleNumber(int[] nums) {
        
       int  result=0;
        for(int i =0;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
    }
}
