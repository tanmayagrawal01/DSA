class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long>st=new Stack<>();
        for(int i:nums){
            long a=(long)i;
            while(!st.isEmpty() && st.peek()==((long)(a))){
                st.pop();
                a*=2;
            }
            st.push(a);
        }
        List<Long>l=new ArrayList<>(st);
        return l;
    }
}