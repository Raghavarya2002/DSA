class Solution {
    public String convert(String s, int numRows) {
        //Define StringBuilders
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0;i < numRows;i++){
            sb[i] = new StringBuilder();
        }
        
        //Define Variables
        char[] arr = s.toCharArray();
        int n = arr.length;
        int index = 0;
        
        //Traverse Zig-zag
        while(index < n){
            //go down
            for(int j =0;j< numRows && index < n;j++){
                sb[j].append(arr[index++]);
            }
            
            //go up before start
            
            for(int j = numRows-2; j > 0 && index < n; j--){
                sb[j].append(arr[index++]);
            }
        }
        
        //combine all stringbuilders into one
        StringBuilder res = sb[0];
        for(int i =1;i<numRows;i++){
            res.append(sb[i].toString());
        }
        
        return res.toString();
        
    }
}
