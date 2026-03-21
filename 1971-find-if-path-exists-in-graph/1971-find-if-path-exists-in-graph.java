class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int edge[]:edges){
            int a=edge[0];
            int b=edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        boolean visited[]=new boolean[n];
        Queue<Integer>q=new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int curr=q.poll();
            if(curr==destination) return true;
            if(visited[curr]) continue;
            for(int i:graph.get(curr)) q.add(i);
            visited[curr]=true;
        }
        return false;
    }
}