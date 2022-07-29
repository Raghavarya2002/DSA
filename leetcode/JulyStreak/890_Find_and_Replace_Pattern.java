class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        String str = fun(pattern);
        
        List<String> ans = new ArrayList<String>();
        for(String word : words){
            if(str.equals(fun(word))){
                ans.add(word);
            }
        }
        
        return ans;
    }
    
    public String fun(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        int length = str.length();
        String ans = "";
        
        for(int i =0;i<str.length();i++){
            hm.putIfAbsent(str.charAt(i),hm.size());
            ans += hm.get(str.charAt(i));
        }
        return ans;
    }
}
