import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean isPallindrome(String s){
        for(int i =0;i<s.length();){
            for(int j = s.length()-1;j>=0;){
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }

	public static void solution(String str){
		for(int i =0;i<str.length();i++){
		    for(int j = i+1;j<=str.length();j++){
		        String ss=str.substring(i,j);
		        if(isPallindrome(ss)==true){
		            System.out.println(ss);
		        }
		    }
		}	
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}
