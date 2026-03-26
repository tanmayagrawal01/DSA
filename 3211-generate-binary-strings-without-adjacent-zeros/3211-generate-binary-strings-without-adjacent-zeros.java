class Solution {
    public void helper(String str,int i,int n,List<String>res){
        if(i==n){
            res.add(new String(str));
            return;
        }
        if((str.length()>0 && str.charAt(i-1)!='0') || str==""){
            helper(str+"0",i+1,n,res);
        }
        helper(str+"1",i+1,n,res);
    }
    public List<String> validStrings(int n) {
        List<String>res=new ArrayList<>();
        helper("",0,n,res);
        return res;
    }
}