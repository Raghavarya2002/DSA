// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].    






class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i =0;i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[1] = i;
                result[0] = map.get(target-nums[i]);
                return result;
            }
             map.put(nums[i],i);
        }
       
        return result;
    }
}
