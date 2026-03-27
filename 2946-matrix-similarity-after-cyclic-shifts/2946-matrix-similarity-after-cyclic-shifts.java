class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int grid[][]=new int[m][n];
        k%=n;
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    grid[i][j] = mat[i][(j + k) % n];
                }
            }else{
                for(int j=k;j<k+n;j++){
                    grid[i][j%n]=mat[i][j-k];
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=mat[i][j]) return false;
            }
        }
        return true;
    }
}