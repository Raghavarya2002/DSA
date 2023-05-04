class Solution {
    public String predictPartyVictory(String senate) {
        
        Queue<Integer> qr = new LinkedList<Integer>();
        Queue<Integer> qd = new LinkedList<Integer>();
        
        int n = senate.length();
        
        for(int i = 0;i< n;i++){
            if(senate.charAt(i) == 'R'){
                qr.offer(i);
            }else{
                qd.offer(i);
            }
        }
        
        while(!qr.isEmpty() && !qd.isEmpty()){
            int r_id = qr.poll();
            int d_id = qd.poll();
            
            if(r_id < d_id){
                qr.offer(r_id+n);
            }else{
                qd.offer(d_id+n);
            }
        }
        
        return (qr.size() > qd.size()) ? "Radiant" : "Dire";
        
    }
}
