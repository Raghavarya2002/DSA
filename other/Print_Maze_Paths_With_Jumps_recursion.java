// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
// 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePaths(1,1,n,m,"");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        //for horizontal moves
        for(int ms = 1;ms <= dc-sc;ms++){
            printMazePaths(sr,sc+ms,dr,dc,psf + "h" + ms);
        }

         //for vertical moves
        for(int ms = 1;ms <= dr-sr;ms++){
            printMazePaths(sr+ms,sc,dr,dc,psf +"v" + ms);
        }

        //for diagonal moves
        for(int ms = 1;ms <= dr-sr && ms <= dc-sc;ms++){
            printMazePaths(sr+ms,sc+ms,dr,dc,psf +"d" + ms);
        }

    }

}
