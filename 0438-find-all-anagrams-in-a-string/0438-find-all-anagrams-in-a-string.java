class Solution {
    public boolean check(int hash1[],int hash2[]){
        for(int i=0;i<26;i++){
            if(hash1[i]!=hash2[i]) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>arr=new ArrayList<>();
        if(p.length()>s.length()) return arr;
        int hash1[]=new int[26];
        int hash2[]=new int[26];
        int k=p.length();
        for(int i=0;i<k;i++){
            hash1[s.charAt(i)-'a']++;
        }
        for(char i:p.toCharArray()){
            hash2[i-'a']++;
        }
        if(check(hash1,hash2)) arr.add(0);
        for(int i=k;i<s.length();i++){
            hash1[s.charAt(i-k)-'a']--;
            hash1[s.charAt(i)-'a']++;
            if(check(hash1,hash2)) arr.add(i-k+1);
        }
        return arr;
    }
}