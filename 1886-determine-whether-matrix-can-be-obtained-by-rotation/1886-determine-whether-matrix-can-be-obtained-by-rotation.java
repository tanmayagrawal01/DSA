class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        boolean check=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[j][n-i-1]){
                    check=false;
                    break;
                }
            }
            if(!check) break;
        }
        if(check) return true;
        check=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[n-i-1][n-j-1]){
                    check=false;
                    break;
                }
            }
            if(!check) break;
        }
        if(check) return true;
        check=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[n-j-1][i]){
                    check=false;
                    break;
                }
            }
            if(!check) break;
        }
        if(check) return true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) if(mat[i][j]!=target[i][j]) return false;
        }
        return true;
    }
}