import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i =0;i<arr.length;i++){
          arr[i]=sc.nextInt();
          }
          displayArrReverse(arr,arr.length-1);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx  < 0){
            return;
        }
        System.out.println(arr[idx]);
        displayArrReverse(arr,idx-1);

    }

}
