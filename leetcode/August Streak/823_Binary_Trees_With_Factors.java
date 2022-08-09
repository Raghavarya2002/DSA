//TC: O(n^2) , SC: O(n)

class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        if(arr == null || arr.length == 0){
            return 0;
        }
        
        Arrays.sort(arr); //O(nlogn)
        
        Map<Integer,Long> map = new HashMap<>();
        
        for(int i =0;i< arr.length;i++){
            long count = 1l;
            for(int j =0;j<i;j++){
                if(arr[i] % arr[j] == 0 && map.containsKey(arr[i]/arr[j])){
                    count += map.get(arr[i]/arr[j]) * map.get(arr[j]);
                }
            }
            
            map.put(arr[i],count);
        }
        
        long total =0l;
        for(Map.Entry<Integer,Long> entry: map.entrySet()){
            total += entry.getValue();
            System.out.println(" k " + entry.getKey() + " V " + entry.getValue());
        }
        
        return (int)(total % (1000000000 + 7));
        
    }
}
