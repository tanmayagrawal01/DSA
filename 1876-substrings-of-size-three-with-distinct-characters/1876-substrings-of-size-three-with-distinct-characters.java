class Solution {
    public int countGoodSubstrings(String s) {
        int left=0,cnt=0;
        int seen[]=new int[26];
        for(int right=0;right<s.length();right++){
            while(left<right && (right-left >= 3 || seen[s.charAt(right)-'a']>=1)){
                seen[s.charAt(left)-'a']--;
                left++;
            }
            seen[s.charAt(right)-'a']++;
            if(right-left==2) cnt++;
        }
        return cnt;
    }
}