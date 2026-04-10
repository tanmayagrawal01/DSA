class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        if(n < 3){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int j=i+1;j<n;j++){
                if(map.containsKey(nums[i]) && nums[i]==nums[j]){
                    min=Math.min(min,Math.abs(i-map.get(nums[i]))+Math.abs(map.get(nums[i])-j)+Math.abs(j-i));
                }
                map.put(nums[j],j);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}