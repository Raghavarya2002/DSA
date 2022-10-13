// Minimize XOR: https://leetcode.com/problems/minimize-xor/
// Author: vrintle

/*

Problem statement
-----------------

Given two positive integers num1 and num2, find the integer x such that:

x has the same number of set bits as num2, and
The value x XOR num1 is minimal.
Note that XOR is the bitwise XOR operation.

Return the integer x. The test cases are generated such that x is uniquely determined.

The number of set bits of an integer is the number of 1's in its binary representation.

*/

class Solution {
public:
    int minimizeXor(int num1, int num2) {
        int ans = 0, cnt = __builtin_popcount(num2);
        for(int b = 31; b >= 0; b--) {
            if(num1 & (1 << b)) {
                if(cnt) cnt--, ans |= 1 << b;
            }
        }
        for(int b = 0; b < 32; b++) {
            if(!(num1 & (1 << b)) && !(ans & (1 << b)) && cnt) {
                cnt--;
                ans |= 1 << b;
            }
        }
        return ans;
    }
};
