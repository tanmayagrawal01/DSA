class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0,r=0,n=moves.length();
        for(char i:moves.toCharArray()){
            if(i=='L') l++;
            else if(i=='R') r++;
        }
        int left=n-l-r;
        return l>r ? l+left-r : r+left-l;
    }
}