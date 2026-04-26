class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n%2!=0) return false;
        char stack[]=new char[n];
        int top=-1;
        for(char i:s.toCharArray()){
            if(i=='(' || i=='{' || i=='['){
                stack[++top]=i;
            }else{
                if(top==-1)return false;
                if((stack[top]=='(' && i!=')')||(stack[top]=='[' && i!=']')||(stack[top]=='{' && i!='}')){
                    return false;
                }
                top--;
            }
        }
        return top==-1;
    }
}