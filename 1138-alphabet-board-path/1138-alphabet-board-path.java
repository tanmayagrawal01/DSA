class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder ans = new StringBuilder();
        int cr = 0, cc = 0;
        for (char ch : target.toCharArray()) {
            int tr = (ch - 'a') / 5;
            int tc = (ch - 'a') % 5;
            while (cr > tr) {
                ans.append('U');
                cr--;
            }
            while (cc > tc) {
                ans.append('L');
                cc--;
            }
            while (cr < tr) {
                ans.append('D');
                cr++;
            }
            while (cc < tc) {
                ans.append('R');
                cc++;
            }
            ans.append('!');
        }
        return ans.toString();
    }
}