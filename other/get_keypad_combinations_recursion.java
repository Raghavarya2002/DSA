// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
// 2. The following list is the key to characters map :
//     0 -> .;
//     1 -> abc
//     2 -> def
//     3 -> ghi
//     4 -> jkl
//     5 -> mno
//     6 -> pqrs
//     7 -> tu
//     8 -> vwx
//     9 -> yz
// 3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
// Use sample input and output to take idea about output.



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> result = getKPC(str);
        System.out.println(result);
    }

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {

        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        
        }


        char ch = str.charAt(0);
        String restofthestring = str.substring(1);
        ArrayList<String> recursionresult= getKPC(restofthestring);
        ArrayList<String> finalresult = new ArrayList<>();

        String codeforch = codes[ch-'0'];
        for(int i =0;i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);
            for(String recursionstring:recursionresult){
                finalresult.add(chcode + recursionstring);
            }
        }

        return finalresult; 
    }

}
