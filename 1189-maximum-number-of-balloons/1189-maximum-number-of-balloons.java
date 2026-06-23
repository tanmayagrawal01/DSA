class Solution {
    public int maxNumberOfBalloons(String text) {
        int cnt[]=new int[26];
        for(char i:text.toCharArray()){
            cnt[i-'a']++;
        }
        return Math.min(cnt['b'-'a'],Math.min(cnt[0],Math.min(cnt['l'-'a']/2,Math.min(cnt['o'-'a']/2,cnt['n'-'a']))));
    }
}