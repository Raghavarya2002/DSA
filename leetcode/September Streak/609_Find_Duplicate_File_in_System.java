class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();

        // index of the key string in the linkedlist
        int index = 0;
        for(String str:paths){
            String[] strs = str.split(" ");
            for(int i = 1;i < strs.length;i++){
                // find the content
                String key = strs[i].substring(strs[i].indexOf("(") + 1, 
                strs[i].indexOf(")"));
                
                // if it is a new content(key string), put it into map and set a new list in list array
                if(!map.containsKey(key)){
                    map.put(key, index);
                    index++;
                    res.add(new LinkedList<String>());
                }
                
                // add the content to list
                res.get(map.get(key)).add(strs[0]+"/"+strs[i].substring(0, strs[i].indexOf("(")));
            }
        }

        for(int i = res.size() - 1;i >= 0;i--){
            if(res.get(i).size() < 2){
                res.remove(i);
            }
        }

        return res;
    }
}
