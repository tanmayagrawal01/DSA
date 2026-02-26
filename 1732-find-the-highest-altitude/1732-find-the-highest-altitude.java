class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,val=0;
        for(int i:gain){
            val+=i;
            max=Math.max(max,val);
        }
        return max;
    }
}