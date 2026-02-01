class Solution {
    public int minimumCost(int[] nums) {
        int smt = 51;
        int smt2 = 51;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<smt){
                smt2 = smt;
                smt = nums[i];
            }
            else if(nums[i]>=smt&&nums[i]<smt2){
                smt2 = nums[i];
            }
        }
        return nums[0]+smt+smt2;
    }
}