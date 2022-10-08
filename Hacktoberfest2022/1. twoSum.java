class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                ans = new int[]{map.get(nums[i]), i};
                break;
            }else{
                map.put(target - nums[i], i);
            }
        }
        return ans;
    }
}
