class Solution {
    public int maximumSwap(int num) {
        if (num < 10)
            return num;
        int t = num;
        int n = (int) (Math.log10(num)) + 1;
        int nums[] = new int[n];
        int arr1[] = new int[n];
        int j = 1;
        while (t > 0) {
            int y = t % 10;
            t = t / 10;
            nums[n - j] = y;
            arr1[n - j] = y;
            j++;
        }
        Arrays.sort(arr1);
        for (int i = 0; i < n / 2; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[n - i - 1];
            arr1[n - i - 1] = temp;
        }
        int a = -1;
        int b = -1;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != nums[i]) {
                a = i;
                b = arr1[i];
                break;
            }
        }
        if (a == -1)
            return num;
        for (int i = n - 1; i >= a; i--) {
            if (nums[i] == b) {
                int temp = nums[a];
                nums[a] = nums[i];
                nums[i] = temp;
                int ans = 0;
                for (int k : nums) {
                    ans = ans * 10 + k;
                }
                return ans;
            }
        }
        return num;
    }
}