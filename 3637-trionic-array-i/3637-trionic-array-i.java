class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n==3) return false;
        int i=0;
        if(nums[0]>=nums[1]) return false;
        while(i<n-1 && nums[i]<nums[i+1]) i++;
        if(i==n-1) return false;
        while(i<n-1 && nums[i]>nums[i+1]) i++;
        if(i==n-1) return false;
        while(i<n-1 && nums[i]<nums[i+1]) i++;
        if(i==n-1) return true;
        return false;
    }
}