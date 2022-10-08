// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone. 
// 2. The following list is the key to characters map 0 -> .; 1 -> abc 2 -> def 3 -> ghi 4 -> jkl 5 -> mno 6 -> pqrs 7 -> tu 8 -> vwx 9 -> yz



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printKPC(str,"");

    }


    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String ques, String ans) {

        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String ros = ques.substring(1);

        String codeforch = codes[ch-'0'];

        for(int i =0;i<codeforch.length();i++){
            char choption = codeforch.charAt(i);
            printKPC(ros,ans+choption);

        }
        
    }

}
