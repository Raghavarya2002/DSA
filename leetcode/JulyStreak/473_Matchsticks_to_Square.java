class Solution {
    public boolean makesquare(int[] matchsticks) {
        int peri = 0;
        for(int i : matchsticks){
            peri += i;
        }
        
         if(peri % 4 != 0) return false;
        
        if(matchsticks.length < 4) return false;
        
        
        
        
        int side = peri/4;
        
        int[] sides = new int[]{side,side,side,side};
        Arrays.sort(matchsticks);
        return makesquareresult(matchsticks,matchsticks.length-1,sides); 
        
    }
    
    private boolean makesquareresult(int[] matchsticks, int idx, int[] sides){
       
        if(idx == -1){
            return allZero(sides);
        }
        
        for(int i =0;i<sides.length;i++){
            if(matchsticks[idx] <= sides[i]){
                sides[i] -= matchsticks[idx];
                if(makesquareresult(matchsticks,idx -1,sides)) return true;
                
                sides[i] += matchsticks[idx];
            }
        }
        
        return false;
   
    }
    
    
    private boolean allZero(int[] sides){
        for(int i =0;i<sides.length;i++){
            if(sides[i] > 0){
                return false;
            }
           
            
        }
         return true;
    }
}


        
 
