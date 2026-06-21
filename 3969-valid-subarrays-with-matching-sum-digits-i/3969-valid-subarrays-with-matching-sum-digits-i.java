class Solution {
    public boolean first(long n, int x) {
        int a = (int) (n / Math.pow(10, (int) Math.log10(n)));
        return a == x;
    }
    public boolean last(long n, int x) {
        return x == (n % 10);
    }
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        long[] prefix = new long[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int cnt = 0;
        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                long sum;
                if (l == 0) {
                    sum = prefix[r];
                } else {
                    sum = prefix[r] - prefix[l - 1];
                }
                if (first(sum, x) && last(sum, x)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}