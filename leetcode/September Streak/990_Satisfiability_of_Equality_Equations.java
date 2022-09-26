class Solution {
    public boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];
        for(int i =0;i<26;i++){
            parent[i] = i;
        }
        
        for(String equation : equations){
            char equality = equation.charAt(1);
            if(equality == '='){
                int var1 = fetchParent(equation.charAt(0)-'a',parent);
                int var2 = fetchParent(equation.charAt(3)-'a',parent);
                
                if(var1 != var2){
                    parent[var2] = var1;
                }
            }
        }
        
        for(String equation : equations){
            char equality = equation.charAt(1);
            if(equality == '!'){
                 int var1 = fetchParent(equation.charAt(0)-'a',parent);
                int var2 = fetchParent(equation.charAt(3)-'a',parent);
                if(var1 == var2){
                   return false;
                }
            }
        }
        return true;
        
    }
    
    public int fetchParent(int index,int[] parent){
        if(parent[index] == index)
            return index;
        return fetchParent(parent[index],parent);
    }
}
