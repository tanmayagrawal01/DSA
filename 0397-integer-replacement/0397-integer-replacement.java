class Solution {    
    public int integerReplacement(int n) {
        long num=n;
        int ans=0;
        while(num!=1) {
            if(num%2==0){
                num /= 2;
            }else if(num==3 || ((num>>1)&1)==0){
                num--;
            }else{
                num++;
            }
            ans++;
        }
        return ans;
    }
}