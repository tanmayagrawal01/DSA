class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int m = x + k, n = y + k;
        int a = m - 1;

        for (int i = x; i < x + k / 2; i++) {
            for (int j = y; j < n; j++) {
                int temp = grid[a][j];
                grid[a][j] = grid[i][j];
                grid[i][j] = temp;
            }
            a--;
        }
        return grid;
    }
}