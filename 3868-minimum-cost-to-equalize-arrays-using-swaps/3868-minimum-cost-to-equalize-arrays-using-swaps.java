class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int cnt=0;
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
                if(j<nums2.length-1 && nums2[j]==nums2[j+1]){
                    cnt++;
                    j+=2;
                }else return -1;
            }else{
                if(i<nums1.length-1 && nums1[i]==nums1[i+1]){
                    cnt++;
                    i+=2;
                }else return -1;
            }
        }
        while(i<nums1.length-1){
            if(nums1[i]==nums1[i+1]) cnt++;
            else return -1;
            i+=2;
        }
        while(j<nums2.length-1){
            if(nums2[j]==nums2[j+1]) cnt++;
            else return -1;
            j+=2;
        }
        return cnt/2;
    }
}
// 1 2 2 5 5 7 7
// 1 5 5 7 7 8 8