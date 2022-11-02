class Solution {
    char[] arr = {'A','C','G','T'};
    public int minMutation(String start, String end, String[] bank) {
        StringBuilder st = new StringBuilder(start);
        StringBuilder ed = new StringBuilder(end);
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> seen = new HashSet<>();
        seen.add(start);
        map.put(start,0);

        for(String str: bank){
            map.put(str, 0);
        }

        int ans = f(st, ed, map, seen);

        return (ans==Integer.MAX_VALUE)?-1 :ans;
    }

    public int f(StringBuilder start, StringBuilder end, HashMap<String , Integer> map, HashSet<String> seen){


        if(start.toString().equals(end.toString())){
            return 0;
        }

        int min = Integer.MAX_VALUE;

            for(int i=0;i<8;i++){
                for(int j=0;j<arr.length;j++){
                    char ch = arr[j];        
                    // System.out.print(start+"  '");
                    char temp = start.charAt(i);
                    start.setCharAt(i, ch);
                    String newStart = start.toString();
                    
                    // System.out.println(start);
                    if(!seen.contains(newStart) && map.containsKey(newStart)){//explore only if it is valid gene
                           seen.add(newStart);
                            min = Math.min(min, f(start, end, map, seen));
                            seen.remove(newStart);
                    }
                    
                    start.setCharAt(i, temp);
            }
            
        }

        if(min==Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        } else {
            return min+1;
        }
    }
}
