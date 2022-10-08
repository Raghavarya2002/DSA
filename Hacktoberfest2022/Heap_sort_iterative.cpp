//Code to sort an array using Heap Sort
// Time complexity is O(NLogN)
//Space Compplexity is O(N)
#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    void HeapSort(vector<int>& nums)
    {
        for(int i=nums.size()/2;i>=0;i--)
        {
            heapify(nums,i,nums.size()-1);
        }
        for (int i = nums.size() - 1; i >= 0; i--)
        {
            swap(nums[0],nums[i]);
            heapify(nums, 0, i - 1);
        }
    }
    void heapify(vector<int>& nums,int s,int e)
    {
        while(s<=e)
        {
            int l = 2 * s + 1;
            int r = 2 * s + 2;
            int maxIndex = s;
            if (l <= e && nums[l] > nums[maxIndex])
            {
                maxIndex = l; 
            }
            if (r <= e && nums[r] > nums[maxIndex])
            {
                maxIndex = r;
            }
            if (maxIndex == s) break;  
            swap(nums[s],nums[maxIndex]); 
            s = maxIndex; 
        }
    }
    vector<int> sortArray(vector<int>& nums) {
        if(nums.size()<=1) return nums;
        HeapSort(nums);
        return nums;
        
    }
};