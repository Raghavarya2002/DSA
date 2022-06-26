// 1. You are given a list of lists, where each list is sorted.
// 2. The function is expected to merge k sorted lists to create one sorted list.
    
// Approach:
// We will use the advantage that the given lists are sorted.
// So first of all, we pick the first element of each list and add it in a box.
// It is for sure that the smallest of these elements present in this box will be the most deserving candidate for the first position in the final list which needs to be sorted.
// So we pick the smallest element out of this box and place it at the first position in the list.
// And after that we again add an element to the box from the same list, to which the removed (smallest) element belonged.
// We repeat this step until the box is completely empty.
// And at the end, the final list will have all the elements in the sorted order.


import java.io.*;
import java.util.*;

public class Main {
    
    public static class Pair implements Comparable<Pair>{
        int li; //list index
        int di;//data index
        int val;
        
        Pair(int li,int di,int val){
            this.li = li;
            this.di = di;
            this.val = val;
        }
        
        public int compareTo(Pair o){
            return this.val - o.val;
        }
            
    }
    
    
    
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();
        
      PriorityQueue<Pair> pq = new PriorityQueue<>();
      for(int i =0; i< lists.size();i++){
          Pair p = new Pair(i,0,lists.get(i).get(0));
          pq.add(p);
      }
      
      while(pq.size() > 0){
          Pair p = pq.remove();
          rv.add(p.val);
          p.di++;
          
          if(p.di < lists.get(p.li).size()){
              p.val = lists.get(p.li).get(p.di);
              pq.add(p);
          }
          
      }

      return rv;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}
