class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<Integer>();
        int length = words[0].length();
        
        Map<String,Integer> map = new HashMap<String,Integer>();
        
        for(String word : words){
            map.put(word,map.getOrDefault(word,0) +1);
        }
        
        for(int i = 0;i<=s.length()-length*words.length;i++){
            Map<String,Integer> duplicateMap = new HashMap<String,Integer>(map);
            
            for(int j =0;j<words.length;j++){
                String str = s.substring(i + j*length, i + j*length + length);
                
                if(duplicateMap.containsKey(str)){
                    int count = duplicateMap.get(str);
                    if(count == 1) duplicateMap.remove(str);
                    else duplicateMap.put(str,count-1);
                    if(duplicateMap.isEmpty()){
                        ans.add(i);
                        break;
                    }
                }else{
                        break;
                    }
            }
        }
        
        return ans;
        
    }
}
