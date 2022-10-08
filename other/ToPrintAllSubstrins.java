import java.io.*;
import java.util.*;

public class Main {

public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
		String str = "abcd";
			for(int i= 0;i<str.length();i++){
		    for(int j=i+1;j<=str.length();j++){
		        System.out.println(str.substring(i,j));
		    }
		} 
		
	}

}
