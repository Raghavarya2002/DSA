class Solution {
    
    private Map<String,Long> map =new HashMap<>();
    private int Mod = 1000000007;
    
    public int countVowelPermutation(int n) {
        long total =0;
        
        char[] charset = new char[]{'a','e','i','o','u'};
        for(char c : charset){
            total = (total + helper(n-1,c))%Mod;
        }
        return (int)total;
    }
    
    
    public long helper(int remainchar , char prevchar){
        if(remainchar == 0) return 1;
        String key = ""+ remainchar + prevchar;
        if(map.containsKey(key)) return map.get(key);
        long total =0;
        switch(prevchar){
            case 'a' : total = (helper(remainchar -1,'e')) % Mod;
                break;
            case 'e' : total = (helper(remainchar -1,'a') + helper(remainchar -1,'i')) % Mod;
                break;
            case 'i' : total = (helper(remainchar -1,'a') + helper(remainchar -1,'e') + helper(remainchar -1,'o') + helper(remainchar -1,'u')) % Mod;
                break;
            case 'o' : total = (helper(remainchar -1,'i') + helper(remainchar -1,'u')) % Mod;
                break;
            case 'u' : total = (helper(remainchar -1,'a')) % Mod;
                break;
                    
        }
        
        map.put(key,total);
        return total;
    }
}
