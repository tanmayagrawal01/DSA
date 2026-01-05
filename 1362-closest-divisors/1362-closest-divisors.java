class Solution {
    public int[] closestDivisors(int num) {
        int num1=num+1;
        int num2=num+2;
        int ans1[]=check(num1);
        int ans2[]=check(num2);
        return Math.abs(ans1[0]-ans1[1]) > Math.abs(ans2[0]-ans2[1]) ? ans2 : ans1;
    }
    public int[] check(int num){
        int ans[]=new int[2];
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                ans[0]=i;
                ans[1]=num/i;
            }
        }
        return ans;
    }
}