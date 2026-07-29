class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<Math.min(a.length(),b.length());i++){
            if(a.charAt(i)!=b.charAt(i)){
                return ans.toString();
            }
            ans.append(a.charAt(i));
        }
        return ans.toString();
    }
}