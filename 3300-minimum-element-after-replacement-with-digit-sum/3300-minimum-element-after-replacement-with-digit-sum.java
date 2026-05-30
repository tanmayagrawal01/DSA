class Solution {
    public int single(int n){
        int sum=0;
        while(n>9){
            sum+=n%10;
            n/=10;
        }
        return sum+n;
    }
    public int minElement(int[] nums) {
        int min=nums[0];
        for(int i:nums){
            min=Math.min(min,single(i));
        }
        return min;
    }
}