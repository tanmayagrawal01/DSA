class Solution {
    public int bitwiseComplement(int n) {
        int i=0;
        int ans=0;
        if(n==0) return 1;
        while(n>0){
            int a=n&1;
            n>>=1;
            if(a==0) ans|=(1<<i);
            i++;
            System.out.println(ans);
        }
        return ans;
    }
}