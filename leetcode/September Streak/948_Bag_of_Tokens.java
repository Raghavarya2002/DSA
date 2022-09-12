class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0;
        int j=tokens.length-1;
        int score=0;
        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i];
                score++;
                i++;
            }else if(i<j&&score>0){
                power+=tokens[j];
                j--;
                score--;
            }else{
                break;
            }
        }
        return score;
    }
}
