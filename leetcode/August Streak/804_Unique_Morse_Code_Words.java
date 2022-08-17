class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> str = new HashSet<>();
        
        String[] arr = new String[]{
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        
        for(String word: words){
            StringBuilder st = new StringBuilder();
            for(char c : word.toCharArray()){
                int index = c - 'a';
                st.append(arr[index]);
            }
            str.add(st.toString());
        }
        
        return str.size();
    }
}
