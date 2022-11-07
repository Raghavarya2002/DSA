Solution 1

Algorithm:
    - Flip the first 6 to a 9
    1. Convert num to char array
    2. Iterate the char array and find the first '6'
    3. Change that '6' to a '9'
    4. Convert the char array to an Integer.

class Solution {
    public int maximum69Number (int num) {
        
        return Integer.valueOf(Integer.toString(num).replaceFirst("6","9"));
        
    }
}
