/*
Author: Kabir Singh Mehrok <https://github.com/KabirSinghMehrok>

Title: Least Number of Unique Integers after K Removals
Description: Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.
*/

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int N = arr.length;
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i=0; i<N; i++) h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
        
        // now make a set of values into arraylist
        // sort it in ascending order
        // sum values
        // stop when >= k
        
        ArrayList<Integer> a = new ArrayList<Integer>(h.values());
        Collections.sort(a);
        
        int sum = 0;
        int i = 0;
        for (i=0; i<a.size(); i++)
        {
            if (sum >= k) break;
            sum += a.get(i);
        }
        
        // now there can be two cases
        // if sum > k, it implies that we have taken an extra element into account
        // if sum == k, it implies we have exact amount of element
        
        if (sum > k) return a.size() - i + 1;
        if (sum == k) return a.size() - i;
        else return 0;
    }
}