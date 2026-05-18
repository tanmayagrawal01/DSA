class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        char prev=s.charAt(0);
        for(char i:s.toCharArray()){
            if(Math.abs(i-prev) > 2){
                return false;
            }
            prev=i;
        }
        return true;
    }
}