class EventManager {
    PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
        if(a[1]==b[1]) return a[0]-b[0];
        return b[1]-a[1];
    });
    HashMap<Integer,Integer>map=new HashMap<>();
    public EventManager(int[][] events) {
        for(int event[]:events){
            pq.offer(event);
            map.put(event[0],event[1]);
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        pq.offer(new int[]{eventId,newPriority});
        map.put(eventId,newPriority);
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()){
            int[] a=pq.poll();
            if(!map.containsKey(a[0]) || map.get(a[0])!=a[1]) continue;
            map.remove(a[0]);
            return a[0];
        }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */