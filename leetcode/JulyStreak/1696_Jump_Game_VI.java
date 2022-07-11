// 1696. Jump Game VI

class Solution {
    public int maxResult(int[] nums, int k) {
        
        if(nums.length == 0) return 0;
        //score,index
        Queue<int[]> pq = new PriorityQueue<>((a,b) -> (b[0]-a[0]));
        pq.offer(new int[]{nums[0],0});
        int maxScore = nums[0];
        for(int i = 1;i<nums.length;i++){
            while(!(i-pq.peek()[1] <= k)){
                pq.poll();
                
            }
            int[] current = pq.peek();
            maxScore = current[0] + nums[i];
            pq.offer(new int[]{maxScore,i});
        }
        
        return maxScore;
    }
}
