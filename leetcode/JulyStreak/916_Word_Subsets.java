class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        List<String> ans = new ArrayList<>();
        int[] maxfreqAcrossB = new int[26];
        
        for(String bstr : words2){
            int[] freqCountbstr = frequency(bstr);
            
            for(int i =0;i<26;i++){
                maxfreqAcrossB[i]= Math.max(maxfreqAcrossB[i],freqCountbstr[i]);
            }
        }
        
        
        for(String astr : words1){
            boolean matchedAll =true;
            int[] freqCountastr = frequency(astr);
            for(int i =0;i<26;i++){
                if(freqCountastr[i] < maxfreqAcrossB[i]){
                    matchedAll = false;
                    break;
                }
            }
            
            if(matchedAll){
                ans.add(astr);
            }
        }
        
        return ans;
    }
    
    private int[] frequency(String str){
        int[] freqCount = new int[26];
        for(char c : str.toCharArray()){
            freqCount[c-'a']++;
        }
        return freqCount;
    }
}
