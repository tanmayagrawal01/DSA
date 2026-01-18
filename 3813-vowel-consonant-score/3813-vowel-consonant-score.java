class Solution {
    public int vowelConsonantScore(String s) {
        int v=0,c=0;
        for(char i:s.toCharArray()){
            if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u') v++;
            else if(i==' '||Character.isDigit(i));
            else c++;
        }
        if(c==0) return 0;
        return v/c;
    }
}