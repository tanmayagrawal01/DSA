class Solution {
    public int rev(int x){
        int num=0;
        while(x>0){
            num=(num*10 + x%10);
            x/=10;
        }
        return num;
    }
    public boolean isprime(int n){
        if(n <= 1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int reverse=rev(n);
        int min=Math.min(reverse,n);
        int max=Math.max(reverse,n);
        int sum=0;
        for(int i=min;i<=max;i++){
            if(isprime(i)) sum+=i;
        }
        return sum;
    }
}