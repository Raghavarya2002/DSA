// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
// 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> result = getMazePaths(1,1,n,m);
        System.out.println(result);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
	if(sr > dr || sc > dc){
            return new ArrayList<>();
        }

        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        
	ArrayList<String> result= new ArrayList<>();
        //horizontal moves
       for(int movesize=1; movesize <= dc-sc;movesize++){
           ArrayList<String> hpaths = getMazePaths(sr,sc+movesize,dr,dc);
           for(String hpath :hpaths){
               result.add("h"+movesize+hpath);
           }
       }   

        for(int movesize=1; movesize<=dr-sr;movesize++){
           ArrayList<String> vpaths = getMazePaths(sr+movesize,sc,dr,dc);
           for(String vpath :vpaths){
               result.add("v"+movesize+vpath);
           }
       } 

          for(int movesize=1; movesize<=dr-sr&& movesize <= dc-sc;movesize++){
           ArrayList<String> dpaths = getMazePaths(sr+movesize,sc+movesize,dr,dc);
           for(String dpath :dpaths){
               result.add("d"+movesize+dpath);
           }
       }
       return result;



    }

}
