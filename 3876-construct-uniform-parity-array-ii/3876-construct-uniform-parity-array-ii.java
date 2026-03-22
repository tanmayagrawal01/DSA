class Solution {
    public boolean uniformArray(int[] nums1) {
        int cnt1=0,cnt2=0,min=-1,max=-1;
        for(int i: nums1){
            if(i%2==0) cnt1++;
            else {
                cnt2++;
                if(min==-1)min=i;
                min=Math.min(min,i);
                max=Math.max(max,i);
            }
        }
        if(cnt1==nums1.length ||cnt2==nums1.length ) return true;
        for(int i:nums1){
            if(i%2==0){
                if(i-min <=0 && i-max <=0) return false;
            }
        }
        return true;
    }
}