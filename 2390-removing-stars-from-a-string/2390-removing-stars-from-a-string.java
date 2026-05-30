class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        for(Character i:s.toCharArray()){
            if(i=='*') st.pop();
            else st.push(i);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}