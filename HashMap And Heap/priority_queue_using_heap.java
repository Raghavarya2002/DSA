// Heap Order Property : jaise priority queue me smallest no. ki high priority hoti h toh yaha bhi jo parent node hai vo smallest hona chahiye apne children node se, toh jo root hai vo sabse high priority vala hai toh isse hume peek mil jaayega joki O(1) complexity ka hoga

// Complete Binary Tree : yaa toh saare level pure bhare hue chahiye yaa phir , h-1 level pure bhare hone chahiye or jo aakhiri level hai vo left se right fill krna start krega , beech me kahi pe bhi element add nahi kar skte only left to right , so it is complete binary tree , so iski help se hum add or remove function priority queue ka O(log n) complexity me kar paayenge , nhi toh vaise other approach se n^2 complexity aati hai .

// Complete binary tree ki vajah se ->height of tree will be log n -> and index vale formulae owner/implement ho gye ->  ArrayList vali implementation ho paayi -> and child se parent tak jaane ki capability achieve ki -> and through this we can write our UPHEAPIFY CODE -> and iski vajah se add logn me ho paaya

// Index vale formulae :- lci = 2pi + 1 // left child index
//                        rci = 2pi + 2 // right child index
//                        pi = (ci -1)/2 //parent index
                       
// 1. You are required to complete the code of our Priority Queue class using the heap data structure.
// 2. Here is the list of functions that you are supposed to complete:
//     2.1. add -> Should accept new data.
//     2.2. remove -> Should remove and return smallest value, if available or print 
//      "Underflow" otherwise and return -1.
//      2.3. peek -> Should return smallest value, if available or print "Underflow" 
//      otherwise and return -1.
//      2.4. size -> Should return the number of elements available.                       
                       
import java.io.*;
import java.util.*;

public class Main {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
      data.add(val);
      upheapify(data.size() -1);
    }
    
    private void upheapify(int idx){
        if(idx == 0){
            return;
        }
        
        int pi = (idx-1)/2;
        
        if(data.get(idx) < data.get(pi)){
            swap(idx,pi);
            upheapify(pi);
        } 
    }
    
    private void swap(int i , int j){
        int ith = data.get(i);
        int jth = data.get(j);
        data.set(i,jth);
        data.set(j,ith);
    }

    public int remove() {
           if(this.size() == 0){
         System.out.println("Underflow");
         return -1;
     }
     
     //
     
     swap(0,data.size()-1);
     int val = data.remove(data.size()-1);
     downheapify(0);
     return val;
    }
    
    private void downheapify(int pi){
        int minidx = pi;
        int li = 2 * pi + 1;
        if(li < data.size() && data.get(li) < data.get(minidx)){
            minidx = li;
        }
        
        int ri = 2 * pi + 2;
        if(ri < data.size() && data.get(ri) < data.get(minidx)){
            minidx = ri;
        }
        
        if(minidx != pi){
            swap(pi,minidx);
            downheapify(minidx);
        }
    }

    public int peek() {
     if(this.size() == 0){
         System.out.println("Underflow");
         return -1;
     }
     
     return data.get(0);
    }

    public int size() {
      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}                       
