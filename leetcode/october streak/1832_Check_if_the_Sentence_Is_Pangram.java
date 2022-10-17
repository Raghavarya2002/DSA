class Solution {
    public boolean checkIfPangram(String sentence) {
         String[] alp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> al = new ArrayList<>(Arrays.asList(alp));     
        for(String ch:al){
            if(sentence.indexOf(ch)<0){
                return false;
            }
        }
        return true;
    }
}

//leetcode is not working, idk
