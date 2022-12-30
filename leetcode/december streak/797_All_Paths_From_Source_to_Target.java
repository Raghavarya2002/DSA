class Solution {
    public void dfs(int[][] graph,List<List<Integer>> result,List<Integer> path,int u){
        path.add(u);
        if(u==graph.length-1){
            result.add(new ArrayList(path));
        }
        else{
            for(int v: graph[u]){
                dfs(graph,result,path,v);
            }
        }
        path.remove(path.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(graph,result,path,0);
        return result;
    }
}
