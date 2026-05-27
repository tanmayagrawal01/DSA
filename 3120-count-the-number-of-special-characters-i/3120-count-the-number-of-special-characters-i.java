class Solution {
    public int numberOfSpecialChars(String word) {
        boolean duplicate[]=new boolean[256];
        for(char i:word.toCharArray()){
            duplicate[i]=true;
        }
        int cnt=0;
        for(int i=65;i<=90;i++){
            if(duplicate[i]==true && duplicate[i+32]==true) cnt++;
        }
        return cnt;
    }
}