class Solution {
    static String[] str = {
        "", "", "abc", "def", "ghi", 
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public void fun(String digits, List<String> res, int i, String curr) {
        if (i == digits.length()) {
            if (!curr.isEmpty()) {
                res.add(curr);
            }
            return;
        }

        int num = digits.charAt(i) - '0';
        String letters = str[num];

        for (char ch : letters.toCharArray()) {
            fun(digits, res, i + 1, curr + ch);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;
        
        fun(digits, res, 0, "");
        return res;
    }
}