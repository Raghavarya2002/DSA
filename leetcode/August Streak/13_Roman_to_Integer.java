class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int ans =0;
        
        for(int i = s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            int currNo = map.get(c);
            if(i != s.length()-1){
                char nextchar = s.charAt(i+1);
                 if(c == 'I' && ((nextchar == 'V') || (nextchar == 'X'))){
                     ans -= currNo;
                 }else if(c == 'X' && ((nextchar == 'L') || (nextchar == 'C'))){
                     ans -= currNo;
                 }else if(c == 'C' && ((nextchar == 'M') || (nextchar == 'D'))){
                      ans -= currNo;
                 }else{
                     ans += currNo;
                 }
            }else{
                ans += currNo;
            }
        }
        return ans;
        
    }
}
