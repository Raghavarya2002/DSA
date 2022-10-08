// 1. You are given a string str.
// 2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str,"");

    }

    public static void printPermutations(String str, String asf) {
        
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            String leftstr = str.substring(0,i);
            String rightstr = str.substring(i+1);
            String ros = leftstr+rightstr;
            printPermutations(ros,asf+ch);
        }


    }

}
