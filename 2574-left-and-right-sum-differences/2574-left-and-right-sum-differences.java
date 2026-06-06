class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int left[]=new int[n];
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        int sum=0;
        for(int i=n-1;i>=0;i--){
            res[i]=Math.abs(left[i]-sum);
            sum+=nums[i];
        }
        return res;
    }
}