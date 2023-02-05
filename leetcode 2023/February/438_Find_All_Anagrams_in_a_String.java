class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        
        int unmatchingcharcount = p.length();
        
        if(p.length() > s.length()){
            return ans;
        }
        
        int[] freq = new int[26];
        for(int i =0;i<p.length();i++){
            int idx = p.charAt(i) - 'a';
            freq[idx]++;
        }
        
        int start = 0;
        int end = 0;
        for(; end < p.length();end++){
            int idx = s.charAt(end)-'a';
            if(freq[idx] > 0){
                unmatchingcharcount--;
            }
            freq[idx]--;
        }
        if(unmatchingcharcount == 0){
            ans.add(start);
        }
        
        for(;end < s.length();){
            int idxstart = s.charAt(start)-'a';
            if(freq[idxstart] >= 0){
                unmatchingcharcount++;
            }
            freq[idxstart]++;
            start++;
            
            int idxend = s.charAt(end)-'a';
            if(freq[idxend] > 0){
                unmatchingcharcount--;
            }
            freq[idxend]--;
            if(unmatchingcharcount == 0){
                ans.add(start);
            }
            end++;
        }
        return ans;
    }
}
