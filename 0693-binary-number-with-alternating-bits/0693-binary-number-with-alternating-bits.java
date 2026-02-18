class Solution {
    public boolean hasAlternatingBits(int n) {
        String str=Integer.toString(n,2);
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)) return false;
        }
        return true;
    }
}