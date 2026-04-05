class Solution {
    public void helper(String s,int i,List<String>res,char arr[]){
        if(i==s.length()){
            res.add(new String(arr));
            return;
        }
        if(!Character.isDigit(s.charAt(i))){
            arr[i]=Character.toLowerCase(s.charAt(i));
            helper(s,i+1,res,arr);
            arr[i]=Character.toUpperCase(s.charAt(i));
            helper(s,i+1,res,arr);
        }else{
            helper(s,i+1,res,arr);
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String>res=new ArrayList<>();
        helper(s,0,res,s.toCharArray());
        return res;
    }
}