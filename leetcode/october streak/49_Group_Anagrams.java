//TC : O(n * length)
//SC: O(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            String key = buildKey(s);
            List<String> ls = map.getOrDefault(key,new ArrayList<>());
            ls.add(s);
            map.put(key,ls);
        }
        return new ArrayList<>(map.values());
    }
    
    private String buildKey(String str){
        char[] keychar = new char[26];
        for(char c : str.toCharArray()){
            keychar[c-'a']++;
        }
        return new String(keychar);
    }
}
