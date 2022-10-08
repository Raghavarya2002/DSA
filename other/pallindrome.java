class Solution {
    
    public boolean isPalindrome(int x) {
      boolean flag = true;
        if(x<0){
            flag = false;
        }
        
        else{
            int rev =0;
            int temp=x;
            while(x!=0){
                rev = rev*10 + (x%10);
                x/=10;
            
        }
            if(rev!=temp){
                flag = false;
            }
            
        }
        return flag;
        
        
    }
}
