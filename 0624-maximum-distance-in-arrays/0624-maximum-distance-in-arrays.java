class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,ans=Integer.MIN_VALUE;
        for(List<Integer>l:arrays){
            if(min!=Integer.MAX_VALUE) ans=Math.max(ans,max-l.get(0));
            if(max!=Integer.MIN_VALUE) ans=Math.max(ans,l.get(l.size()-1)-min);
            min=Math.min(min,l.get(0));
            max=Math.max(max,l.get(l.size()-1));
        }
        return ans;
    }
}