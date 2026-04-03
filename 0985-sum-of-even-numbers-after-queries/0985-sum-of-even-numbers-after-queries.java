class Solution {
    public void print(int nums[]){
        for(int i:nums) System.out.print(i+" ");
        System.out.println();
    }
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum=0;
        for(int i:nums){
            if(i%2==0) sum+=i;
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int val=queries[i][0];
            int idx=queries[i][1];
            int a=nums[idx];
            if((a+val)%2==0){
                if(a%2==0 && val%2==0){
                    sum+=val;
                }else{
                    sum+=a+val;
                }
            }else{
                if(a%2==0){
                    sum-=a;
                }
            }
            ans[i]=sum;
            nums[idx]=a+val;
            // print(nums);
        }

        return ans;
    }
}