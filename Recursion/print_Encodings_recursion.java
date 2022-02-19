// 1. You are given a string str of digits. (will never start with a 0)
// 2. You are required to encode the str as per following rules
//     1 -> a
//     2 -> b
//     3 -> c
//     ..
//     25 -> y
//     26 -> z
// 3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
// Use the input-output below to get more understanding on what is required
// 123 -> abc, aw, lc
// 993 -> iic
// 013 -> Invalid input. A string starting with 0 will not be passed.
// 103 -> jc
// 303 -> No output possible. But such a string maybe passed. In this case print nothing.



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncodings(str,"");

    }


    public static void printEncodings(String str,String ans) {
        
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        else if(str.length()==1){
            char ch = str.charAt(0);
            if(ch=='0'){
                return;
            }else{
                int chvalue = ch-'0';
                char code = (char)('a'+chvalue-1);
                
                System.out.println(ans+code);
            }
        }else{

            char ch = str.charAt(0);
            String ros = str.substring(1);

            if(ch=='0'){
                return;
            }else{
                int chvalue = ch-'0';
                char code = (char)('a'+chvalue-1);
                printEncodings(ros,ans+code);
            }

            String ch12 = str.substring(0,2);
            String ros12 = str.substring(2);
            int ch12value = Integer.parseInt(ch12);
            if(ch12value <= 26){
                
                char code = (char)('a'+ch12value-1);
                printEncodings(ros12,ans+code);
            }

        }
        
    }

}
