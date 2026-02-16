class Solution {
    public int countMonobit(int n) {
        if(n==0 || n==1) return n+1;
        int a=(int)(Math.log(n)/Math.log(2));
        if(n+1==((int)Math.pow(2,a+1))) return a+2;
        return  a+1;
    }
}