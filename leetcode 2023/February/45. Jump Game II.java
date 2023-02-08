class Solution {

    // TC : O(n)
    // SC : O(1)
    public int jump(int[] nums) {
        int level =0;
        int divider = 0;
        int maxReachableIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(i> divider){
                level++;
                divider = maxReachableIndex;
            }
            maxReachableIndex = Math.max(maxReachableIndex, i +nums[i]);
        }

        return level;
    }

}
