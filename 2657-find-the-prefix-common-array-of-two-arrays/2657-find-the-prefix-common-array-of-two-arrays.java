class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        boolean visited[]=new boolean[A.length+1];
        int cnt=0;
        int ans[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(visited[A[i]])cnt++;
            if(visited[B[i]])cnt++;
            else if(A[i]==B[i]) cnt++;
            visited[A[i]]=true;
            visited[B[i]]=true;
            ans[i]=cnt;
        }
        return ans;
    }
}