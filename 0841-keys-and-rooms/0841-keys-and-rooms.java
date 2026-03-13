class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[]=new boolean[rooms.size()];
        Queue<Integer>q=new LinkedList<>();
        visited[0]=true;
        for(int i=0;i<rooms.get(0).size();i++){
            q.offer(rooms.get(0).get(i));
        }
        while(!q.isEmpty()){
            int a=q.poll();
            if(visited[a])continue;
            visited[a]=true;
            for(int i=0;i<rooms.get(a).size();i++){
                q.offer(rooms.get(a).get(i));
            }
        }
        for(boolean i:visited) if(!i)return false;
        return true;
    }
}