class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        if(n==0) return sum;
        String num=String.valueOf(n).replace("0","");
        while(n>0){
            sum+=n%10;
            n/=10;

        }
        return sum*(long) Integer.parseInt(num);
    }
}