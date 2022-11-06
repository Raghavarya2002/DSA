class Solution {
    public String orderlyQueue(String s, int k) {
        if(k == 0){
            return s;
        }else if(k > 1){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }else if(k == 1){
            String res = s;
            for(int i =0; i< s.length();i++){
                String reOrdered = s.substring(i) + s.substring(0,i);
                if(res.compareTo(reOrdered) > 0){
                    res = reOrdered;
                }
            }
            
            return res;
        }
        return s;
    }
}
