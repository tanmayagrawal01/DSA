class Solution {
    public void dfs(List<List<Integer>>res,List<Integer>l,int nod,boolean visited[],int graph[][]){
        if(nod==graph.length-1){
            l.add(nod);
            res.add(new ArrayList<>(l));
            return;
        }
        if(visited[nod])return;
        visited[nod]=true;
        l.add(nod);
        for(int n:graph[nod]){
            dfs(res,l,n,visited,graph);
            l.remove(l.size()-1);
        }
        visited[nod]=false;
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>res=new ArrayList<>();
        int n=graph.length;
        List<Integer>l=new ArrayList<>();
        boolean visited[]=new boolean[n];
        dfs(res,l,0,visited,graph);
        return res;
    }
}