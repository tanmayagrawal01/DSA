class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt=0,a=0;
        for(int i:costs){
            if(a+i>coins) return cnt;
            else cnt++;
            a+=i;
        }
        return cnt;
    }
}