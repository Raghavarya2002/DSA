class Solution {
    public int minDeletionSize(String[] strs) 
    {
        int len = strs.length;
        int wordlen = strs[0].length();
        int ans = 0;
        
        for(int i=0; i<wordlen; i++)
        {
            char prev = strs[0].charAt(i);
            for(int j=1; j<len; j++)
            {
                char ch = strs[j].charAt(i);
                // System.out.println(prev + " > " + ch + " = " + (ch<prev));
                if(ch < prev) 
                {
                    ans++;
                    break;
                }
                prev = ch;
            }
        }
        return ans;       
    }
}
}
