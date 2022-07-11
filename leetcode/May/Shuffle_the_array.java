class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for(int i =0;i<n*2;i++){
           result[i] = i%2==0 ? nums[i/2]:nums[n+i/2];
        }
        return result;
    }
}
