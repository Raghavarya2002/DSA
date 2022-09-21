class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) 
    {
        int arr[] = new int[nums.length];
        int sum = sumOfArray(nums);
        int i=0;
        for(int query[]:queries)
        {
            if(nums[query[1]]%2==0)
                sum-=nums[query[1]];
            nums[query[1]]+=query[0];
            if(nums[query[1]]%2==0)
                sum+=(nums[query[1]]);
            arr[i++]=sum;
        }
        return arr;
    }
    public int sumOfArray(int arr[])
    {
        int sum=0;
        for(int a:arr)
        {
            if(a%2==0)
                sum+=a;
        }
        return sum;
    }
}
