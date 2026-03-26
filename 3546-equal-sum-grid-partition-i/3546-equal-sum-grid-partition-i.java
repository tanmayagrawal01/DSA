class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int rows[]=new int[grid.length];
        int cols[]=new int[grid[0].length];
        long total=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                rows[i]+=grid[i][j];
                cols[j]+=grid[i][j];
                total+=grid[i][j];
            }
        }
        if(total%2!=0) return false;
        long r=0;
        for(int i=0;i<rows.length;i++){
            r+=rows[i];
            if((total-r)==r) return true;
        }
        long c=0;
        for(int i=0;i<cols.length;i++){
            c+=cols[i];
            if((total-c)==c) return true;
        }
        return false;
    }
}