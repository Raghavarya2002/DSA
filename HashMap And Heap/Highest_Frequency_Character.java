// 1. You are given a string str.
// 2. You are required to find the character with maximum frequency.

//   Input: 
// zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc

// Approach:
// We iterate through every character of the string and subsequently increase the count against it.


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        HashMap<Character , Integer> hm = new HashMap<>();
        
        for(int i =0;i< str.length();i++){
            char ch = str.charAt(i);
            
            if(hm.containsKey(ch)){
                    int oldf = hm.get(ch);
                    int newf = oldf + 1;
                    hm.put(ch,newf);
            }else{
                hm.put(ch,1);
            }
        }
        
        
        char maxfreqchar = str.charAt(0);
        
        for(Character key : hm.keySet()){
            if(hm.get(key) > hm.get(maxfreqchar)){
                maxfreqchar = key;
            }
        }
        
        System.out.println(maxfreqchar);
    }

}
