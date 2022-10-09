import java.util.*;

public class LongestValidParentheses {

	public static void main(String[] args) {
		String str=")()())";
		System.out.println(longestValidParenthesesRecursion(str));
        System.out.println(longestValidParentheses1D(str));
        System.out.println(longestValidParentheses(str));
	}
	
	//using recursion
	//Time complexity: O(n^3)
	//Space complexity: O(n)
	 public static boolean isValid(String str) {
	        Stack<Character> stack = new Stack<Character>();
	        int n=str.length();
            //check if parantheses are balanced or not
	        for (int i = 0; i < n; i++) {
	            if (str.charAt(i) == '(') {
	                stack.push('(');
	            } else if (!stack.empty() && stack.peek() == '(') {
	                stack.pop();
	            } else {
	                return false;
	            }
	        }
	        return stack.empty();
	    }

	    public static int longestValidParenthesesRecursion(String str) {
	        int ans = 0;
	        int n=str.length();
	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 2; j <= str.length(); j+=2) {
                    //checking if every substring from i to j-1 is valid or not
	                if (isValid(str.substring(i, j))) {
	                    ans = Math.max(ans, j - i);
	                }
	            }
	        }
	        return ans;
	    }

	//using dynamic programming 
	//Time complexity: O(n)
	//Space complexity: O(n)
	public static int longestValidParentheses1D(String str) {
        int n=str.length();
        int ans=0;
        int []dp=new int[n];
        for(int i=1;i<n;i++){
            if(str.charAt(i)==')'){
                if(str.charAt(i-1)=='('){
                    dp[i]=i-2>=0?dp[i-2]+2:2;
                }
                else{
                    if(i-dp[i-1]-1>=0&&str.charAt(i-dp[i-1]-1)=='('){
                        dp[i]=dp[i-1]+2+((i-dp[i-1]-2)>=0?dp[i-dp[i-1]-2]:0);
                    }
                }
            }
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
	
	//using dynamic programming
	//Time complexity:O(n)
	//space complexity:O(1)
	public static int longestValidParentheses(String str) {
        int left = 0, right = 0, ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                ans = Math.max(ans, 2 * right);
            } else if (right >= left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                ans = Math.max(ans, 2 * left);
            } else if (left >= right) {
                left = right = 0;
            }
        }
        return ans;
    }
}
