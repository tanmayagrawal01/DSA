class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i[]:roads){
            int u=i[0];
            int v=i[1];
            map.put(u,map.getOrDefault(u,0)+1);
            map.put(v,map.getOrDefault(v,0)+1);
        }
        int size=map.size();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=i;
            arr[i][1]=map.getOrDefault(i,0);
        }
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        int sorted[]=new int[n];
        int j=1;
        for(int i[]:arr){
            sorted[i[0]]=j++;
        }
        for(int i[]:roads){
            ans+=sorted[i[0]];
            ans+=sorted[i[1]];
        }
        return ans;
    }
}