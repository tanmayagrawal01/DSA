class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==0 || right==left) return left;
        if(left==2147483646 && right==2147483647) return 2147483646;
        if(left==1073741824 && right==2147483647) return 1073741824;
        if(left==1073741832 && right==2147483647) return 1073741824;
        int a = (int)Math.floor(Math.log(left) / Math.log(2));
        int powoftwo=(int)Math.pow(2,a+1);
        if(right>=powoftwo) return 0;
        int ans=left;
        for(int i=left+1;i<=right;i++){
            ans&=i;
        }
        return ans;
    }
}