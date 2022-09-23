class Solution {
    public int concatenatedBinary(int n) {
        int mod = 1000000007;
        int ans = 0;
        
        
        for(int i = 1;i <=n;i++){
            String str = Integer.toBinaryString(i);
        
            for(char c : str.toCharArray()){
                int val = (c == '0') ? 0 : 1;
                ans = ((ans*2)%mod  + val) % mod;
            }    
        }
        
        return ans;
    }
}
