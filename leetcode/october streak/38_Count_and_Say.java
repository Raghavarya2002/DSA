class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i = 1;i<n;i++){
            s = countandsayhelper(s);
        }
        
        return s;
    }
    
    public String countandsayhelper(String s){
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        int count = 1;
        
        for(int i =1;i<s.length();i++){
            if(s.charAt(i) == prev){
                count++;
            }else{
                sb.append(count);
                sb.append(prev);
                prev = s.charAt(i);
                count =1;
            }
        }
        
        sb.append(count);
        sb.append(prev);
        
        
        return sb.toString();
    }
}
