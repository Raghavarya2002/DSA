class Solution {
    public String reverseWords(String s) {
        //convert the strinng into character Array
        
        char[] ch = s.toCharArray();
        int start = 0, end = 0;
        for(;end <= ch.length; end++){
            //when 'end' reaches a ' ' character, reverse the word  from 'start' to 'end' -1 index in ch
            if(end == ch.length || ch[end] == ' '){
                reverse(ch,start,end-1);
                start = end+1;
            }
        }
        
       return new String(ch);
    }
    
    public void reverse(char[] ch , int start , int end){
        
        while(start < end){
            char temp = ch[end];
            ch[end] = ch[start];
            ch[start] = temp;
            start++;
            end--;
        }
       
    }
}
