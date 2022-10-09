class Solution {
public:
    int removeElement(vector<int>& v, int val) {
        int j = 0;
        for(int i = 0; i<v.size(); i++)
        {
            if(v[i]!=val)
            {
                v[j] = v[i];
                j++;
            }
            
        }
        return j;
    }
};