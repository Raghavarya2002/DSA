class Solution {
    class Job {
        int start;
        int end;
        int profit;
        
        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }
    
    /*
    *   Approach: 
    *   1. Sort the jobs based pn the start time (or end time if start times are the same for any two jobs)
    *   2.1. Recursively, either pick the current job (index i) and go to the next available job (index j) or
    *   2.2. Skip current job (index i) and go to the next job (i + 1)
    *   3. Take the max of the above two recursive steps
    */
    public int jobScheduling(int[] start, int[] end, int[] profit) {
        int n = start.length;
        Job[] jobs = new Job[n];
        int[] dp = new int[n];
        
        for(int i = 0 ; i < n ; i++) {
            // Create the custom Job object for sorting and easy access
            jobs[i] = new Job(start[i], end[i], profit[i]);
            // Initialize the DP array
            dp[i] = -1;
        }
            
        // Sort the jobs based on start time
        Arrays.sort(jobs, (a, b) -> a.start == b.start ? a.end - b.end : a.start - b.start);
        
        // Call the helper for the max profit
        return helper(jobs, dp, 0);
    }
    
    public int helper(Job[] jobs, int[] dp, int i) {
        if(i >= jobs.length)
            return 0;
        
        if(dp[i] != -1)
            return dp[i];
        
        int j = i + 1;
		
        // Find the next job that can be scheduled, this will be a job with start time strictly greater than the end time of current job
        while(j < jobs.length && jobs[j].start < jobs[i].end)
			j++;
        
        return dp[i] = Math.max(helper(jobs, dp, j) + jobs[i].profit, helper(jobs, dp, i + 1));
    }
}
