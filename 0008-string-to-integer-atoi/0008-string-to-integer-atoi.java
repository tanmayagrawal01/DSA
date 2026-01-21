class Solution {
    public int myAtoi(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        int carry=1;
        if(i<s.length() && s.charAt(i)=='-'){
            carry=-1;
            i++;
            if(i>=s.length() || s.charAt(i)=='+') return 0;
        }
        if(i<s.length() && s.charAt(i)=='+'){
            i++;
            if(i>=s.length() || s.charAt(i)=='-') return 0;
        }
        while(i<s.length() && s.charAt(i)=='0') i++;
        int ans=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return (carry == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans * 10 + digit;
            i++;
        }
        return carry*ans;
    }
}