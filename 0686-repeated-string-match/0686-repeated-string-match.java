class Solution {
    public int repeatedStringMatch(String a, String b) {
        String str = a;
        int c = 1;
        while (str.length() < b.length()) {
            str += a;
            c++;
        }
        if (str.contains(b)) return c;
        str += a;
        if (str.contains(b)) return c + 1;
        return -1;
    }
}