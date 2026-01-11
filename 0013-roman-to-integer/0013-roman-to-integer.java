class Solution {
    public int romanToInt(String s) {
        int arr[]=new int[26];
        arr['I'-'A']=1;
        arr['V'-'A']=5;
        arr['X'-'A']=10;
        arr['L'-'A']=50;
        arr['C'-'A']=100;
        arr['D'-'A']=500;
        arr['M'-'A']=1000;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int a=arr[ch-'A'];
            if(i<s.length()-1 && a<arr[s.charAt(i+1)-'A']){
                ans-=a;
            }else ans+=a;
        }
        return ans;
    }
}