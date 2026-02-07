class Solution {
    public int minimumDeletions(String s) {
    int cnt=0;
    int c= 0;
    for(int i = s.length()-1;i>=0;i--){
        if(s.charAt(i)=='a'){
            cnt++;
        }
        else{
            if(cnt>0){
                cnt--;
                c++;
            }
        }
    }
    return c;
    }
}