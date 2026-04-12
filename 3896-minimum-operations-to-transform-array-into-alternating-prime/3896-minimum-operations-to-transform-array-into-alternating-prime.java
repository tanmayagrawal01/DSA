class Solution {
    public void primeno(boolean prime[]){
        prime[0]=false;
        prime[1]=false;
        int n=prime.length;
        for(int i=2;i*i<n;i++){
            if(prime[i]){
                for(int j=i*i;j<n;j+=i){
                    prime[j]=false;
                }
            }
        }
    }
    public int minOperations(int[] nums) {
        boolean prime[]=new boolean[1000001];
        Arrays.fill(prime,true);
        primeno(prime);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(i%2==0){
                while(!prime[x]){
                    ans++;
                    x++;
                }
            }else{
                while(prime[x]){
                    ans++;
                    x++;
                }
            }
        }
        return ans;
    }
}