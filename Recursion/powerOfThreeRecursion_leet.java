class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n>1){
        return n%3==0 && isPowerOfThree(n/3);
        }
        else
           return false;
    }
}
