class Solution {
    int cnt=0;
    public int findTargetSumWays(int[] nums, int target) {
        solve(nums,target,0,0);
        return cnt;
    }
    public void solve(int nums[],int target,int i,int sum){
        if(i==nums.length){
            if(sum==target) cnt++;
            return;
        }
        solve(nums,target,i+1,sum+nums[i]);
        solve(nums,target,i+1,sum-nums[i]);
    }
}