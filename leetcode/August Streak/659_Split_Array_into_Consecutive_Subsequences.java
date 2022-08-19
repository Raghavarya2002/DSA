class Solution {
public boolean isPossible(int[] nums) {
    
    HashMap<Integer,Integer> fmap=new HashMap<>();
    HashMap<Integer,Integer> hpmap=new HashMap<>();
    for(int i: nums)
    {
   
    fmap.put(i,fmap.getOrDefault(i,0)+1);
    }

    for(int i: nums)
    {
	
        if(fmap.get(i)<=0)
            continue;
		
        if(hpmap.getOrDefault(i,0)>0)
        {
		
            hpmap.put(i,hpmap.get(i)-1);
			
            hpmap.put(i+1,hpmap.getOrDefault(i+1,0)+1);
			
            fmap.put(i,fmap.getOrDefault(i,0)-1); 
        }
        else if(fmap.getOrDefault(i+1,0)>0 && fmap.getOrDefault(i+2,0)>0){
            
            fmap.put(i,fmap.get(i)-1);
            fmap.put(i+1,fmap.get(i+1)-1);
            fmap.put(i+2,fmap.get(i+2)-1);
            hpmap.put(i+3,hpmap.getOrDefault(i+3,0)+1);
        
        }
        else{
            return false;
        }
    }
    return true;
}
}
