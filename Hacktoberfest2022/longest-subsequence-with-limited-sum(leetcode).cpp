#define ll long long
class Solution {
public:
    vector<int> answerQueries(vector<int>& nums, vector<int>& queries) {
        int n=nums.size();
        sort(nums.begin(),nums.end());
        vector<ll>pre(n,0);
        pre[0]=nums[0];
        for(int i=1;i<nums.size();i++){
            pre[i]=pre[i-1]+nums[i];
        }
        vector<int>ans;
        for(auto it:queries){
            int ind=upper_bound(pre.begin(),pre.end(),it)-pre.begin();
            ans.push_back(ind);
        }
        return ans;
        
    }
};
