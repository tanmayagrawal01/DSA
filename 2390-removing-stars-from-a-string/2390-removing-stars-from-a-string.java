class Solution {
    public String removeStars(String s) {
        int cnt=0;
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='*'){
                cnt++;
            }else{
                if(cnt>0){
                    cnt--;
                    continue;
                }else{
                    sb.append(ch);
                }
            }
        }
        return sb.reverse().toString();
    }
}