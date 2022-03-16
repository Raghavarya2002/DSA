// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

// leetcode


class Solution {
    public boolean isPalindrome(String s) {
        String fixed_string = "";
        
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                fixed_string += c;
            }
        }
        
        fixed_string = fixed_string.toLowerCase();
        
        int a_pointer = 0;
        int b_pointer = fixed_string.length()-1;
        
        while(a_pointer <= b_pointer){
            if(fixed_string.charAt(a_pointer) != fixed_string.charAt(b_pointer)){
                return false;
            }
            
            a_pointer +=1;
            b_pointer -=1;
        }
        return true;
    }
}
