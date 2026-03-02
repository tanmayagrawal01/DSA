class Solution {
    public String trimTrailingVowels(String s) {
        final String vowels = "aeiou";

        int last = s.length() - 1;
        while (last >= 0 && vowels.indexOf(s.charAt(last)) != -1)
            last--;

        return s.substring(0, last + 1);
    }
}