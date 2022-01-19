import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		StringBuilder sc = new StringBuilder();
		sc.append(str.charAt(0));
		for(int i =1;i<str.length();i++){
		    char curr = str.charAt(i);
		    char prev = str.charAt(i-1);
		    
		    int gap = curr-prev;
		    sc.append(gap);
		    sc.append(curr);
		}
		
		
		return sc.toString();
		}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
