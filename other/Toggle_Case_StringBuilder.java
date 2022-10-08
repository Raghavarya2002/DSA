import java.io.*;
import java.util.*;

public class Main {
public static String toggleCase(String str){
		StringBuilder sc = new StringBuilder(str);
		for(int i =0;i<sc.length();i++){
		    char ch = sc.charAt(i);
		    if(ch>='a'&&ch<='z'){
		        char uc = (char)('A'+ch-'a');
		        sc.setCharAt(i,uc);
		    }
		    else if(ch>='A'&&ch<='Z'){
		        char lc = (char)('a'+ch-'A');
		        sc.setCharAt(i,lc);
		        
		    }
		}

		return sc.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
