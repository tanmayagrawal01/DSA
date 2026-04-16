class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
                cnt++;
            }
            map.get(nums[i]).add(i);
        }
        int q=queries.length;
        List<Integer>res=new ArrayList<>();
        if(cnt==n){
            for(int i=0;i<q;i++) res.add(-1);
            return res;
        }
        for (int i : queries) {
            List<Integer> list = map.get(nums[i]);
            if (list.size() == 1) {
                res.add(-1);
                continue;
            }
            int pos = Collections.binarySearch(list, i);
            int left = list.get((pos - 1 + list.size()) % list.size());
            int right = list.get((pos + 1) % list.size());
            int dist1 = Math.abs(i - left);
            int dist2 = Math.abs(i - right);
            dist1 = Math.min(dist1, n - dist1);
            dist2 = Math.min(dist2, n - dist2);
            res.add(Math.min(dist1, dist2));
        }
        return res;
    }
}