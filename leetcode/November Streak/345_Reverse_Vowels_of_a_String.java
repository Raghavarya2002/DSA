//TC: O(n)
// SC : O(1)

class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        
        int i =0; int j = s.length() -1;
        
        StringBuilder sb = new StringBuilder(s);
        
        while(i<j){
        
        while(i < j && !set.contains(s.charAt(i))){
            i++;
        }
        
        while(i < j && !set.contains(s.charAt(j))){
            j--;
        }
        
        
        sb.setCharAt(i,s.charAt(j));
        sb.setCharAt(j,s.charAt(i));
        
        i++;
        j--;
        
    }
    
    return sb.toString();
    
    }
}
