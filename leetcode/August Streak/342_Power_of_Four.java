class Solution {
    public boolean isPowerOfFour(int n) {
    
        double ans = Math.log(n)/Math.log(4);
        return ans == (int)ans;
        
    }
}
