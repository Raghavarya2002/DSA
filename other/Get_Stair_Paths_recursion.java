// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
//   Sample Input 3
//   Sample Output [111, 12, 21, 3]


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> result = getStairPaths(n);
        System.out.println(result);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);

        ArrayList<String> finalresult = new ArrayList<>();


        for(String path : paths1){
            finalresult.add(1+path);
        }
        for(String path : paths2){
            finalresult.add(2+path);
        }
        for(String path : paths3){
            finalresult.add(3+path);
        }

        return finalresult;
    }

}
