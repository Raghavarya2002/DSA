#define ll long long
class Solution {
public:
    int garbageCollection(vector<string>& garbage, vector<int>& travel) {
        int n=garbage.size();
        vector<ll>pre(n,(ll)0);
        int k=1;
        for(int i=1;i<=travel.size();i++){
            pre[i]=pre[i-1]+travel[i-1];
        }
        ll g_las=0,p_las=0,m_las=0,g_time=0,p_time=0,m_time=0;
        for(int i=0;i<n;i++){
            string temp=garbage[i];
            int g=count(temp.begin(),temp.end(),'G');
            int p=count(temp.begin(),temp.end(),'P');
            int m=count(temp.begin(),temp.end(),'M');
            if(g>0){
                g_time+=g;
                g_time+=pre[i]-pre[g_las];
                g_las=i;
            }
            if(p>0){
                p_time+=p;
                p_time+=pre[i]-pre[p_las];
                p_las=i;
            }
            if(m>0){
                m_time+=m;
                 m_time+=pre[i]-pre[m_las];
                m_las=i;
            }
        }
        ll ans=g_time+m_time+p_time;
        return ans;
        
    }
};
