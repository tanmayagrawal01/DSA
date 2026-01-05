class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i:nums){
            int cnt=0;
            int s=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    cnt++;
                    s+=j;
                }
                if(cnt>2) break;
            }
            if(cnt==2){
                sum+=(s+1+i);
            }
        }
        return sum;
    }
}