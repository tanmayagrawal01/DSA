class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i:nums){
            int cnt=0;
            int s=0;
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    int a=i/j;
                    cnt++;
                    s+=j;
                    if(a!=j){
                        cnt++;
                        s+=a;
                    }
                }
                if(cnt>4) break;
            }
            if(cnt==4) sum+=s;
        }
        return sum;
    }
}