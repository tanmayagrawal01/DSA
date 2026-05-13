class Solution {
    public int alternateDigitSum(int n) {
        int sum=0,l=0;
        while(n>0){
            int rem=n%10;
            if((l&1)==1){
                sum-=rem;
            }else sum+=rem;
            l++;
            n/=10;
        }
        return l%2==0? -sum :sum;
    }
}