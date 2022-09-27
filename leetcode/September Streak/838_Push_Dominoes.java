//TC: O(n)
//SC: O(n)
class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] left = new int[n];
        int nearestLeftIndex = -1;
        for(int i =n-1;i>=0;i--){
            char c = dominoes.charAt(i);
            if(c == 'L'){
                nearestLeftIndex = i;
            }else if(c == 'R'){
                nearestLeftIndex = -1;
            }
            left[i] = nearestLeftIndex;
        }
        
        int [] right = new int[n];
        int nearestRightIndex = -1;
        
        for(int i = 0;i<n;i++){
            char c = dominoes.charAt(i);
            if(c == 'L'){
                nearestRightIndex = -1;
            }else if(c == 'R'){
                nearestRightIndex = i;
            }
            
            right[i] = nearestRightIndex;
        }
        
        char[] res = new char[n];
        for(int i =0;i<n;i++){
            if(dominoes.charAt(i) == '.'){
                int nearestLeft = left[i];
                int nearestRight = right[i];
                
                int leftDiff = nearestLeft == -1 ? Integer.MAX_VALUE : Math.abs(nearestLeft -i);
                int rightDiff = nearestRight == -1 ? Integer.MAX_VALUE : Math.abs(nearestRight -i);
                
                if(leftDiff == rightDiff){
                    res[i] = '.';
                }else if(leftDiff < rightDiff){
                    res[i] = 'L';
                }else if(leftDiff > rightDiff){
                    res[i] = 'R';
                }
            }else{
                res[i] = dominoes.charAt(i);
            }
        }
        return new String(res);
    }
}
