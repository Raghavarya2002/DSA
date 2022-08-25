class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] frequency = new int[26];
        for(char c : magazine.toCharArray()){
            frequency[(int)c - 97] += 1;
        }
        
        for(char c : ransomNote.toCharArray()){
            frequency[(int) c - 97] -= 1;
            if(frequency[(int) c -  97] < 0){
                return false;
            }
        }
        return true;
    }
}
