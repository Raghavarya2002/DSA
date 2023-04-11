class Solution {
    public String removeStars(String s) {
        String ans="";
        int countStar=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*') 
                countStar++;
            else if(countStar==0) 
                ans=s.charAt(i)+ans;
            else countStar--;
        }
        return ans;
    }
}
