class Solution {
    public boolean isAnagram(String s, String t) {
	    if(s.length() != t.length()) return false;
		
        // map for character to frequency-count
        Map<Character, Integer> map = new HashMap<>();
		
        for(int i = 0; i < s.length(); ++i) {
		    // increase frequency-count of char from 's'
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
			// decrease frequency-count of char from 't'
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0) - 1);
        }

        // check for frequency-count mismatch
        for(char ch : map.keySet())
            if(map.get(ch) != 0) return false;
        
        return true;
    }
}```
