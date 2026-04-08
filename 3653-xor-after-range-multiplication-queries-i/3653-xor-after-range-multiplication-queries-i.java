class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod=(int)(1e9) +7;
        for(int []query:queries){
            int l=query[0];
            int r=query[1];
            int k=query[2];
            int v=query[3];
            for(int i=l;i<=r;i+=k){
                nums[i] = (int)(((long)nums[i] * v) % mod);
            }
        }
        int xor=0;
        for(int i:nums){
            xor^=i;
        }
        return xor;
    }
}