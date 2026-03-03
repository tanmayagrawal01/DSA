class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(char i:n.toCharArray()){
            int a=i-'0';
            max=Math.max(a,max);
        }
        return max;
    }
}