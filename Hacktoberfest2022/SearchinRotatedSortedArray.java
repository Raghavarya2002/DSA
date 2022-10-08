class Solution {
public:
    int getPivot(vector<int>& nums, int length){
        int s = 0;
        int e = length-1;
        int mid = s+ (e-s)/2;
        
        while(s<e){
            
            if(nums[mid] >= nums[0]){
                s = mid+1;
            }
            else{
                e = mid;
            }
            mid = s+ (e-s)/2;
        }
        return e;
        
    }
    
    
    int search(vector<int>& nums, int s, int e, int target){
        int mid = s +(e-s)/2;
        
        while(s<=e){
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid] > target){
                e = mid-1;
            }
            else{
                s = mid +1;
            }
            mid = s +(e-s)/2;
        }
        return -1;
    }
    
    
    int search(vector<int>& nums, int target) {
        int length = nums.size();
        int pivot = getPivot(nums,length);
        if( target >= nums[pivot] && target <= nums[length-1]){
            return search(nums, pivot, length-1, target);
        }
        else{
            return search(nums, 0, pivot-1, target);
        }
    }
};
