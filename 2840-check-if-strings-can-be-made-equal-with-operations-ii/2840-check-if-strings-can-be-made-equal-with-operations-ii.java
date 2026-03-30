class Solution {
    public boolean checkStrings(String s1, String s2) {
        int freq[]=new int[26];
        int n=s1.length();
        for(int i=0;i<n;i+=2){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++) if(freq[i]!=0) return false;
        freq=new int[26];
        for(int i=1;i<n;i+=2){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++) if(freq[i]!=0) return false;
        return true;
    }
}