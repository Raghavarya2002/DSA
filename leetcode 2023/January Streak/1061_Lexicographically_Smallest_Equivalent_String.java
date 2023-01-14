class Solution {
    int []parent;
    int []rank;
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        
        parent = new int[26];
        rank = new int[26];
        for(int i=0;i<26;i++){
            parent[i]=i;
        }

        for(int i=0;i<s2.length();i++){
            
            int x = s1.charAt(i)-'a';
            int y = s2.charAt(i)-'a';
            
            int xl = find(x);
            int yl = find(y);
            if(xl != yl){
                union(xl,yl);
            }
        }

        int []charArray = new int[26];
        for(int i=0;i<26;i++){
            charArray[i] = find(i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<baseStr.length();i++){
            sb.append((char)(charArray[baseStr.charAt(i)-'a']+97));
        }
        return sb.toString();
    }
    private int find(int x){
        if(parent[x] == x){
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    private void union(int x, int y){
        if(x < y){
            parent[y] = x;
        }
        else{
            parent[x] = y;
        }
    }
}
