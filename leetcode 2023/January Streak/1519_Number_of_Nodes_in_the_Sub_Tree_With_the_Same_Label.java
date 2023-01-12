//TC: O(n+m)
//SC: O(n+m)
class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        int[] count = new int[n];
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        dfs(0, -1, graph, labels, count);
        return count;
    }
    private int[] dfs(int currentNode, int parentNode, ArrayList<Integer>[] graph, String labels, int[] count){
        int[] countArray = new int[26];
        for(int childNode: graph[currentNode]){
            if(childNode != parentNode){
                int[] res = dfs(childNode, currentNode, graph, labels, count);
                for(int i = 0; i < res.length; i++){
                    countArray[i] += res[i];
                }
            }
        }
        count[currentNode] = ++countArray[labels.charAt(currentNode) - 'a'];
        return countArray;
    }
}
