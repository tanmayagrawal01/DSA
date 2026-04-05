class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String ans[]=s.split(" ");
        return (ans[ans.length-1]).length();
    }
}