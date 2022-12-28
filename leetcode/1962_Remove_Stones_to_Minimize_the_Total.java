class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<piles.length;i++){
            pq.offer(piles[i]);
        }
        while(k>0){
            int x=pq.poll();
            pq.offer((x+1)/2);
            k--;
        }
        int sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
    }
}
