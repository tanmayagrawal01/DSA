class Solution {
    public void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void helper(int i,int nums[],List<List<Integer>>ans,List<Integer>arr){
        if(i==nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int j=i;j<nums.length;j++){
            arr.add(nums[j]);
            swap(nums,i,j);
            helper(i+1,nums,ans,arr);
            swap(nums,i,j);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        helper(0,nums,ans,new ArrayList<>());
        return ans;
    }
}