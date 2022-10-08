class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
	// The idea is to use two pointers that would come close to each other in each iteration, thus the array 
	// has to be sorted first. 
        Arrays.sort(nums);
        List<List<Integer>> answer = new LinkedList<>();
		
// The loop end at nums.length - 2, because we need to find three elements, so preventing index outOfbounds error. 
        for(int i = 0; i < nums.length - 2; i++)
        {
		// We will proceed only when the ith element is not same as (i-1)th element. Since, we need to give unique pairs. 
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1]))
            {
                int low = i + 1;
                int high = nums.length - 1;
                while(low < high)
                {
                    if((nums[low] + nums[high] + nums[i]) == 0)
                    {
                         answer.add(Arrays.asList(nums[i], nums[low], nums[high]));
						// Two while loops to handle the duplicate elements for low and high. 
                         while(low < high && nums[low] == nums[low + 1])low++;
                         while(low < high && nums[high] == nums[high - 1])high--;
						 // Once we are assured the next elements of each pointers are not same, moving ahead. 
                         low++;
                         high--;
                    }
                    else if(nums[low] + nums[high] + nums[i] > 0)
                    {
                        high--;
                    }
                    else
                    {
                        low++;
                    }
                }
            }
        }
        return answer;
    }
}
