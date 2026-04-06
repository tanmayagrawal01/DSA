class Solution {
    public boolean judgeCircle(String moves) {
        int l=0,r=0,d=0,u=0;
        for(char i:moves.toCharArray()){
            if(i=='L')l++;
            else if(i=='R')r++;
            else if(i=='D')d++;
            else u++;
        }
        return r==l && d==u;
    }
}