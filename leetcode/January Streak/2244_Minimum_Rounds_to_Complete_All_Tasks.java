class Solution {
    public int minimumRounds(int[] tasks) {
        // Using a hashMap to store the frequency 
        Map<Integer,Integer> m = new HashMap<>();
        for(int task:tasks){
            // storing the frequency using getOrDefault (it's a function from Property class )
            m.put(task,m.getOrDefault(task,0)+1);
        }
        // to maintain the total round count taking one variable
        int rounds = 0;
        for(int value:m.values()){
            // if the frequency is 1 then we can't group( Ref. Example 2) 
            if(value==1)
                return -1;
            // else we are trying to complete 3 tasks at a time because maximum we can solve 3 tasks
            rounds+=(value/3);
            // anything is remaining that should be 2 or 1 
            /* If it's 2 then we can solve 2 tasks at a time 
               so simply we can do rounds++*/

                //If it's 1 then we will backtrack and we should  
                // have 1+3 = 4 tasks , we can solve it by 2-->2 i.e 
                //rounds +=2 but we had backtracked once so 
                //rounds+=(2-1) again that it rounds++;
            if(value%3>0)
            rounds++;
        }
        return rounds;
    }
}
