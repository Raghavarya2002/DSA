 #include<iostream>
 #include<climits>
 using namespace std;

 //Brute force =TLE -O(N^2)
 
 class Solution{
    public:
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long long maxSubarraySum(int arr[], int n){
        
        int maxSum = INT_MIN;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                  sum+=arr[k];
                 
                }
                maxSum = max(sum,maxSum);
            }
        }
        return maxSum;
    }
};

//Kadene's Algorithm O(N)

class Solution{
    public:
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long long maxSubarraySum(int arr[], int n){
        
        int maxSum = INT_MIN;
        int curr = 0;
        
        for(int i=0;i<n;i++){
            curr+= arr[i];
            
            if(curr> maxSum){
                maxSum = curr;
            }
            
            if(curr<0){
                curr = 0;
            }
        }
        return maxSum;
    }
};