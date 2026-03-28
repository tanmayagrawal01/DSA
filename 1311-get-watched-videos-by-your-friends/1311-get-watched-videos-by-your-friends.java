class Solution {
    class Pair{
        String s;
        int freq;
        Pair(String s,int freq){
            this.s=s;
            this.freq=freq;
        }
    }
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        Queue<Integer>q=new LinkedList<>();
        HashSet<Integer>visited=new HashSet<>();
        int currlevel=0;
        q.offer(id);
        visited.add(id);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int curr=q.poll();
                for(int j:friends[curr]){
                    if(!visited.contains(j)){
                        q.offer(j);
                        visited.add(j);
                    }
                }
            }
            currlevel++;
            if(currlevel==level){
                break;
            }
        }
        HashMap<String,Integer>map=new HashMap<>();
        while(!q.isEmpty()){
            int curr=q.poll();
            for(String i:watchedVideos.get(curr)){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        List<Pair>list=new ArrayList<>();
        for(String i:map.keySet()){
            list.add(new Pair(i,map.get(i)));
        }
        Collections.sort(list,(a,b)->{
            if(a.freq==b.freq) return a.s.compareTo(b.s);
            return a.freq-b.freq;
        });
        List<String>res=new ArrayList<>();
        for(Pair i:list){
            res.add(i.s);
        }
        return res;
    }
} 