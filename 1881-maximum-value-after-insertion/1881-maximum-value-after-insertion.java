class Solution {
    public String maxValue(String n, int x) {
        boolean check=false;
        StringBuilder sb=new StringBuilder();
        if(n.charAt(0)=='-'){
            sb.append('-');
            for(int i=1;i<n.length();i++){
                int a=n.charAt(i)-'0';
                if(!check && a>x){
                    check=true;
                    sb.append(x);
                }
                sb.append(a);
            }
        }else{
            for(int i=0;i<n.length();i++){
                int a=n.charAt(i)-'0';
                if(!check && a<x){
                    check=true;
                    sb.append(x);
                }
                sb.append(a);
            }
        }
        if(!check) sb.append(x);
        return sb.toString();
    }
}