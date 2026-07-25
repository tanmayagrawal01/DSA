class Solution {
    public int maxProduct(int n) {
        int max=0,smax=0;
        while(n!=0){
            int a=n%10;
            if(a>=max){
                smax=max;
                max=a;
            }else if(a>smax){
                smax=a;
            }
            n/=10;
        }
        return max*smax;
    }
}