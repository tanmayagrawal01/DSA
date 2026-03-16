class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        long ans=0;
        int n=nums.length;
        int max=nums[0];
        for(int i=0;i<n;++i){
            max=Math.max(max,nums[i]);
            int a=gcd(nums[i],max);
            nums[i]=a;
        }
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++){
            ans+=gcd(nums[i],nums[n-i-1]);
        }
        return ans;
    }
}