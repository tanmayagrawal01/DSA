class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int cnt1[]=new int[n];
        int cnt2[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    cnt1[i]++;
                    cnt2[j]++;
                }
            }
        }
        int occ=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && cnt1[i]==1 && cnt2[j]==1) occ++;
            }
        }
        return occ;
    }
}
