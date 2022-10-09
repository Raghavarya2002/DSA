class Solution {
public:
    int threeSumClosest(vector<int>& nums, int t) {
        sort(nums.begin(),nums.end());
        int n=nums.size();
        int ans=0,as=INT_MAX;
        
        for(int i=0;i<n;i++){
            int hi=n-1,lo=i+1;
            while(hi>lo){
                int a=nums[hi]+nums[lo]+nums[i];
                if(abs(t-a)<as){
                    as=abs(t-a);
                    ans=a;
                }
                if(a<t)lo++;
                if(a>t)hi--;
                if(a==t)return a;
            }
        }
        return ans;
    }
};