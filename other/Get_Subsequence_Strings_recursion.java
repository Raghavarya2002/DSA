// 1. You are given a string str.
// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
// Use sample input and output to take idea about subsequences.


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> result = gss(str);
        System.out.println(result);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> baseresult= new ArrayList<>();
            baseresult.add("");
            return baseresult;
        }
        char ch = str.charAt(0);
        String restofstring = str.substring(1);
        ArrayList<String> recursionresult = gss(restofstring);

        ArrayList<String> myresult = new ArrayList<>();
        for(String rsionresult : recursionresult){
            myresult.add(rsionresult);
        }
        for(String rsionresult : recursionresult){
            myresult.add(ch  + rsionresult);
        }
        return myresult;
    }

}
