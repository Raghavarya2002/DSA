class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> ls = new ArrayList<>();
        if(n == 1){
            ls.add(0);
        }
        NumbersWithSameConsecutiveDifferences(n,k,ls,0);
        int[] result = new int[ls.size()];
        for(int i =0;i< ls.size();i++){
            result[i] = ls.get(i);
        }
        
        return result;
    }
    
    private void NumbersWithSameConsecutiveDifferences(int n,int k,List<Integer> ls, int curr){
        if(n <= 0){
            ls.add(curr); //loop out of the recursion
            return;
        }
        
        for(int i = 0;i< 10;i++){
            if(i == 0 && curr == 0){ //skip the case of leading 0
                continue;
            }else if(i != 0 && curr == 0){
                NumbersWithSameConsecutiveDifferences(n-1,k,ls,i);
            }else if(Math.abs(curr%10 -i) == k){
                NumbersWithSameConsecutiveDifferences(n-1,k,ls,curr * 10 + i);
            }
        }
    }
}
