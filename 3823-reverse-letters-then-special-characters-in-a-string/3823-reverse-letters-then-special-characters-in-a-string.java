class Solution {
    public String reverseByType(String s) {
        int n=s.length();
        char arr[]=new char[n];
        ArrayList<Character>l1=new ArrayList<>();
        ArrayList<Character>l2=new ArrayList<>();
        for(int i=0;i<n;i++){
            char el=s.charAt(i);
            if(el>='a' && el<='z'){
                arr[i]='1';
                l1.add(el);
            }
            else{
                arr[i]='0';
                l2.add(el);
            }
        }
        int l1p=l1.size()-1;
        int l2p=l2.size()-1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(arr[i]=='1'){
                sb.append(l1.get(l1p));
                l1p--;
            }
            else{
                sb.append(l2.get(l2p));
                l2p--;
            }
        }
        return sb.toString();
    }
}