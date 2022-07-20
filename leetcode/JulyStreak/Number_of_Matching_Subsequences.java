class Solution {
    public int numMatchingSubseq(String S, String[] words) {
        Map<Character , Queue<String>> map = new HashMap<>();
        int ans =0;
        
        for(int i = 0;i< S.length();i++){
            map.putIfAbsent(S.charAt(i) , new LinkedList<>());
            
        }
        
        for(String word : words){
            char startingchar = word.charAt(0);
            if(map.containsKey(startingchar)){
                map.get(startingchar).offer(word);
            }
        }
        
        for(int i = 0;i<S.length();i++){
            char startingchar = S.charAt(i);
            Queue<String> que = map.get(startingchar);
            int size = que.size();
            for(int j =0;j<size;j++){
                String str = que.poll();
                if(str.substring(1).length() == 0){
                    ans++;
                }else{
                    if(map.containsKey(str.charAt(1))){
                        map.get(str.charAt(1)).add(str.substring(1));
                    }
                }
            }
        }
        
        
        
        return ans;
    }
}
