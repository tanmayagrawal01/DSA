class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int ans[][]=new int[m][n];
        long suffix=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                ans[i][j]=(int) suffix;
                suffix=1L*(grid[i][j]*suffix)%12345;
            }
        }
        long prefix=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=(int)((ans[i][j]*prefix)%12345);
                prefix=1L*(prefix*grid[i][j])%12345;
            }
        }
        return ans;
    }
}