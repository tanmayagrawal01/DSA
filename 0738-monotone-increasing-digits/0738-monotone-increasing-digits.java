class Solution {
    public int monotoneIncreasingDigits(int n) {
        char str[]=String.valueOf(n).toCharArray();
        int l=str.length;
        int f=l;
        for(int i=l-1;i>=1;i--){
            if(str[i-1]>str[i]){
                str[i-1]-=1;
                f=i;
            }
        }
        for(int i=f;i<l;i++){
            str[i]='9';
        }
        return Integer.valueOf(new String(str));
    }
}