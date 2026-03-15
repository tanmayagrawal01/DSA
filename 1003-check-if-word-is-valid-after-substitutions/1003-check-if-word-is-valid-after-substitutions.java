class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n%3!=0) return false;
        Stack<Character>st=new Stack<>();
        for(char i:s.toCharArray()){
            while(st.size()>=3){
                char a=st.pop();
                char b=st.pop();
                char c=st.pop();
                if(a=='c' && b=='b' && c=='a') continue;
                st.push(c);
                st.push(b);
                st.push(a);
                break;
            }
            st.push(i);
        }
        if(st.size()==3){
            char a=st.pop();
            char b=st.pop();
            char c=st.pop();
            if(a=='c' && b=='b' && c=='a') return true;
            st.push(c);
            st.push(b);
            st.push(a);
        }
        return st.isEmpty();
    }
}