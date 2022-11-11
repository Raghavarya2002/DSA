class Solution {
    public int removeDuplicates(int[] nums) {
       int actual=1,i=1,j=0;
       while(i<nums.length){
           if(nums[i]==nums[actual-1]){
               i++;
           }
           else{
               nums[actual]=nums[i];
               actual++;
               i++;
           }
       }
       return actual; 
    }
}
