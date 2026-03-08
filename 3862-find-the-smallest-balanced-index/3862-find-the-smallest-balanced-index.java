class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n=nums.length;
        long total=0;
        long pro=1;
        for(int i:nums){
            total+=i;
        }
        int min=-1;
        for(int i=n-1;i>=0;i--){
            total-=nums[i];
            if(pro==total) return i;
            if(nums[i] > 0 && pro>Long.MAX_VALUE/nums[i]) pro=Long.MAX_VALUE;
            else pro*=nums[i];
        }
        return -1;
    }
}