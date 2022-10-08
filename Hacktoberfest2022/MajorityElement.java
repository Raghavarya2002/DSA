class Solution {
    public int majorityElement(int[] nums) {
        int curr_Elem = 0;
        int count = 0;
        for (int element: nums){
            if(count == 0){
                curr_Elem = element;
            }
            if(element == curr_Elem){
                count++;
            }
            else count--;
        }
        return curr_Elem;
    }
}
