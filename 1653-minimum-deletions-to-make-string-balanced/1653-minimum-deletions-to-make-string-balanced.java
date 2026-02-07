class Solution {
    public int minimumDeletions(String s) {
    Stack<Character> st = new Stack<>();
    int c= 0;
    for(int i = s.length()-1;i>=0;i--){
        if(s.charAt(i)=='a'){
            st.push('a');
        }
        else{
            if(st.size()>0){
                st.pop();
                c++;
            }
        }
    }
    return c;
    }
}