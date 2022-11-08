class Solution {
    
    // 1st Approach , TC: O(nlogn) 
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    
    // 2nd Approach , TC : O(nlogk)
     public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for(int el : nums){
            pq.offer(el);
            if(pq.size() > k){
                pq.poll();
            }
        }
         return pq.peek();
    }
    
    //3rd Approach  Worst case O(n2)
    // Best case O(n) => Quick Select technique
    public int findKthLargest(int[] nums, int k) {
        int start =0;
        int end = nums.length -1;
        int idx = nums.length-k;
        
        while(start<=end){
            int partitionIdx = partition(nums,start,end);
            if(partitionIdx == idx){
                return nums[idx];
            }else if(partitionIdx > idx){
                end = partitionIdx-1;
            }else if(partitionIdx < idx){
                start = partitionIdx + 1;
            }
        }
        return nums[start];
    }
    
    public void swap(int[] nums, int i, int j){
        if(i != j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    
    public int partition(int[] nums, int start, int end){
        int pivot = end;
        int i = start;
        int j = end;
        while(i<j){
            while(i < j && nums[i] <= nums[pivot]){
                i++;
            } 
            while(i < j && nums[j] >= nums[pivot]){
                j--;
            } 
            swap(nums,i,j);
        }
        swap(nums,i,pivot);
        return i;
    }
}
