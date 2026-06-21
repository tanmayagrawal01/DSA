class Solution {
    public int maxDistance(String moves) {
        int u=0,d=0,r=0,l=0,us=0;
        for(char i:moves.toCharArray()){
            if(i=='L') l++;
            else if(i=='R') r++;
            else if(i=='U') u++;
            else if(i=='D') d++;
            else us++;
        }
        int a=Math.abs(l-r+us) + Math.abs(u-d);
        int b=Math.abs(l-r-us) + Math.abs(u-d);
        int c=Math.abs(l-r) + Math.abs(u-d+us);
        int e=Math.abs(l-r) + Math.abs(u-d-us);
        return Math.max(a,Math.max(b,Math.max(c,e)));
    }
}